package modulo7;

import java.util.Scanner;

public class FuncoesMetodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //QUAL DOS 3 NUMEROS É O MAIOR?
        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maximo = max(a,b,c);
        showResult(maximo);
        sc.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        if (x > y && y > z){
            aux = x;
        } else if (y > z){
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Maior valor = " + value);
    }
}
