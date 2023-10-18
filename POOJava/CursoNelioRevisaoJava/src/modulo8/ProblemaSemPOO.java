package modulo8;

import java.util.Scanner;

public class ProblemaSemPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;
        System.out.println("Entre com as medidas do triangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Entre com as medidas do triangulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Area triangulo X: %.4f%n", areaX);
        System.out.printf("Area triangulo Y: %.4f%n", areaY);

        if(areaX  > areaY){
            System.out.println("Area do triangulo X é maior");
        } else {
            System.out.println("Area do triangulo Y é maior");
        }

        sc.close();
    }
}
