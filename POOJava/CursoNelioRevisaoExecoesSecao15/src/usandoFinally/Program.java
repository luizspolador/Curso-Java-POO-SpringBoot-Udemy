package usandoFinally;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally { // executado independente de dar certo ou nao no bloco try
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block was executed");
        }

    }
}