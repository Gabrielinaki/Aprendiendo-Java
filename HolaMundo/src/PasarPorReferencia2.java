class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
         Persona persona = new Persona();
         persona.modificarNombre("Andrés");
        System.out.println("iniciamos el método main");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println("antes de llamar al método test");

        test(persona);
        System.out.println("después de llamar al método test");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println("finaliza el método main con los datos de la persona modificados!");
    }

    public static void test(Persona persona){
        System.out.println("iniciamos el método test ");
        persona.modificarNombre("Pepe");
        System.out.println("finalizamos el método test ");
    }
}
