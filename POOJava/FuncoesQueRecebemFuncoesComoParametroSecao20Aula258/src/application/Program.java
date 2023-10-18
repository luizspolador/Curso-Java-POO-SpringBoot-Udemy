package application;

import entities.Product;
import model.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        //soma todos os preços de produtos que começam com a letra 'T'
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        double sum2 = ps.filteredSum(list, p -> p.getPrice() <= 90.0);

        System.out.println("soma: " + String.format("%.2f", sum));
        System.out.println("soma2: " + String.format("%.2f", sum2));
    }
}
