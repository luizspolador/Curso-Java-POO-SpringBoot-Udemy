package util;

import entities.Product;

import java.util.function.Consumer;

public class ConsumerPriceUpdate implements Consumer<Product> {

    //aumentar o preço de cada produto em 10%
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
