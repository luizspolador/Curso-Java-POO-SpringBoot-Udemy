package modulo6;

import java.util.Scanner;

public class While44 {
    // WHILE -> usado qd n sabe a qtde de repetições que será realizada
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe um valor inicial: ");
        int x =  sc.nextInt();
        int soma = 0;
        while (x != 0){
            soma += x;
            System.out.println("informe outro valor: ");
            x = sc.nextInt();
        }

        System.out.println(soma);
        sc.close();
    }
}
