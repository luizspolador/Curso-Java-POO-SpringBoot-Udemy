package modulo8ponto3;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        Calculator calc = new Calculator(); --> não precisa instanciar

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        // podemos utilizar a propria classe, visto que os metodos sao static
//        double c = calc.circunference(radius);
//        double v = calc.volume(radius);

        double c = Calculator.circunference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
//        System.out.printf("PI value: %.2f%n", calc.PI);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }


}
