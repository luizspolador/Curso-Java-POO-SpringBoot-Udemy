package exercicio3Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluguel[] vetor = new Aluguel[10];
        System.out.print("Quantos quartos serão alugados? ");
        int quartos = sc.nextInt();

        for(int i=1; i<=quartos; i++){
            System.out.println();
            System.out.println("Aluguel #" + i + ":");
            System.out.print("nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("email: ");
            String email = sc.next();
            System.out.print("quarto: ");
            int numeroQuarto = sc.nextInt();
            vetor[numeroQuarto] = new Aluguel(nome, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for(int i=0; i<10; i++){
            if(vetor[i] != null){
                System.out.println(i + ": " + vetor[i]);
            }
        }

        sc.close();
    }
}
