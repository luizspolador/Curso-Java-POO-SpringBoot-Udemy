package stackTrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        method1();
        System.out.println("End of program");
    }

    public static void method1(){
        System.out.println("START METHOD1");
        method2();
        System.out.println("FINISH METHOD1");
    }

    public static void method2(){
        System.out.println("START METHOD2");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("End of program");
            e.printStackTrace(); // ajuda a detectar o motivo da exceção
            sc.next(); // para digitar algo para continuar
        } catch (InputMismatchException e){
            System.out.println("Input error");
        }
        sc.close();
        System.out.println("FINISH METHOD2");
    }
}
