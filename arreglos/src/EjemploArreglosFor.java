import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos); // ordena los productos de la A a la Z.

        System.out.println("==== Usando for ====");
        int count = productos.length;
        for (int i = 0; i < count; i++) {
            System.out.println("Para indice" + i + ": " + productos[i]);
        }

        System.out.println("==== Usando foreach ====");
        for (String prod : productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println("==== Usando While ====");
        int i = 0;
        while ( i < count) {
            System.out.println("Para indice" + i + ": " + productos[i]);
             i++;
        }

        System.out.println("==== Usando Do While ====");
        int j = 0;
        do {
            System.out.println("Para indice" + j + ": " + productos[j]);
            j++;
        } while ( j < count);

        int[] numeros = new int[10];

        int countNumeros = numeros.length;
        for (int k = 0; k < countNumeros; k++) {
            numeros[k] = k * 3;
        }

        for (int k = 0; k < countNumeros; k++) {
            System.out.println("numeros = " + numeros[k]);
        }

    }
}
