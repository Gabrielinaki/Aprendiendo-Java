import java.util.Scanner;

public class OrdenarDosNumeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Por favor ingrese el primer número");
        int num1 = s.nextInt();

        System.out.println("Por favor ingrese el segundo número");
        int num2 = s.nextInt();

        String mayorAMenor = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;
        System.out.println("el orden es: " + mayorAMenor);
    }
}
