package modulo4;

import java.util.Locale;

public class SaidaDeDados23 {

    public static void main(String[] args) {
        double x = 20.4021;
        System.out.printf("%.2f%n", x); // %n ou /n define que tera quebra de linha    20.40
        System.out.printf("%.4f%n", x); // 20.4021
        Locale.setDefault(Locale.US); // configura a localizaçao do prorama
        System.out.printf("Resultado = %.2f metros %n", x); // Resultado = 20.40 metros

        String nome = "Jose";
        int idade = 37;
        double renda = 400.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda); // Jose tem 37 anos e ganha R$ 400.00 reais

    }

}
