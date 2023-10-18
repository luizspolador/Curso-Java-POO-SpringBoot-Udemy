package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Caminho do arquivo: ");
        String path = sc.nextLine(); // c:\\temp\\in.txt

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List< Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            //gerando um stream com o preço dos produtos, somar,
            double average = list.stream().map(p -> p.getPrice()).reduce(0.0, (x,y) -> x + y) / list.size();
            System.out.println("Average price: " + String.format("%.2f", average));

            //localizando o nome dos produtos abaixo da media e ordenados de ordem descrescente
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()); // comparador de Strings independente de letra maiusc ou minusc
            List<String> names = list.stream().filter(p -> p.getPrice() < average).map(p -> p.getName()).sorted(comp.reversed()).collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();
    }
}
