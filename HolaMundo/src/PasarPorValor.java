public class PasarPorValor {
    public static void main(String[] args) {
        Integer i = 10;
        System.out.println("iniciamos el método main con i = " + i);
        test(i);
        System.out.println("finaliza el método main con el valor de i (se mantitene igual) = " + i);
    }

    public static void test(Integer i){
        System.out.println("iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("finalizamos el método test con i = " + i);
    }
}
