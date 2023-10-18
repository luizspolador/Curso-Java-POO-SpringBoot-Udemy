package exercicio2Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaEx {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantidadePessoas = sc.nextInt();

        Pessoas[] vetor = new Pessoas[quantidadePessoas];
        double somaAlturas = 0;
        int pessoasMenoresDeDezesseis = 0;
        for (int i=0; i< quantidadePessoas; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vetor[i] = new Pessoas(nome, idade, altura);
            somaAlturas += altura;
        }

        double mediaAltura = somaAlturas/ vetor.length;
        System.out.printf("Média de altura: %.2f%n", mediaAltura );
        System.out.println();

        System.out.println("Pessoas com menos de 16 anos: ");
        for(int i=0; i< vetor.length; i++){
            if (vetor[i].getIdade() < 16){
                pessoasMenoresDeDezesseis ++;
                System.out.println("nome: " + vetor[i].getNome() + ", idade: " + vetor[i].getIdade());
            }
        }

        double porcentagem = (double) pessoasMenoresDeDezesseis / quantidadePessoas * 100;
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f" , porcentagem , "%");

    }
}
