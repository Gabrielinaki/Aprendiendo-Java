import java.util.Scanner;

public class MayorOcurrenciaArreglo {
    public static void main(String[] args) {
//       int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // arreglo de ejemplo
        int[] arreglo = new int[10];
        int ocurrencias = 0, elemento = 0;
        Scanner scann = new Scanner(System.in);

        System.out.println("ingrese 10 elementos (enteros en el rango de 1 a 9): ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("-Ingrese un número: ");
            arreglo[i] = scann.nextInt();
        }

        for (int i = 0; i < arreglo.length; i++) {
            int count = 0, num = 0;
            for (int j = 1; j < arreglo.length; j++) {
                if(arreglo[i] == arreglo[j]){
                    num = arreglo[i];
                    count++;
                }
            }
            if(ocurrencias<count){
                ocurrencias = count;
                elemento = num;
            }
        }

        if(ocurrencias>1) {
            System.out.println("la mayor ocurrencias es: " + ocurrencias);
            System.out.println("El elemento que mas se repite es: " + elemento);
        } else {
            System.out.println("No se pudo hallar ningún elemento repetido");
        }
    }
}
