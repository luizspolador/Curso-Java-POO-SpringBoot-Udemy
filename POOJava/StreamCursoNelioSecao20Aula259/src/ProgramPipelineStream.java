import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramPipelineStream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 7, 8, 10, 25);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray())); // [30, 40, 70, 80, 100, 250]

        //reduce pega o elemento inicial e depois uma função que recebe 2 argumentos e gera um resultado
        // nesse caso, para soma:
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        int multiply = list.stream().reduce(1, (x, y) -> x * y);

        System.out.println(sum); // 57
        System.out.println(multiply); // 168000

        // filtrando todos os elementos pares da list, gerando uma nova stream que terão esses elementos multiplicados por 10
        // e por fim convertendo essa stream para list
        List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());

        System.out.println(Arrays.toString(newList.toArray())); // [40, 80, 100]

    }
}
