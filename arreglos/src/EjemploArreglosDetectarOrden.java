import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {
        int[] arreglo = new int[7];

        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese 7 números:");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = scann.nextInt();
        }
        boolean ascendente = false ;
        boolean descendente = false;
        for (int i = 0; i < arreglo.length - 1; i++) {
            if(arreglo[i] > arreglo[i+1]){
                descendente = true;
            }
            if (arreglo[i] < arreglo[i+1]){
                ascendente = true;
            }
        }
        if(ascendente == true && descendente == true){
            System.out.println(" arreglo = desordenado");
        }
        if(ascendente == false && descendente == false){
            System.out.println(" arreglo = Son todos iguales");
        }
        if(ascendente == true && descendente == false){
            System.out.println(" arreglo = ordenado de forma ascendente");
        }
        if(ascendente == false && descendente == true){
            System.out.println(" arreglo = ordenado de forma descendente");
        }
    }
}
