import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scann = new Scanner(System.in);

        System.out.println("Ingrese Su fecha de nacimiento");
            try {
                Date fecha = formato.parse(scann.next());
                Date fechaActual = new Date();

                int cumple = Integer.parseInt(formato.format(fecha).toString().replaceAll("-", ""));
                int fechaDia = Integer.parseInt(formato.format(fechaActual).toString().replaceAll("-", ""));

                long edad = (fechaDia-cumple)/10000;
                System.out.println("Su edad es = " + edad + "años");

            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
    }
}
//    DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
//    int d1 = Integer.parseInt(formatter.format(birthday));
//    int d2 = Integer.parseInt(formatter.format(date));
//    int age = (d2-d1)/10000;
//    return age;
