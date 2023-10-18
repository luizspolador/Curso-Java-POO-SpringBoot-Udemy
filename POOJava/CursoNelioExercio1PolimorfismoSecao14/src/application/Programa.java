package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsoursed? (y/n): ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y'){ // funcionario é terceiro
                System.out.print("Aditional charge: ");
                double aditionalCharge = sc.nextDouble();
                Employee empTerc = new OutsourcedEmployee(name, hours, valuePerHour, aditionalCharge); // instanciando um funcionario terceiro (OutsourcedEmployee) que é um Employee
                list.add(empTerc);
            } else {
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for(Employee emp : list){
            System.out.println(emp.getName() + ", $" + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
