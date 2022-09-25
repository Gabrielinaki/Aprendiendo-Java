import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre o descripción de la factura");
        String nombreFactura = scanner.nextLine();
        System.out.println("Factura = " + nombreFactura);

        double precioProducto1 = 0, precioProducto2 = 0;

        System.out.println("ingrese el valor del primer producto.");
        precioProducto1 = scanner.nextDouble();

        System.out.println("ingrese el valor del segundo producto.");
        precioProducto2 = scanner.nextDouble();

        double bruto = precioProducto1 + precioProducto2;
        double impuesto = bruto * 0.19 ;
        double total = bruto + impuesto;

        String mensaje = "La factura: " + nombreFactura + " tiene un total bruto de " + bruto +
                " con un impuesto de " + impuesto + " y el monto después de impuesto es de " + total + ".";
        System.out.println(mensaje);

    }
}
