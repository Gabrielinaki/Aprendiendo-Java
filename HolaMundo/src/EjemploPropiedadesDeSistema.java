import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {
        String userName = System.getProperty("user.name");
        System.out.println("userName = " + userName);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workSpace = System.getProperty("user.dir");
        System.out.println("workSpace = " + workSpace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();

        System.out.println("lineSeparator: " + lineSeparator2 + "...una nueva linea...");

        Properties prop = System.getProperties();
        prop.list(System.out);
    }
}
