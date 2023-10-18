package exercicio1List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            System.out.println();
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            while(hasId(list, id)){ // enquanto existir o id na lista (repetido)
                System.out.println("Id already taken! Try again! ");
                System.out.print("id: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt(); //li o id

        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

//        Integer pos = position(list, idSalary); // procuro pelo id


//        if (pos == null){ //se o id nao for encontrado
        if (emp == null){
            System.out.println("This id doesn't exist");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble(); // ler porcentagem
//            list.get(pos).increaseSalary(percent); // incrementa o salario
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for(Employee e : list){ // para cada e do tipo Employee na lista list
            System.out.println(e);
        }

        sc.close();

    }

    //para encontrar a posição (id) na lista
//    public static Integer position(List <Employee> list, int id){
//        for (int i = 0; i<list.size(); i++){
//            if (list.get(i).getId() == id){
//                return i;
//            }
//        }
//        return null; // NÃO FOI ENCONTRADO
//    }


    //verificar se o id existe -> retorna V se o id existir
    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
