package modulo6;

import java.util.Scanner;

public class For49 {
    public static void main(String[] args) {
        // FOR -> utilizando quando se sabe previamente a quantidade de repetições
        Scanner sc = new Scanner(System.in);

        System.out.println("informe a quantidade de leituras: ");
        int N = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < N; i++){
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println("Soma: " + soma);
    }
}
