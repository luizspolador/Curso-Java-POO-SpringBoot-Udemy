import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Programa2 {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union
        Set<Integer> c = new TreeSet<>(a); // instanciando um conjunto c, como copia com conjunto a
        c.addAll(b); // união do conjunto c com o conjunto b
        System.out.println(c); // [0, 2, 4, 5, 6, 7, 8, 9, 10]

        //intersection
        Set<Integer> d = new TreeSet<>(a); // instanciando um conjunto d, como copia com conjunto a
        d.retainAll(b); // apenas elementos em comum em ambos os conjuntos a e b
        System.out.println(d); // [5, 6, 8, 10]

        //difference
        Set<Integer> e = new TreeSet<>(a); // instanciando um conjunto e, como copia com conjunto a
        e.removeAll(b); // remover do conjunto e todos que estao no conjunto b
        System.out.println(e); // [0, 2, 4]
    }
}
