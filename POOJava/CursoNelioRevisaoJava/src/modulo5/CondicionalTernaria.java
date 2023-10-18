package modulo5;

public class CondicionalTernaria {
    public static void main(String[] args) {
        // (condição) ? valor-se-verdadeiro : valor-se-falso

        //FAZENDO COM IF
        double preco = 34.5;
        double desconto;

        if (preco < 20.0){ // menor que 20
            desconto = preco * 0.1;
            System.out.println(desconto);
        } else { // maior que 20
            desconto = preco * 0.05;
            System.out.println(desconto);

        }

        System.out.println("---------------------------------");
        //COM OPERADOR TERNARIO
        double novoDesconto;
        novoDesconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
        System.out.println(novoDesconto);
    }
}
