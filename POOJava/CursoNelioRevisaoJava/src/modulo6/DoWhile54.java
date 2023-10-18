package modulo6;

import java.util.Scanner;

public class DoWhile54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp;
        do{
            System.out.println("digite a temperatura em celcius: ");
            double celcius = sc.nextDouble();
            double fa = 9.0 * celcius / 5.0 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fa);
            System.out.print("Deseja repetir? s/n");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}
