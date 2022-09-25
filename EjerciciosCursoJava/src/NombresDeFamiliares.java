import java.util.Scanner;

public class NombresDeFamiliares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombresFormat = "";
        int count = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese el nombre "+ count);
            String nombres = scanner.nextLine();
            nombresFormat = nombresFormat + nombres.toUpperCase().charAt(1) + "." + nombres.substring(nombres.length()-2) + " ";
            count++;
        }
        nombresFormat = nombresFormat.trim();
        String resultadoFinal = nombresFormat.replace(" ", "_");

        System.out.println(resultadoFinal);


//        System.out.println("ingrese el primer nombre");
//        String nombre1 = scanner.nextLine();
//        String nombreNuevo1 = nombre1.toUpperCase().charAt(1)+ "." + nombre1.substring(nombre1.length()-2);
//
//        System.out.println("ingrese el segundo nombre");
//        String nombre2 = scanner.nextLine();
//        String nombreNuevo2 = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2);
//
//        System.out.println("ingrese el ultimo nombre");
//        String nombre3 = scanner.nextLine();
//        String nombreNuevo3 = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2);
//
//        String resultadoFinal = nombreNuevo1 +"_" + nombreNuevo2 +"_" + nombreNuevo3;
//        System.out.println("resultadoFinal = " + resultadoFinal);

    }
}