import java.util.Scanner;

public class ImprimirHistograma {
    public static void main(String[] args) {
        //int[] arreglo = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1}; // arreglo de ejemplo
        int[] arreglo = new int[12];
        Scanner scann = new Scanner(System.in);

        System.out.println("Ingrese 12 números enteros de rango 1 al 6: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("ingrese un número: ");
            arreglo[i] = scann.nextInt();
        }

        String[] arregloHistograma = new String[6];
        for (int i = 0; i < arregloHistograma.length; i++) {
            int aux = i + 1;
            String histograma = aux +  ": ";
            for (int j = 0; j < arreglo.length; j++) {
                if(aux == arreglo[j]){
                    histograma += "*";
                }
            }
            arregloHistograma[i] = histograma;
        }

        System.out.println();
        for (int i = 0; i < arregloHistograma.length; i++) {
            System.out.println(arregloHistograma[i]);
        }
    }
}
