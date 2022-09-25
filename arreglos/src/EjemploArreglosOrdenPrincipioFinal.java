public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        int[] arrEnPares = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        int aux = 0;
        for (int i = 0; i < numeros.length -i; i++) {
            arrEnPares[aux++] = numeros[i];
            arrEnPares[aux++] = numeros[numeros.length-1-i];
//            System.out.print(numeros[i] + " ");
//            System.out.println( numeros[numeros.length-1 - i] );
        }
        for(int i = 0; i< arrEnPares.length; i++){
            System.out.println("arrEnPares = " + arrEnPares[i]);
        }
    }
}
