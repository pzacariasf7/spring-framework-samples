package pe.com.entel.appfilemerger.AppFileMerger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("YYMMdd");
        String fechaTexto = formatter. format(new Date());
        System.out.println(fechaTexto);
    }
}
