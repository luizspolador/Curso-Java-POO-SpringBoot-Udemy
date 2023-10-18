package listas97E98;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {
    public static void main(String[] args) {
        // criando uma lista com wrapper class
        // List é uma interface e para instanciar precisa ser com uma classe, como por exp a ArrayList
        List<String> list = new ArrayList<>();

        //adicionando elementos
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Sarah");
        list.add("Luiz");
        list.add("Cida");
        list.add("Tino");
        list.add("Mariana");
        list.add("Theo");
        list.add("Vera");
        list.add("Lucas");

        //adicionando elementos em uma posição especifica
        list.add(2, "Marco");

        //checando o tamanho da lista
        System.out.println(list.size());

        //encontrando a posição de um elemento
        System.out.println("Index of Marco: " + list.indexOf("Marco")); // 2.    Se não encontrar o elemento, retorna -1

        //removendo elementos da lista
        list.remove("Alex");
        //removendo pela posição
        list.remove(0);
        //removendo quem começa com a letra b
        // pega o valor String x e retorna se a sua primeira letra for 'b'. Se sim, remova-o.
        list.removeIf(x -> x.charAt(0) == 'b');

        //percorrendo a lista
        for(String x : list){
            System.out.println(x);
        }

        System.out.println("--------------------------------------");

        // encontrar o primeiro elemento que comece com 'A'
        String name = list.stream().filter(x -> x.charAt(0) == 'V').findFirst().orElse(null); // se o elemento que inicia com A não existir, retornará null
        System.out.println(name);

        System.out.println("--------------------------------------");

        //filtrando na lista quem começa com a letra 'L'
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
        for(String x : result){
            System.out.println(x);
        }


    }
}
