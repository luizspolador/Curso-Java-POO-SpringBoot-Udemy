package modulo5;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresAtribuicaoCumul37 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("informe os minutos consumidos: ");
        int minutos = sc.nextInt();

        double conta;
        if (minutos > 100){
            conta = 50 + ((minutos - 100) * 2);
            //System.out.println("valor da conta: " + conta);
            System.out.printf("valor da conta: %.2f" , conta);
        } else {
            conta = 50;
            //System.out.println("valor da conta: " + 50);
            System.out.printf("valor da conta: %.2f" , conta);
        }

        sc.close();

    }
}
