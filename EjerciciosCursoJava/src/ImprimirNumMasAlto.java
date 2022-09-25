import java.util.Scanner;

public class ImprimirNumMasAlto {
    public static void main(String[] args) {
        int[] numeros = new int[7];
        Scanner scann = new Scanner(System.in);

        System.out.println("escriba 7 números del 11 al 99: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("ingrese un numero: ");
            numeros[i] = scann.nextInt();
        }
        // arreglo de ejemplo:
        //int[] numeros = {14, 33, 15, 36, 78, 21, 43};

        int max = 0;
        for (int i = 0; i < numeros.length; i++) {
            max = max> numeros[i]? max : numeros[i];
        }
        System.out.println("el numero mas alto es: " + max);
    }
}
