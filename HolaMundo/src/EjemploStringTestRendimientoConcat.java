public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++ ){
            // c = c.concat(a).concat(b).concat("\n"); // 500 => 46ms
           // c+= a + b + "\n"; // 500 => 423ms
            sb.append(a).append(b).append("\n"); // 500 => 11ms
        }

        System.gc();
        long fin = System.currentTimeMillis();
        System.out.println("c = " + c);
        System.out.println(fin - inicio);
        System.out.println("sb = " + sb.toString());
        System.exit(0);
    }
}
