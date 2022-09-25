public class PrimitivosFloat {

    public static void main(String[] args) {
        // los nros enteros en la literal se convierten en float.
        float realFloat= 1; // = 1.0;
        System.out.println("realFloat = " + realFloat );

        // si o si hay que poner la f al final, porque la literal es Double.
        realFloat = 1.0F;
        System.out.println("realFloat = " + realFloat);

        // También se utiliza la notación científica.
        realFloat = 2.12e3f;// 2120f;
        System.out.println("realFloat = " + realFloat);
        realFloat = 1.5e4f;// 15000.0
        System.out.println("realFloat = " + realFloat);

        // en el ejemplo de abajo se ve el exponente en negativo.
        realFloat = 0.00000000015f;// 1.5e-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float correspondes en byte a " + Float.BYTES);
        System.out.println("Float correspondes en bites a " + Float.SIZE);
        System.out.println("El valor máximo para Float es: " + Float.MAX_VALUE);
        System.out.println("El valor mínimo para Float es: " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double correspondes en byte a " + Double.BYTES);
        System.out.println("Double correspondes en bites a " + Double.SIZE);
        System.out.println("El valor máximo para Double es: " + Double.MAX_VALUE);
        System.out.println("El valor mínimo para Double es: " + Double.MIN_VALUE);

        System.out.println("varFlotante = " + varFlotante);
    }
    // el valor por defecto fe float y double es 0.0
    static float varFlotante;
}
