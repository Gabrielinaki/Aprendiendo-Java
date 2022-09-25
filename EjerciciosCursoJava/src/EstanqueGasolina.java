import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("por favor indique la medida actual de gasolina en litros");
        int cantidad = s.nextInt();

        if (cantidad == 70){
            System.out.println("Estanque lleno");
        }
        if (cantidad >= 60 && cantidad < 70) {
            System.out.println("Estanque casi lleno");
        }
        if (cantidad >= 40 && cantidad < 60) {
            System.out.println("Estanque 3/4");
        }
        if (cantidad >= 35 && cantidad < 40) {
            System.out.println("Medio Estanque");
        }
        if (cantidad >= 20 && cantidad < 35) {
            System.out.println("Suficiente");
        }
        if (cantidad >= 1 && cantidad < 20) {
            System.out.println("Insuficiente!");
        }
    }
}
