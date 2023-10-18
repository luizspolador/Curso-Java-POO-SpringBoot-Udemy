package application;

import entities.Product;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> listaProdutos = new ArrayList<>();

        System.out.print("Enter file path: ");
        String sourceFileStr = sc.nextLine(); // c:\temp\input.csv

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent(); // obtem o caminho despezando o nome do caminho

        boolean success = new File(sourceFolderStr + "\\out").mkdir(); // criando um novo diretorio chamado out

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){ // faz a leitura - se der certo, entra no try, senão, entra no catch
            String itemCsv = br.readLine(); // le a linha
            while(itemCsv != null){ // enquanto tiver linha para ser lida
                String[] fields = itemCsv.split(","); // quebra a linha quando tiver virgula
                String name = fields[0];
                double price = Double.parseDouble(fields[1]); // convertendo para double
                int quantity = Integer.parseInt(fields[2]);

                listaProdutos.add(new Product(name, price, quantity));

                itemCsv = br.readLine(); // le a linha
            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                for(Product item : listaProdutos){
                    bw.write(item.getName() + ", " +  String.format("%.2f", item.total()));
                    bw.newLine(); // para quebra de linha
                }
                System.out.println(targetFileStr + "CREATED");
            }catch (IOException e){
                System.out.println("Error to write the file: " +e.getMessage());
            }

        } catch (IOException e){
            System.out.println("Error to write the file: " + e.getMessage());
        }

        sc.close();
    }
}
