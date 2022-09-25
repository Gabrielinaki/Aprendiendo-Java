import java.util.Scanner;

public class SistemaEstadisticoArreglo {
    public static void main(String[] args) {
        int[] numeros = new int[7];
        int cantPositivos = 0, cantNegativos = 0, cantCeros = 0, sumPositivos = 0, sumNegativos = 0;

        Scanner scann = new Scanner(System.in);

        System.out.println("Ingrese 7 números enteros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scann.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == 0){
                cantCeros++;
            } else if (numeros[i] > 0) {
                sumPositivos += numeros[i];
                cantPositivos++;
            } else if (numeros[i] < 0) {
                sumNegativos += numeros[i];
                cantNegativos++;
            }
        }
        if(cantPositivos == 0){
            System.out.println("No hay números positivos para calcular el promedio.");
        } else {
            System.out.println("El promedio de positivos es: " + (sumPositivos/cantPositivos));
        }

        if (cantNegativos == 0){
            System.out.println("No hay números negativos para calcular el promedio.");
        } else {
            System.out.println("El promedio de negativos es: " + (sumNegativos/cantNegativos));
        }

        if (cantCeros == 0){
            System.out.println("No hay ningún cero. ");
        } else {
            System.out.println("la suma de ceros es: " + cantCeros);
        }
    }
}
