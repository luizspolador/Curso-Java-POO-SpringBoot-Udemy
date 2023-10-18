package aaplication;

import services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>(); // colocando o tipo  T, ele permite que eu instancie um objeto com o tipo que eu desejar

        System.out.print("Quantos valores? ");
        int n = sc.nextInt();

//        ps.addValue("Maria");  --> não é possivel, pois o objeto ps foi instanciado utilizando Integer e não String

        for(int i = 0; i<n; i++){
            int valor = sc.nextInt();
            ps.addValue(valor);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}
