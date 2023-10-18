package exercicio1Vetores;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("quantos numeros você vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int i=0; i< vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Números negativos:");
        for(int i=0; i< vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();

    }
}
