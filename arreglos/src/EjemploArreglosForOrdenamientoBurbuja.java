import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {
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

    public static void sortBurbuja(Object[] arreglo){
        int count = arreglo.length;

        int iteraciones = 0;

        for (int i = 0; i < arreglo.length -1; i++) {

            for (int j = 0; j < count - 1 - i; j++) {
                if ( ((Comparable)arreglo[j+1]).compareTo(arreglo[j]) < 0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                iteraciones++;
            }
        }
        System.out.println("iteraciones = " + iteraciones);
    }
    public static void main(String[] args) {
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta Generación", "Bicicleta Oxford"};

        int count = productos.length;
        //Ordenamiento burbuja sin Optimizar.
/*        for (int i = 0; i <count ; i++) {
            for (int j = 0; j < count; j++) {
                if (productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                iteraciones++;
            }
        }*/
//        Arrays.sort(productos); // ordena los productos de la A a la Z.
//        ArregloInverso(productos); // metodo propio de ordenamiento inverso
//        Collections.reverse(Arrays.asList(productos)); // API collections de java, para ordenamiento inverso.

        sortBurbuja(productos);
        System.out.println("==== Usando for ====");
        for (int i = 0; i < count; i++) {
            System.out.println("Para indice " + i + ": " + productos[i]);
        }

        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Para indice " + i + ": " + numeros[i]);
        }
    }
}
