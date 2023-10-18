package application;

import entities.Product;
import util.UpperCaseNameFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        //lista original -> lista de Products
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //obter uma stream(sequencia) a partir da list. Função map() aplica uma funcao a cada elemento da stream,
        // gerando uma nova stream com os elementos transformados
        // collect permite a conversao novamente para list
        List<String> names = list.stream().map(new UpperCaseNameFunction()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
