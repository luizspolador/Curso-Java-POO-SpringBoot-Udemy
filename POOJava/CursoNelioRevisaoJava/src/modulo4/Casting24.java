package modulo4;

public class Casting24 {

    public static void main(String[] args) {
        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) a/b;
        System.out.println(resultado); // 2.5

        System.out.println("-----------------");
        // transformando double para int

        double c;
        int d;

        c = 5.0;
        d = (int)c;
        System.out.println(c); // 5
    }

}
