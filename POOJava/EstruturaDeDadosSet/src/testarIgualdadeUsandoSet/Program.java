package testarIgualdadeUsandoSet;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>(); // Product não tem equals and hashcode, dessa forma, o set usa a referencia de ponteiros para comparar

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        System.out.println(set.contains(prod)); // FALSE, porque comparou referencias, que são diferentes

        //PARA COMPARAR POR CONTEUDO - necessario implementar as operações hashcode e equals na classe Product.
        // foi implementado hashcode e equals usando ambos os parametros name e price
        // após implementar hashcode e equals e executar a linha 16 novamente, o resultado ser TRUE
    }
}
