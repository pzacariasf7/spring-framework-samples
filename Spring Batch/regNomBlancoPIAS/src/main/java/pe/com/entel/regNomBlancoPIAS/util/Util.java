package pe.com.entel.regNomBlancoPIAS.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util
{
    public static String getDate(Date fecha, String formato)
    {
        return new SimpleDateFormat(formato).format(fecha);
    }

}
