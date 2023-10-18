package ex1modulo8;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Enter rectangle width: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Enter rectangle height: ");
        rectangle.height = sc.nextDouble();

        System.out.println("AREA: " + rectangle.area());
        System.out.println("PERIMETER: " + rectangle.perimeter());
        System.out.println("DIAGONAL: " + rectangle.diagonal());
    }
}
