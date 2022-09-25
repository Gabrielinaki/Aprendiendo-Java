import java.util.Scanner;

public class ImprimirUnaX {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("ingrese el tamaño de matriz que desea: ");
        int n = s.nextInt();
        String[][] matriz;
        if (n != 0){
           matriz  = new String[n][n];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {

                    if( j == matriz.length -1 - i || i == j){
                        matriz[i][j] = "x";
                    } else {
                        matriz[i][j] = "_";
                    }
                }
            }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR");
        }



    }
}
