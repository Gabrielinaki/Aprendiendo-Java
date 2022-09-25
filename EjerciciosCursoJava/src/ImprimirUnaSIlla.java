import java.util.Scanner;

public class ImprimirUnaSIlla {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("ingrese el tamaño de matriz que desea: ");
        int n = s.nextInt();
        int[][] matriz;
        if (n != 0){
           matriz  = new int[n][n];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {

                    if( j == 0 || i == matriz.length / 2  || j == matriz.length -1 && i > (n/2)){
                        matriz[i][j] = 1;
                    } else {
                        matriz[i][j] = 0;
                    }
                }
            }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR");
        }



    }
}
