import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String variable = 7 == 7 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematicas entre 2.0 - 7.0: ");
        matematicas = scanner.nextDouble();

        System.out.println("Ingrese la nota de matematicas entre 2.0 - 7.0: ");
        ciencias = scanner.nextDouble();

        System.out.println("Ingrese la nota de matematicas entre 2.0 - 7.0: ");
        historia = scanner.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);
    }
}
