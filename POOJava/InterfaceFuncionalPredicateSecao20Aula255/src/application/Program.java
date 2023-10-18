package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

       //removendo todos os produtos que tenham valor maior ou igual a 100
        list.removeIf(new ProductPredicate());

        for (Product product : list){
            System.out.println(product);
        }
    }
}
