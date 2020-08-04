package pe.com.entel.appfilemerger.AppFileMerger;

import java.text.SimpleDateFormat;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        String headerLeg = "CL197719021901~19-02-2019 17:50:07~0000000002~1977~0000000002";
        List<String> linesHeaderLeg = new ArrayList<>();
        linesHeaderLeg.add(headerLeg);

        List<String> linesHeaderFinal = new ArrayList<>();

        Integer registryCounter=7;
        Integer appliedCounter=3;
        Date date = new Date();
        SimpleDateFormat formatterDDMMYYYYHHMMSS = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
        String todayDDMMYYYYHHMMSS = formatterDDMMYYYYHHMMSS.format(date);

        System.out.println(todayDDMMYYYYHHMMSS);
        String headerFinal = "";

        for (String lineHeaderLeg: linesHeaderLeg) {
            List<String> fieldsHeader = Arrays.asList(lineHeaderLeg.split("~"));
            writeList(fieldsHeader, "HEADER FIELDS");
            fieldsHeader.set(1, todayDDMMYYYYHHMMSS);
            fieldsHeader.set(2, String.format("%0"+"10"+"d", registryCounter));
            fieldsHeader.set(4, String.format("%0"+"10"+"d", appliedCounter));
            System.out.println("---");

            headerFinal = concat(fieldsHeader);

            writeList(fieldsHeader, "HEADER FIELDS");
            System.out.println("headerFinal="+headerFinal);
        }

        linesHeaderFinal.add(headerFinal);

        writeList(linesHeaderFinal, "HEADERS Archivo Final");
    }

    private static void writeList(List<String> list, String desc) {
        System.out.println("[writeList] " + desc);
        for (String str: list) {
            System.out.println(str);
        }
    }

    public static String concat(List<String> strs) {
        StringJoiner joiner = new StringJoiner("~");
        for (String str : strs) {
            joiner.add(str);
        }
        return joiner.toString();
    }
}
