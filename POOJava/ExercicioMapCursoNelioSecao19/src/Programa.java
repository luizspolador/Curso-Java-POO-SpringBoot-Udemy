import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votos = new LinkedHashMap<>();

        System.out.print("Entre com o caminho completo: ");
        String caminho = sc.nextLine();  // c:\\temp\\in.txt

        try(BufferedReader br = new BufferedReader(new FileReader(caminho))){ // para a leitura do arquivo in.txt no caminho mencionado
            String linha = br.readLine(); // le a primeira linha
            while (linha != null){ // se a linha for diferente de null
                String[] campos = linha.split(","); // cria um vetor de string campos, que separa a linha quando tiver uma ","
                String nome = campos[0]; // antes da virgula, tenho o campo[0] sendo o nome do candidato
                int contador = Integer.parseInt(campos[1]); // após a virgula, no campo[1], tenho um contador que foi convertido de String para int

                if(votos.containsKey(nome)){
                    int votosNome = votos.get(nome);
                    votos.put(nome, contador + votosNome);
                } else {
                    votos.put(nome, contador);
                }
                linha = br.readLine();
            }

            for (String key : votos.keySet()){
                System.out.println(key + ": " + votos.get(key));
            }
        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
