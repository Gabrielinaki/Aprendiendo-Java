public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

//        Al poner al inicio un string y luego unas variables numéricas estos se van a concatenar.
        System.out.println(detalle + numeroA + numeroB);
//        si probamos poner primero los números estos se van a sumar y luego concatenar al string.
        System.out.println(numeroA + numeroB + detalle);
//        La solución para hacer una suma y luego concatenar es encerrando los números en paréntesis.
        System.out.println(detalle + (numeroA + numeroB ));

//        aquí probaremos utilizando el método concat, el cual es más eficiente
        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);
    }
}
