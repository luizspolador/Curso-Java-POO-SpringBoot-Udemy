import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Programa {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 7, 8, 10, 25);

        //criando uma stream a partir da lista
        Stream<Integer> st1 = list.stream();
        // converte a stream para vetor
        System.out.println(Arrays.toString(st1.toArray())); // [3, 4, 7, 8, 10, 25]


        //map() aplica uma funcao a cada elemento da stream. Nesse caso, a função pega o elemento e multiplica por 10
        Stream<Integer> st2 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st2.toArray())); // [30, 40, 70, 80, 100, 250]

        //criando uma stream usando Stream.of
        Stream<String> st3 = Stream.of("Maria", "Jose", "Cida", "Tino");
        System.out.println(Arrays.toString(st3.toArray())); // [Maria, Jose, Cida, Tino]

        //criando uma stream com iterate. primeiro elemento da stream é 0, e os próximos serão x + 2
        Stream<Integer> st4 = Stream.iterate(0, x -> x + 2);
        // limite de 10 elementos na stream
        System.out.println(Arrays.toString(st4.limit(10).toArray())); // [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]

        //sequencia de fibonacci. Primeiro elemento da Stream é um vetor com 0 e 1 do tipo long.
        Stream<Long> st5 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st5.limit(10).toArray())); // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]

    }
}
