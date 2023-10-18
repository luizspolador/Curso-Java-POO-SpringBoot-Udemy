package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> { // colocando o tipo  T, ele permite que eu instancie um objeto com o tipo que eu desejar
    List<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }

    public T first(){
        if(list.isEmpty()){
            throw new IllegalStateException("lista vazia");
        } else {
            return  list.get(0);
        }
    }

    public void print(){
        System.out.print("[");
        if(!list.isEmpty()){
            System.out.println(list.get(0));
        }

        for(int i = 1; i < list.size(); i++){
            System.out.println(", " + list.get(i));
        }
        System.out.println("]");
    }
}
