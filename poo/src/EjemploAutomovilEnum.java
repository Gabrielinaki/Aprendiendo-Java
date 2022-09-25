public class EjemploAutomovilEnum {
    public static void main(String[] args){

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda","BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("Tipo subaru: " + tipo.getNombre());
        System.out.println("Tipo desc. subaru: " + tipo.getDescripcion());

        tipo = mazda.getTipo();

        switch(tipo){
            case CONVERTIBLE -> System.out.println("El automóvil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un automóvil pequeño de dos puertas y típicamente deportivo");
            case FURGON -> System.out.println("Es un automóvil  utilitario de transporte, de empresa");
            case HATCHBACK -> System.out.println("Es un automóvil mediano compacto, aspecto deportivo");
            case PICKUP -> System.out.println("Es un automóvil de doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automóvil mediano");
            case STATION_WAGON -> System.out.println("Es un automóvil mas grande, con maleta grande...");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for (TipoAutomovil tAuto:tipos) {
            System.out.println(tAuto + " => " + tAuto.name() + ", " +
                    tAuto.getNombre() + ", " +
                    tAuto.getDescripcion() + ", " +
                    tAuto.getNumeroPuerta());
            System.out.println();
        }

    }
}
