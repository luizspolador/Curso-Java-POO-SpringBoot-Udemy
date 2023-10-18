package vetores88E89;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int n = sc.nextInt();

        double[] vect = new double[n];
        double soma = 0.0;

        for (int i=0; i<n; i++){
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        double media = soma/n;
        System.out.printf("Media: %.2f%n", media);

        sc.close();
    }
}
