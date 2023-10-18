package manipulandoPastasComFile;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine(); // entro com c:\temp

        //CRIANDO UM VETOR DE PASTAS
        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory); // lista somente o que for diretorio (pasta)
        System.out.println("Folders: ");
        for(File folder : folders){
            System.out.println(folder);
        }

        /*
        Folders:
        c:\temp\teste
        c:\temp\teste1
         */

        //CRIANDO UM VETOR DE ARQUIVOS
        File[] files = path.listFiles(File::isFile); // lista comente o que for arquivos
        System.out.println("Files: ");
        for(File file : files){
            System.out.println(file);
        }


        /*
        Folders:
        c:\temp\teste
        c:\temp\teste1
        Files:
        c:\temp\DR_RA_Actions.log
        c:\temp\DR_RA_Errors.log
        c:\temp\DR_RA_Logs.log
        c:\temp\in.txt
        c:\temp\out.txt
         */

        //CRIAR UMA SUBPASTA A PARTIR DA PASTA TEMP
        boolean success = new File(strPath + "\\teste3").mkdir(); //cria uma subpasta chamada teste3 na pasta temp
        System.out.println("Diretório criado com sucesso: " + success); // Diretório criado com sucesso: true

        sc.close();
    }
}
