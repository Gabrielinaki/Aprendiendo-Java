import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

//        calendario.set(2018, Calendar.SEPTEMBER, 25, 18, 20, 43);
        calendario.set(Calendar.YEAR, 2022);
        calendario.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

//        calendario.set(Calendar.HOUR_OF_DAY, 16); // formato de 24hs
        calendario.set(Calendar.HOUR, 7); // formato de 12hs
        calendario.set(Calendar.AM_PM, Calendar.PM); // se le agregar el AM. o el PM.
        calendario.set(Calendar.MINUTE, 22);
        calendario.set(Calendar.SECOND, 12);
        calendario.set(Calendar.MILLISECOND, 124);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyy-mm-dd hh:mm:ss:SSS a");

        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha Con Formato = " + fechaConFormato);
    }
}
