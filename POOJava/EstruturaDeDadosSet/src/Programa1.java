import java.util.HashSet;
import java.util.Set;

public class Programa1 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>(); // mais rapido, mas nao garante a ordem
        // posso trocar o HashSet por TreeSet --> mantem a ordem dos dados
        //tmb posso trocar o HashSet por LinkedHashSet -->  mantem a ordem dos dados

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook")); // true
        set.remove("Tablet"); // remove o Tablet do conjunto

        set.removeIf(x -> x.length() >= 3); // remove se satisfazer o predicado informado --> nesse caso, sera removido
        // todo elemento x que tiver tamanho maior ou igual a 3

        set.removeIf(x -> x.charAt(0) == 'T'); // remove todos os elementos que tiverem a primeira letra 'T'

        for (String p : set) {
            System.out.println(p); // imprime TV, Notebook e Tablet
        }
    }
}

