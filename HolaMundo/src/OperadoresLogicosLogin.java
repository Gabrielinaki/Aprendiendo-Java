import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
//        String[] usernames = new String[3];
//        String[] passwords = new String[3];
//
//        usernames[0] = "andres";
//        passwords[0] = "12345";
//
//        usernames[1] = "admin";
//        passwords[1] = "12345";
//
//        usernames[2] = "pepe";
//        passwords[2] = "12345";

        String[] usernames = {"andres", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String usuario = scanner.nextLine();

        System.out.println("ingrese el password");
        String contraseña = scanner.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = usernames[i].equals(usuario) && passwords[i].equals(contraseña) ? true : esAutenticado;

           /* if ( usernames[i].equals(usuario) && passwords[i].equals(contraseña)) {
                esAutenticado = true;
                break;
            } */
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(usuario).concat("!") :
                "Error! username o password incorrecta \nLo sentimos :( , requiere autenticación";
        System.out.println(mensaje);

        /* if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
        } else {
            System.out.println("Error! username o password incorrecta");
            System.out.println("Lo siento :( , requiere autenticación");
        } */
    }
}
