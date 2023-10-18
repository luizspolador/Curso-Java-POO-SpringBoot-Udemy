package util;

import entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0; // retorna os produtos com preço maior ou igual a 100
    }
}
