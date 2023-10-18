package modulo4;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String x;
        System.out.print("digite seu nome: ");
        x = sc.next();
        System.out.println("nome: " + x);

        System.out.println("---------------");

        int y;
        System.out.print("digite sua idade: ");
        y = sc.nextInt();
        System.out.println("idade: " + y);

        System.out.println("---------------");

        double z;
        System.out.print("digite o salario: ");
        z = sc.nextDouble();
        System.out.println("salario: " + z);
        System.out.printf("salario: %.2f%n", z);

        System.out.println("---------------");

        char a;
        System.out.println("digite uma letra");
        a = sc.next().charAt(0); //pega o primeira caractere
        System.out.println("letra: " + a);

        sc.close();

    }

}
