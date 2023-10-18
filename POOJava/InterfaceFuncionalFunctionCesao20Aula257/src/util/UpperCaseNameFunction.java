package util;

import entities.Product;

import java.util.function.Function;

public class UpperCaseNameFunction implements Function<Product, String> { // entrada Product , saida String

    //retornar uma nova lista com os nomes dos produtos em caixa alta
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
