public class PrimitivosEnteros {
    public static void main(String[] args){

        byte numeroByte = 127;
        System.out.println("numeroByte= " + numeroByte);
        System.out.println("Tipo Byte corresponde en byte a " + Byte.BYTES );
        System.out.println("Tipo Byte corresponde en bites a " + Byte.SIZE );
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE );
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE );

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a " + Short.BYTES );
        System.out.println("Tipo short corresponde en bites a " + Short.SIZE );
        System.out.println("Valor maximo de un short: " + Short.MAX_VALUE );
        System.out.println("Valor minimo de un short: " + Short.MIN_VALUE );

        int numeroInteger = 2147483647;
        System.out.println("numeroInteger = " + numeroInteger);
        System.out.println("Tipo Integer corresponde en byte a " + Integer.BYTES );
        System.out.println("Tipo Integer corresponde en bites a " + Integer.SIZE );
        System.out.println("Valor maximo de un Integer: " + Integer.MAX_VALUE );
        System.out.println("Valor minimo de un Integer: " + Integer.MIN_VALUE );

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo Long corresponde en byte a " + Long.BYTES );
        System.out.println("Tipo Long corresponde en bites a " + Long.SIZE );
        System.out.println("Valor maximo de un Long: " + Long.MAX_VALUE );
        System.out.println("Valor minimo de un Long: " + Long.MIN_VALUE );

        var numeroVar= 2147483648L;
    }
}
