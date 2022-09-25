import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public  static void ArregloInverso(String[] arreglo){
        int count = arreglo.length;
        int count2 = arreglo.length;
        for (int i = 0; i < count2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[count-1-i];
            arreglo[i] = inverso ;
            arreglo[count-1-i] = actual ;
            count2--;
        }
    }
    public static void main(String[] args) {
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta Generación", "Bicicleta Oxford"};

        Arrays.sort(productos); // ordena los productos de la A a la Z.
        ArregloInverso(productos); // metodo propio de ordenamiento inverso
//        Collections.reverse(Arrays.asList(productos)); // API collections de java, para ordenamiento inverso.


        System.out.println("==== Usando for ====");
        int count = productos.length;
        for (int i = 0; i < count; i++) {
            System.out.println("Para indice " + i + ": " + productos[i]);
        }
    }
}
