import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MenuOpcionesIterativo {
    public static void main(String[] args) {
        int opcionIndice = 0;
        do {


            // los Map (o mapas) los veremos mas adelante en el curso en profundidad
            // pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
            // también se les conoce como diccionarios para almacenar datos en base a un nombre.
            Map<String, Integer> opciones = new HashMap();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();

            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());

                // aca un if o switch para las distintas opciones.

                String mensaje = null;
                switch (opcionIndice) {
                    case 1:
                        mensaje = "Usuario actualizado correctamente. ";
                        JOptionPane.showMessageDialog(null, mensaje);
                        break;
                    case 2:
                        mensaje = "Usuario eliminado correctamente. ";
                        JOptionPane.showMessageDialog(null, mensaje);
                        break;
                    case 3:
                        mensaje = "Usuario agregado correctamente. ";
                        JOptionPane.showMessageDialog(null, mensaje);
                        break;
                    case 4:
                        mensaje = "listado correctamente. ";
                        JOptionPane.showMessageDialog(null, mensaje);
                        break;

                }
            }
        } while (opcionIndice != 5);
        JOptionPane.showMessageDialog(null, "haz salido con éxito!");
    }
}
