package fileWritterAndBufferedWritter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
        String path = "c:\\temp\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ // o TRUE faz com que adicione as mensagens no arquivo txt, caso ja exista
            for (String line : lines){
                bw.write(line);
                bw.newLine(); // para quebra de linha
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

// sem o TRUE, se executar novamente, recria o arquivo substituindo o já existente
