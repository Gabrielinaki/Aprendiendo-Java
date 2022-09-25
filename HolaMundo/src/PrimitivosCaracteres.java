public class PrimitivosCaracteres {
    public static void main(String[] args){
        // los char abarcan del 1 al 9 y de la A a la Z.
        char caracter = '1';
        char caracterA = 'A';
        System.out.println("caracter = " + caracter);
        System.out.println("caracterA = " + caracterA);

        // se pueden expresar en valor unicode.
        char unicode = '\u0040';
        System.out.println("unicode = " + unicode);

        // otra opción es expresar en decimal.
        char decimal =64;
        System.out.println("decimal = " + decimal);

        // son equivalentes.
        System.out.println("decimal = unicode: " + (decimal == unicode));

        // los símbolos pueden ser escritos en la literal.
        char simbolo = '@';
        System.out.println("símbolo = " + simbolo);
        System.out.println("símbolo = unicode: " + (simbolo == unicode));

        System.out.println("Char corresponde en byte a: " + Character.BYTES);
        System.out.println("Char corresponde en bites a: " + Character.SIZE);
        System.out.println("el maximo valor de Char = " + Character.MAX_VALUE);
        System.out.println("el minimo valor de Char = " + Character.MIN_VALUE);

        // caracteres especiales:
        // espcio con unicode.
        char espacio ='\u0020';
        System.out.println("Hola mundo desde" + espacio + "java" );

        //retroceso elimina el caracter anterior.
        char retroceso = '\b';
        System.out.println("Hola mundo desde" + retroceso + "java" );

        // tabulador da un espacio más amplio.
        char tabulador= '\t';
        System.out.println("Hola mundo desde" + tabulador + "java" );

        // estos caracteres epeciales tambien se pueden agregar en el medio del string.
        System.out.println("hola mundo desde\tjava");

        // el tabulador n sirve hacer un salto de linea hacia abajo.
        char nuevaLinea = '\n';
        System.out.println("Hola mundo desde" + nuevaLinea + "java" );

        //retorno carro borra lo que este encuentre antes de esa variable.
        char retornoCarro = '\r';
        System.out.println("Hola mundo desde" + retornoCarro + "java" );

        // en sistemas windows se suelen utilizar estos ultimos dos juntos.
        System.out.println("Hola mundo desde" + nuevaLinea + retornoCarro + "java" );
    }
}
