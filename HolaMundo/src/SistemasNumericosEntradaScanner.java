import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero.");
        //String numeroStr =  scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);

        } catch (Exception e){
            System.out.println("Error debe ingresar un numero entero.");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "Numero binario de  " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHex = "numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        String mensaje = resultadoBinario;
        mensaje += '\n' + resultadoOctal;
        mensaje += '\n' + resultadoHex;

        System.out.println(mensaje);

    }
}
