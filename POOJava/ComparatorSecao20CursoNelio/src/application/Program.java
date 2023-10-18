package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> lista = new ArrayList<>();

        lista.add(new Product("TV", 900.0));
        lista.add(new Product("Celular", 1200.0));
        lista.add(new Product("Notebook", 1500.00));

        // criando uma classe anonima
//        Comparator<Product> comp = new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
//            }
//        };

        // abaixo, segue o que foi feito acima utilizando arrow function (anonima)
        // abaixo, tmb é possível apagar as chaves { e } e apagar o "return" para deixar tudo em uma unica linha
        Comparator<Product> comp = (p1, p2) -> {
            return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
        };

//        lista.sort(new MyComparator());
        lista.sort(comp);

        for(Product p : lista){
            System.out.println(p);
        }
    }
}
