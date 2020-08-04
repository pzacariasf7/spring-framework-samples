package pe.com.entel.appfilemerger.AppFileMerger.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import pe.com.entel.appfilemerger.AppFileMerger.repository.GetCodTrxCLSP;
import pe.com.entel.appfilemerger.AppFileMerger.service.FileMergerService;
import pe.com.entel.appfilemerger.AppFileMerger.util.Properties;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class FileMergerServiceImpl implements FileMergerService {

    private static Logger logger = LoggerFactory.getLogger(FileMergerServiceImpl.class);

    @Autowired
    SimpleDateFormat formatterYYMMdd;

    @Autowired
    SimpleDateFormat formatterDDMMYYYY;
    
    @Autowired
    Properties properties;

    @Value("${ev.filemerger.dir.cl}")
    public String PATH_CL;

    @Autowired
    GetCodTrxCLSP getCodTrxCLSP;

    List<Map<String, String>> listConfig;

    @PostConstruct
    public void init() throws Exception {
        try {
            Map<String, Object> map = getCodTrxCLSP.execute();
            if (map.get("error") != null) {
                throw new Exception((String) map.get("error"));
            } else {
                listConfig = (List<Map<String, String>>) map.get("listConfig");
                logger.info("[init] Lista de " + listConfig.size() + " configuraciones cargadas correctamente");
            }
        } catch(Exception ex) {
            throw ex;
        }
    }
    
    @Override
    public void processMerge(String codeOLD) throws Exception {
        logger.info("************************************************************************************************");
        logger.info("[processMerge] codeOLD=" + codeOLD);

        String pathLEG = PATH_CL + codeOLD + properties.FILE_SEPARATOR + properties.FOLDER_LEG;
        String pathTDE = PATH_CL + codeOLD + properties.FILE_SEPARATOR + properties.FOLDER_TDE;
        String pathFINAL = PATH_CL + codeOLD + properties.FILE_SEPARATOR + properties.FOLDER_FINAL;

        Date date = new Date();
        String todayYYMMdd = formatterYYMMdd.format(date);
        String todayDDMMYYYY = formatterDDMMYYYY.format(date);
        String todayPrefix = properties.FILETYPE_CL + codeOLD + todayYYMMdd;

        logger.info("[processMerge] pathLEG=" + pathLEG);
        logger.info("[processMerge] pathTDE=" + pathTDE);
        logger.info("[processMerge] pathFINAL=" + pathFINAL);

        logger.info("[processMerge] Buscar en Legados " + todayPrefix);
        List<String> listFilesLeg = listFiles(pathLEG, todayPrefix);

        writeList(listFilesLeg, "Archivos Legados");

        if (listFilesLeg != null && !listFilesLeg.isEmpty() && listFilesLeg.size() == 1) {
            String fileLeg = listFilesLeg.get(0);
            logger.info("[processMerge] Existe 1 Legado: " + fileLeg);
            String fileNameWithExt = fileLeg.substring(fileLeg.lastIndexOf(properties.FILE_SEPARATOR)+1);
            logger.info("[processMerge] fileNameWithExt="+fileNameWithExt);
            String fileNameWithoutExt = fileNameWithExt.substring(0, fileNameWithExt.lastIndexOf(properties.FILE_EXTENSION));
            logger.info("[processMerge] fileNameWithoutExt="+fileNameWithoutExt);
            logger.info("[processMerge] Buscar en TDE " + fileNameWithExt);
            List<String> listFilesTDE = listFiles(pathTDE, fileNameWithExt);

            writeList(listFilesTDE, "Archivos TDE");

            if (listFilesTDE != null && !listFilesTDE.isEmpty() && listFilesTDE.size() == 1) {
                String fileTDE = listFilesTDE.get(0);
                logger.info("[processMerge] Existe 1 TDE: " + fileTDE);

                List<String> linesHeaderLeg, linesHeaderTDE, linesDetailLeg, linesDetailTDE, linesFooterLeg, linesFooterTDE;

                linesHeaderLeg = getHeader(fileLeg, fileNameWithoutExt);
                linesDetailLeg = getDetail(fileLeg, fileNameWithoutExt, properties.FILE_FOOTER);
                linesFooterLeg = getFooter(fileLeg, properties.FILE_FOOTER);

                if (isValid(linesHeaderLeg, linesDetailLeg, linesFooterLeg)){
                    writeList(linesDetailLeg, "DETALLE Archivo Legados");
                    linesHeaderTDE = getHeader(fileTDE, fileNameWithoutExt);
                    linesDetailTDE = getDetail(fileTDE, fileNameWithoutExt, properties.FILE_FOOTER);
                    linesFooterTDE = getFooter(fileTDE, properties.FILE_FOOTER);
                    if (isValid(linesHeaderTDE, linesDetailTDE, linesFooterTDE)) {
                        writeList(linesDetailTDE, "DETALLE Archivo TDE");

                        //Core
                        List<String> linesHeaderFinal=new ArrayList<String>();
                        List<String> linesDetailFinal=new ArrayList<String>();
                        List<String> linesFooterFinal=new ArrayList<String>();
                        boolean found;

                        logger.info("[processMerge] Iterando detalle del archivo de legados");
                        for (String lineDetailLeg : linesDetailLeg) {
                            List<String> fieldsLeg = Arrays.asList(lineDetailLeg.split(properties.FIELDS_SEPARATOR));
                            String numLeg = fieldsLeg.get(properties.PHONENUMBER_NUMPOSITION).trim();
                            found = false;
                            logger.info("[processMerge] -Iterando detalle del archivo de TDE para el número en legados " + numLeg);
                            for (String lineDetailTDE : linesDetailTDE) {
                                List<String> fieldsTDE = Arrays.asList(lineDetailTDE.split(properties.FIELDS_SEPARATOR));
                                String numTDE = fieldsTDE.get(properties.PHONENUMBER_NUMPOSITION).trim();
                                if(numLeg.equals(numTDE)) {
                                    found = true;
                                    String result = getResultByCodTrxLegTDE(fieldsLeg.get(properties.CODTRX_NUMPOSITION).trim(), fieldsTDE.get(properties.CODTRX_NUMPOSITION).trim());
                                    logger.info("[processMerge] codTrxLeg="+fieldsLeg.get(properties.CODTRX_NUMPOSITION).trim() +
                                            "; codTrxTDE="+fieldsTDE.get(properties.CODTRX_NUMPOSITION).trim() +
                                            "; result="+result);

                                    if(result.equals(properties.CONFIG_LEG)){
                                        linesDetailFinal.add(lineDetailLeg);
                                    } else if(result.equals(properties.CONFIG_TDE)){
                                        linesDetailFinal.add(lineDetailTDE);
                                    } else{
                                        throw new Exception("Configuración de código de transacción no encontrada");
                                    }
                                    break;
                                }
                            }

                            if (!found) {
                                throw new Exception("Número en Legado "+numLeg+" no se encontró en TDE");
                            }
                        }

                        for (String lineDetailTDE : linesDetailTDE) {
                            List<String> fieldsTDE = Arrays.asList(lineDetailTDE.split(properties.FIELDS_SEPARATOR));
                            String numTDE = fieldsTDE.get(1).trim();
                            found = false;
                            for (String lineDetailLeg : linesDetailLeg) {
                                List<String> fieldsLeg = Arrays.asList(lineDetailLeg.split(properties.FIELDS_SEPARATOR));
                                String numLeg = fieldsLeg.get(1).trim();
                                if(numTDE.equals(numLeg)) {
                                    found = true;
                                    break;
                                }
                            }

                            if (!found) {
                                throw new Exception("Número en TDE "+numTDE+" no se encontró en Legado");
                            }
                        }

                        writeList(linesDetailFinal, "DETALLE Archivo Final");
                        linesHeaderFinal.addAll(linesHeaderLeg);//TODO Armar Header
                        writeList(linesHeaderFinal, "HEADER Archivo Final");
                        linesFooterFinal.addAll(linesFooterLeg);

                        List<String> linesFinal=new ArrayList<>();
                        linesFinal.addAll(linesHeaderFinal);
                        linesFinal.addAll(linesDetailFinal);
                        linesFinal.addAll(linesFooterFinal);

                        createFile(pathFINAL, fileNameWithExt, linesFinal);
                        deleteFile(pathLEG, fileNameWithExt);
                        deleteFile(pathTDE, fileNameWithExt);

                    }else{
                        logger.error("[processMerge] Formato no correcto de archivo TDE " + fileTDE);
                    }
                }else{
                    logger.error("[processMerge] Formato no correcto de archivo Legado " + fileLeg);
                }

            }else{
                try {
                    logger.error("[processMerge] Se encontraron " + listFilesTDE.size() + " archivos " + fileNameWithExt + " en TDE para hoy " + todayDDMMYYYY);
                }catch(Exception ex){
                    logger.error("[processMerge] No se encontraron archivos " + fileNameWithExt + " en TDE para hoy " + todayDDMMYYYY);
                }
            }

        }else{
            try {
                logger.error("[processMerge] Se encontraron " + listFilesLeg.size() + " archivos " + todayPrefix + " en Legados para hoy " + todayDDMMYYYY);
            }catch(Exception ex){
                logger.error("[processMerge] No se encontraron archivos " + todayPrefix + " en Legados para hoy " + todayDDMMYYYY);
            }
        }
    }

    private void createFile(String path, String fileNameWithExt, List<String> lines) throws Exception {
        String destFile = "";
        try {
            destFile = path + properties.FILE_SEPARATOR + fileNameWithExt;
            Path destinationPath = Paths.get(destFile);
            logger.info("[createFile] Creando archivo " + destFile);
            Files.write(destinationPath, lines);
        } catch (IOException e) {
            logger.error("[createFile] Error: " + e.getMessage());
            throw new Exception("No se pudo crear archivo " + destFile);
        }
    }

    private void deleteFile(String path, String fileNameWithExt) throws Exception {
        String file = "";
        try {
            file = path + properties.FILE_SEPARATOR + fileNameWithExt;
            Path pathToDelete = Paths.get(file);
            logger.info("[deleteFile] Eliminando archivo " + file);
            Files.deleteIfExists(pathToDelete);
        } catch (IOException e) {
            logger.error("[deleteFile] Error: " + e.getMessage());
            throw new Exception("No se pudo eliminar archivo " + file);
        }
    }

    private String getResultByCodTrxLegTDE(String codTrxLeg, String codTrxTDE) {

        for (Map config: listConfig) {
            if(((String) config.get("CODLEG")).equals(codTrxLeg) && ((String) config.get("CODTDE")).equals(codTrxTDE)){
                return (String)config.get("RESULT");
            }
        }

        return "";
    }

    private boolean isValid(List<String> linesHeader, List<String> linesDetail, List<String> linesFooter) {
        if(linesHeader==null||linesHeader.isEmpty()||linesHeader.size()!=1){
            logger.error("Header no es correcto");
            return false;
        }
        /*
        if(linesDetail==null||linesDetail.isEmpty()||linesDetail.size()!=1){
            logger.error("Detalle no es correcto");
            return false;
        }*/
        if(linesFooter==null||linesFooter.isEmpty()||linesFooter.size()!=1){
            logger.error("Footer no es correcto");
            return false;
        }
        return true;
    }

    private List<String> listFiles(String path, String prefix) throws Exception {
        // With Java 8
        try (Stream<Path> walk = Files.walk(Paths.get(path), 1)) {
            return walk.map(x -> x.toString())
                    .filter(f -> f.substring(f.lastIndexOf(properties.FILE_SEPARATOR)+1).startsWith(prefix))
                    .filter(f -> f.endsWith(properties.FILE_EXTENSION))
                    .filter(f -> f.substring(f.lastIndexOf(properties.FILE_SEPARATOR)+1).length()== properties.FILENAME_LENGTH)
                    .collect(Collectors.toList());
        }
    }

    private void writeList(List<String> list, String desc) {
        logger.info("[writeList] " + desc);
        for (String str: list) {
            logger.info(str);
        }
    }

    private List<String> getHeader(String path, String prefix) throws Exception {
        // With Java 8
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            return stream
                    .filter(line -> line.startsWith(prefix))
                    .collect(Collectors.toList());
        }
    }

    private List<String> getFooter(String path, String prefix) throws Exception {
        // With Java 8
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            return stream
                    .filter(line -> line.startsWith(prefix))
                    .collect(Collectors.toList());
        }
    }

    private List<String> getDetail(String path, String prefixHeader, String prefixFooter) throws Exception {
        // With Java 8
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            return stream
                    .filter(line -> !line.startsWith(prefixHeader) && !line.startsWith(prefixFooter))
                    .collect(Collectors.toList());
        }
    }

}