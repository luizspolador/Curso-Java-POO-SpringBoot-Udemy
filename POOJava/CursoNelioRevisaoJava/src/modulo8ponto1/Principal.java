package modulo8ponto1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variaveis do tipo Triangulo
        Triangulo x, y;
        // instanciando 2 triangulos
        x = new Triangulo();
        y = new Triangulo();

        // recebendo as variaveis a, b, c do Triangulo X
        System.out.println("Entre com as medidas do triangulo X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        // recebendo as variaveis a, b, c do Triangulo Y
        System.out.println("Entre com as medidas do triangulo Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

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
