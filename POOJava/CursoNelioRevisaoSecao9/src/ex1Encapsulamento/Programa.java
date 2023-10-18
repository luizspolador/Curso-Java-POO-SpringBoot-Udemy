package ex1Encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta;

        System.out.print("Entre com o número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Entre com o titular: ");
        sc.nextLine();
        String titular = sc.nextLine();

        System.out.print("Há algum depósito inicial? (s/n)?");
        char resposta = sc.next().charAt(0);
        if(resposta == 's') {
            System.out.print("Entre com um depósito incial: ");
            double depositoInicial = sc.nextDouble();
            conta = new ContaBancaria(numero, titular, depositoInicial);
        } else {
            conta = new ContaBancaria(numero, titular);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com um valor para deposito: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Conta atualizada: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com um valor para saque: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);
        System.out.println("Conta atualizada: ");
        System.out.println(conta);


        sc.close();

    }
}
