import java.util.Locale;

public class HolaMundo {
    public static final String numero3 = "15";

    public static void main(String[] args){
        String saludar = "Hola mundo desde Java!";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;

        boolean valor = true;
        int numero2= 5;
        if (valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = 10;
    }
}
