import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd' ");
        try {
            Date fecha = format.parse(sc.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format.format(fecha) = " + format.format(fecha));

            Date fechaActual = new Date();
            System.out.println("fechaActual = " + fechaActual);

            if (fecha.after(fechaActual)){
                System.out.println("fecha del usuario es después que fecha actual ");
            } else if (fecha.before(fechaActual)) {
                System.out.println("fecha del usuario es anterior que fecha actual");
            } else if (fecha.equals(fechaActual)) {
                System.out.println("fecha del usuario es igual que fecha actual");
            }

            if (fecha.compareTo(fechaActual) > 0){
                System.out.println("fecha del usuario es después que fecha actual ");
            } else if (fecha.compareTo(fechaActual) < 0) {
                System.out.println("fecha del usuario es anterior que fecha actual");
            } else if (fecha.compareTo(fechaActual) == 0) {
                System.out.println("fecha del usuario es igual que fecha actual");
            }

        } catch (ParseException e) {
            //throw new RuntimeException(e);
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.err.println("el formato debe ser 'yyyy-MM-dd'");
//            System.exit(1);
            main(args);
        }
    }
}
