package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Caminho do arquivo: ");
        String path = sc.nextLine(); // c:\\temp\\in.txt

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            //solicitando e lendo valor
            System.out.println("Enter salary: ");
            double salary = sc.nextDouble();

            //mostrar, em ordem alfabética, o email dos funcionários cujo salário seja superior a um dado valor
            //fornecido pelo usuário.
            List<String> emails = list.stream().filter(x -> x.getSalary() > salary).map(x -> x.getEmail()).sorted().collect(Collectors.toList());
            System.out.println("Email of people whose salary is more than: " + String.format("%.2f", salary) + ":");
            emails.forEach(System.out::println);

            //Mostrar também a soma dos salários dos funcionários cujo nome começa com a letra 'M'.
            double sum = list.stream().filter(x -> x.getName().charAt(0) == 'M').map(x -> x.getSalary()).reduce(0.0, (x,y) -> x + y);
            System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();
    }
}
