public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 32768;
        Integer intObejeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObejeto = " + intObejeto);

        int num = intObejeto;
        System.out.println("num = " + num);
        int num2 = intObejeto.intValue();
        System.out.println("num2 = " + num2);

        String valorLCD = "67000";
        Integer valor = Integer.valueOf(valorLCD);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObejeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObejeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObejeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}
