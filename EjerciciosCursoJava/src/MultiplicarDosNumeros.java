import java.util.Scanner;

public class MultiplicarDosNumeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("ingrese el numero a multiplicar");
        int numA = s.nextInt();

        System.out.println("ingrese por cuanto lo quiere multiplicar");
        int numB = s.nextInt();

        boolean positivoA = numA > 0;
        boolean positivoB = numB > 0;

        int absolutoB = positivoB ? numB: -numB;
        int resultado = 0;

        if (numA == 0 || numB == 0){
            resultado =0;
            System.out.println("resultado = " + resultado);
        }
        else {
            for (int i = 0; i < absolutoB; i++) {

                resultado  += numA;
            }
            if ((!positivoA && !positivoB) || !positivoB){
                resultado = -resultado;
            }
            System.out.println("resultado = " + resultado);
        }
    }
}
