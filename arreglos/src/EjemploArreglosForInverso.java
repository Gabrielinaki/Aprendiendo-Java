import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        /*String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";*/

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta Generación", "Bicicleta Oxford"};

        Arrays.sort(productos); // ordena los productos de la A a la Z.

        System.out.println("==== Usando for ====");
        int count = productos.length;
        for (int i = 0; i < count; i++) {
            System.out.println("Para indice " + i + ": " + productos[i]);
        }

        System.out.println("==== Usando for inverso ====");
        for (int i = 0; i < count; i++) {
            System.out.println("Para indice " + (count-1-i) + ": " + productos[count-1-i] );
        }

        System.out.println("==== Usando for inverso ====");
        for (int i = count-1; i>=0; i--){
            System.out.println("Para indice " + i + ": " + productos[i]);
        }
    }
}
