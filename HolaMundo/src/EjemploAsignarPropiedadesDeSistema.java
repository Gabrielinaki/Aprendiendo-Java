import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties prop = new Properties(System.getProperties());
            prop.load(archivo);
            prop.setProperty("mi.nueva.propiedad.personalizada","Mi valor guardado en el objeto Property");
            System.setProperties(prop);

            Properties propSistema = System.getProperties();
            System.out.println("propSistema.getProperty(...) = " + propSistema.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));
            propSistema.list(System.out);
        } catch (Exception e){
            System.err.println("No existe el archivo = " + e);
            System.exit(1);
        }
    }
}
