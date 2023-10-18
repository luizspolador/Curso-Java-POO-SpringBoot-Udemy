package entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    // no lugar de utilizar a classe ProductPredicate com a interface Predicate implementada, podemos utilizar o metodo static abaixo
    public static void staticPriceUpdate(Product product){
        product.setPrice(product.getPrice()*1.1);
    }


    //utilizando metodo nao static
    public void nonStaticPriceUpdate(){
        price *= 1.1;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + String.format("%.2f", price) +
                '}';
    }
}
