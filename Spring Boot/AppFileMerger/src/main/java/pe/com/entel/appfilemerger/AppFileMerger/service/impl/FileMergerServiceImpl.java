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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
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
            }
        } catch(Exception ex) {
            throw ex;
        }
    }
    
    @Override
    public void processMerge(String codeOLD) throws Exception {
        logger.info("*********************************");
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

        logList(listFilesLeg, "Archivos Legados");

        if (listFilesLeg != null && !listFilesLeg.isEmpty() && listFilesLeg.size() == 1) {
            String fileLeg = listFilesLeg.get(0);
            logger.info("[processMerge] Existe 1 Legado: " + fileLeg);
            String fileNameWithExt = fileLeg.substring(fileLeg.lastIndexOf(properties.FILE_SEPARATOR)+1);
            logger.info("[processMerge] fileNameWithExt="+fileNameWithExt);
            String fileNameWithoutExt = fileNameWithExt.substring(0, fileNameWithExt.lastIndexOf(properties.FILE_EXTENSION));
            logger.info("[processMerge] fileNameWithoutExt="+fileNameWithoutExt);
            logger.info("[processMerge] Buscar en TDE " + fileNameWithExt);
            List<String> listFilesTDE = listFiles(pathTDE, fileNameWithExt);

            logList(listFilesTDE, "Archivos TDE");

            if (listFilesTDE != null && !listFilesTDE.isEmpty() && listFilesTDE.size() == 1) {
                String fileTDE = listFilesTDE.get(0);
                logger.info("[processMerge] Existe 1 TDE: " + fileTDE);

                List<String> linesHeaderLeg, linesHeaderTDE, linesDetailLeg, linesDetailTDE, linesFooterLeg, linesFooterTDE;

                linesHeaderLeg = getHeader(fileLeg, fileNameWithoutExt);
                linesDetailLeg = getDetail(fileLeg, fileNameWithoutExt, properties.FILE_FOOTER);
                linesFooterLeg = getFooter(fileLeg, properties.FILE_FOOTER);

                if (isValid(linesHeaderLeg, linesDetailLeg, linesFooterLeg)){
                    logList(linesDetailLeg, "DETALLE Archivo Legados");
                    linesHeaderTDE = getHeader(fileTDE, fileNameWithoutExt);
                    linesDetailTDE = getDetail(fileTDE, fileNameWithoutExt, properties.FILE_FOOTER);
                    linesFooterTDE = getFooter(fileTDE, properties.FILE_FOOTER);
                    if (isValid(linesHeaderTDE, linesDetailTDE, linesFooterTDE)){
                        logList(linesDetailTDE, "DETALLE Archivos TDE");
                        //TODO Recorrer archivo Legados y archivo TDE
                        logger.info("HOMBRES TRABAJANDO ...");
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

    private void logList(List<String> list, String desc) {
        logger.info("[logList] " + desc);
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