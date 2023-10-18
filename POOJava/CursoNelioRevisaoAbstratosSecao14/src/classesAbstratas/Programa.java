package classesAbstratas;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
//        Account acc1 = new Account(1001, "Alex", 1000.0); // nao pode ser instanciada - erro
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 400.00);


        List<Account> list = new ArrayList<>(); // lista do tipo generico -> Account
        list.add(acc2);
        list.add(acc3);
        list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1005, "Ana", 500.0, 200.0));

        double sum = 0.0;
        for(Account acc : list){
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum); // Total balance: 2800.00

        for (Account acc : list){
            acc.deposit(10.0);
        }

        for (Account acc : list){
            System.out.println("updated balance " + acc.getBalance());
        }

        /*
        updated balance 1010.0
        updated balance 1010.0
        updated balance 310.0
        updated balance 510.0
         */

    }
}
