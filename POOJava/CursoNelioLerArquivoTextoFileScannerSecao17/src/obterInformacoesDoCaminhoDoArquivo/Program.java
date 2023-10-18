package obterInformacoesDoCaminhoDoArquivo;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine(); // c:\temp\in.txt

        File path = new File(strPath);
        System.out.println("getName: " + path.getName()); // getName: in.txt
        System.out.println("getParent: " + path.getParent()); // getParent: c:\temp
        System.out.println("getPath: " + path.getPath()); //getPath: c:\temp\in.txt
        sc.close();
    }
}
