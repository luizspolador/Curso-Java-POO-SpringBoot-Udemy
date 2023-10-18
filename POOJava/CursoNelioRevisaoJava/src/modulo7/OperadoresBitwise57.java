package modulo7;

import java.util.Scanner;

public class OperadoresBitwise57 {
    //aplicado a arduino, microcontroladores, interface de rede
    public static void main(String[] args) {
        int n1 = 89;
        int n2 = 69;
        System.out.println(n1 & n2); // 65
        System.out.println(n1 | n2); //93
        System.out.println(n1 ^ n2); // 28

        System.out.println("-----------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int mask = 32; // ja sei que é o numero com sexto bit valendo 1
        int n = sc.nextInt();
        if((n & mask) != 0){ // TESTANDO SE O SEXT BIT DO NUMERO n VALE 1
            System.out.println("6th bit is true");
        } else {
            System.out.println("6th bit is false");
        }

    }
}
