public class SentenciaForEach {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 11, 13, 17};
        for (int num : numeros) {
            System.out.println("num = " + num);
        }
        System.out.println("----------");

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        for (String nombre : nombres) {
            System.out.println("nombre = " + nombre);
        }
    }
}
