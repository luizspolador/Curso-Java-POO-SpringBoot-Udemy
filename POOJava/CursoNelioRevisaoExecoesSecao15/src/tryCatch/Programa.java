package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" "); // vetor que le strings separados por " "
            int position = sc.nextInt(); // solicita uma posicao
            System.out.println(vect[position]); // imprime a string do vetor alocada a position digitada
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("End of program");
        } catch (InputMismatchException e){
            System.out.println("Input error");
        }

        // gera exeção se eu digitar uma letra no lugar de inteiro ou digitar um numero q n seja uma position


        sc.close();
    }

}
