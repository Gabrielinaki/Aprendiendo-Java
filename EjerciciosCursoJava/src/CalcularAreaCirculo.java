import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingresar el radio del circulo");
        int radio = sc.nextInt();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo es = " + area);
    }
}
