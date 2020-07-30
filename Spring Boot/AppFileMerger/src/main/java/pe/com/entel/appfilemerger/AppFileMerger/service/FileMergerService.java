package pe.com.entel.appfilemerger.AppFileMerger.service;

import org.springframework.stereotype.Component;
import pe.com.entel.appfilemerger.AppFileMerger.util.Constant;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class FileMergerService {

    SimpleDateFormat formatterYYMMdd = new SimpleDateFormat("YYMMdd");
    SimpleDateFormat formatterddMMYYYY = new SimpleDateFormat("dd/MM/YYYY");

    public void processValidate(String codeOLD) throws Exception {
        System.out.println("INICIO " + codeOLD);

        //1. Buscar en Legados CL
        //2. Validar existencia unica en Legados
            //2.1. Existe entonces validar existencia unica en TDE
                //2.1.1 Existe entonces merge (de acuerdo a lo indicado por Andy)
                //2.1.2 No existe entonces devolver error para este caso
            //2.2. No existe entonces devolver error para este caso

        String pathLEG = Constant.RUTA_CL + Constant.FILE_SEPARATOR + codeOLD + Constant.FILE_SEPARATOR + Constant.FOLDER_LEG;
        String pathTDE = Constant.RUTA_CL + Constant.FILE_SEPARATOR + codeOLD + Constant.FILE_SEPARATOR + Constant.FOLDER_TDE;
        String pathFINAL = Constant.RUTA_CL + Constant.FILE_SEPARATOR + codeOLD + Constant.FILE_SEPARATOR + Constant.FOLDER_FINAL;

        Date date = new Date();
        String fechaHoyYYMMdd = formatterYYMMdd.format(date);
        String fechaHoyddMMYYYY = formatterddMMYYYY.format(date);
        String prefijoHoy = Constant.FILETYPE_CL + codeOLD + fechaHoyYYMMdd;

        System.out.println("pathLEG=" + pathLEG);
        System.out.println("pathTDE=" + pathTDE);
        System.out.println("pathFINAL=" + pathFINAL);
        System.out.println("fechaHoy=" + fechaHoyYYMMdd);
        System.out.println("prefijoHoy=" + prefijoHoy);

        //1. Buscar en Legados CL
        List<String> listFilesLegados = listFiles(pathLEG, prefijoHoy);

        System.out.println("Archivos Legados");
        for (String file: listFilesLegados) {
            System.out.println(file);
        }

        //2. Validar existencia unica en Legados
        if (listFilesLegados != null && !listFilesLegados.isEmpty() && listFilesLegados.size() == 1) {
            //2.1. Existe entonces validar existencia unica en TDE
            String fileLegado = listFilesLegados.get(0);
            List<String> listFilesTDE = listFiles(pathTDE, fileLegado.substring(fileLegado.lastIndexOf(Constant.FILE_SEPARATOR)+1));

            System.out.println("Archivos TDE");
            for (String fileTDE: listFilesTDE) {
                System.out.println(fileTDE);
            }

            if (listFilesTDE != null && !listFilesTDE.isEmpty() && listFilesTDE.size() == 1) {
                //2.1.1 Existe entonces merge (de acuerdo a lo indicado por Andy)
                System.out.println("HOMBRES TRABAJANDO ...");
                //TODO
            }else{
                //2.1.2 No existe entonces devolver error para este caso
                try {
                    System.out.println("[Error] Se encontraron " + listFilesTDE.size() + " archivos " + fileLegado + " en TDE para hoy " + fechaHoyddMMYYYY);
                }catch(Exception ex){
                    System.out.println("[Error] No se encontraron archivos " + fileLegado + " en TDE para hoy " + fechaHoyddMMYYYY);
                }
            }

        }else{
            //2.2. No existe entonces devolver error para este caso
            try {
                System.out.println("[Error] Se encontraron " + listFilesLegados.size() + " archivos " + prefijoHoy + " en Legados para hoy " + fechaHoyddMMYYYY);
            }catch(Exception ex){
                System.out.println("[Error] No se encontraron archivos " + prefijoHoy + " en Legados para hoy " + fechaHoyddMMYYYY);
            }
        }

        System.out.println("FINAL");
    }

    /* Obtener archivos txt de la ruta */
    public List<String> listFiles(String path, String prefijo) throws Exception {
        // With Java 8
        try (Stream<Path> walk = Files.walk(Paths.get(path), 1)) {
            return walk.map(x -> x.toString())
                    .filter(f -> f.substring(f.lastIndexOf(Constant.FILE_SEPARATOR)+1).startsWith(prefijo))
                    .filter(f -> f.endsWith(Constant.FILE_EXTENSION))
                    .filter(f -> f.substring(f.lastIndexOf(Constant.FILE_SEPARATOR)+1).length()==Constant.FILENAME_LENGTH)
                    .collect(Collectors.toList());
        }
    }

}
