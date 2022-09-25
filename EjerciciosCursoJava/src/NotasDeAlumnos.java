import java.util.Scanner;

public class NotasDeAlumnos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double nota = 0.0;
        double promNotasMayores5 = 0;
        double promNotasMenores4 = 0;
        int contNotasMayores5 = 0;
        int contNotasMenores4 = 0;
        int cantnotas1= 0;
        double promedioTotal = 0;
// comenzamos con un bucle pidiendo las notas 20 veces.
        for (int i = 0; i < 20; i++) {
            System.out.println("Por favor ingresar, nota (1 - 7)Nro " + (i+1) + " : ");
            nota = s.nextInt();

// si se ingresa 0 sale de la ejecucion y envia mensaje de error
            if (nota == 0){
                System.out.println("Error! la nota no pude ser 0 debe ingresar un valor entre 1-7");
                System.exit(1);
            }
// recolectamos todas las notas que sean 1.
// primero sumamos todos los valores mayores que 5 y con contNotasMayores5 sumamos la cantidad.
// luego sumamos los valores inferiores a 4 y aumentamos el contador.
            if (nota == 1){
                cantnotas1++;
            } else {
                if (nota>5){
                    promNotasMayores5 += nota;
                    contNotasMayores5++;

                } else if (nota<4){
                    promNotasMenores4 += nota;
                    contNotasMenores4++;
                }
            }
// sumamos todas las notas para obtener el promedio final.
            promedioTotal += nota;

        }
        // aca termina el bucle.

// se imprime por pantalla todas las notas recolectadas en el bucle.
        System.out.println("La cantidad de notas 1 es = " + cantnotas1);
// por un lado verificamos que haya valores mayores a 5 y calculamos el promedio, después, lo imprimimos.
        if (contNotasMayores5 == 0){
            System.out.println("no hay notas mayores a 5");
        } else {
            promNotasMayores5 = promNotasMayores5 / contNotasMayores5;
            System.out.println("Promedio de notas mayores a 5 es = " + promNotasMayores5);
        }

// por otro lado hacemos lo mismo con los valores inferiores a 4.
        if (contNotasMenores4 == 0){
            System.out.println("No hay notas menores a 4.");
        } else {
            promNotasMenores4 = promNotasMenores4 / contNotasMenores4;
            System.out.println("Promedio de notas menores a 4 es = " + promNotasMenores4);
        }

// calculamos el promedio final y lo imprimimos.
        promedioTotal = promedioTotal / 20;
        System.out.println("promedioTotal = " + promedioTotal);

    }
}
