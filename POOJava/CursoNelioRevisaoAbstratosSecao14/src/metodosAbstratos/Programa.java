package metodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Shape> lista = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c) ? ");
            char resposta = sc.next().charAt(0);
            System.out.print("Color (black/blue/red) ? ");
            Color color = Color.valueOf(sc.next());
            if(resposta == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                Rectangle rectangle = new Rectangle(color, width, height);
                lista.add(rectangle);
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                Circle circle = new Circle(color, radius);
                lista.add(circle);
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for(Shape shape : lista){
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
