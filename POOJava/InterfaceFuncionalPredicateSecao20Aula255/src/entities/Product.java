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
    public static boolean staticProductPredicate(Product product){
        return product.getPrice() >= 100.0;
    }


    //utilizando metodo nao static
    public boolean nonStaticProductPredicate(){
        return price >= 100.0;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
