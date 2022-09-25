import java.util.Scanner;

public class OrdenarArregloUltimoPrimero {
    public static void main(String[] args) {
        int[] arreglo = new int [10];
        int[] arreglo2 = new int[10];

        Scanner scann = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese un número entero:  " );
            arreglo[i] = scann.nextInt();
        }

        int aux = 0;
        for (int i = 0; i < arreglo.length -i; i++) {
            arreglo2[aux++] = arreglo[i];
            arreglo2[aux++] = arreglo[arreglo.length -1 -i];
        }

        System.out.println();
        System.out.println("Nuevo arreglo: " );
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println("arreglo = " + arreglo2[i]);
        }

    }
}
