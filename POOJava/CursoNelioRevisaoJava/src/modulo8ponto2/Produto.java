package modulo8ponto2;

//ENTIDADE DO MEU NEGOCIOS
public class Produto {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity; // THIS refere-se o acesso ao atributo da classe e não o parametro
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    //ToString
    public String toString(){
        return "Product Data: " + name + ", $ " + String.format("%.2f", price) + ", " + quantity
                + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
