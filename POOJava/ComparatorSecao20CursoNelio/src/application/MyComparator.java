package application;

import entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    // positivo caso p1 > p2  /  0 se for igual / negativo se p1 < p2
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()); // comparação por nome independente de letra maiusc ou minusc
    }
}
