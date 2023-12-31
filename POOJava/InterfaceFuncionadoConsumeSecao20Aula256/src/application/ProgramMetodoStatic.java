package application;

import entities.Product;
import util.ConsumerPriceUpdate;

import java.util.ArrayList;
import java.util.List;

public class ProgramMetodoStatic {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //utilizando o metodo static
        list.forEach(Product::staticPriceUpdate);

        list.forEach(System.out::println);
    }
}
