import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog(null, "Ingrese el primer nombre y apellido");
        String nombre2 = JOptionPane.showInputDialog(null, "Ingrese el segundo nombre y apellido");
        String nombre3 = JOptionPane.showInputDialog(null, "Ingrese el tercer nombre y apellido");

        String[] nombre1Str = nombre1.split(" ");
        String[] nombre2Str = nombre2.split(" ");
        String[] nombre3Str = nombre3.split(" ");

        String mensaje = "";

        if (nombre1Str[0].length() > nombre2Str[0].length() && nombre1Str[0].length() > nombre3Str[0].length()){
            System.out.println();
            mensaje = nombre1 +" tiene el nombre mas largo ";
        }

        if (nombre2Str[0].length() > nombre1Str[0].length() && nombre2Str[0].length() > nombre3Str[0].length()) {
            mensaje = nombre2 +" tiene el nombre mas largo ";
        }

        if (nombre3Str[0].length() > nombre1Str[0].length() && nombre3Str[0].length() > nombre2Str[0].length()){
            mensaje = nombre3 +" tiene el nombre mas largo ";

        }

        JOptionPane.showMessageDialog(null, mensaje);

//        String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
//        max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;

    }
}
