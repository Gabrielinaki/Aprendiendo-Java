import java.util.Scanner;

public class MenorDeMuchos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("debe ingresar la cantidad de números a comparar");
        int cantidad = s.nextInt();

        if (cantidad < 10) {
            System.out.println("Error, debe comparar al menos 10 números enteros");
        } else {
            int menor = Integer.MAX_VALUE;
            int numero;

            for (int i = 0; i < cantidad; i++) {
                System.out.println("ingrese el " + (i + 1) + " valor: ");
                numero = s.nextInt();
                menor = (numero < menor) ? numero : menor;

            }
            System.out.println("el numero menor es = " + menor);

            if (menor < 10) {
                System.out.println("El número menor es menor que 10!");
            } else {
                System.out.println(" el numero menor es igual o mayor que 10!");
            }
        }

    }
}