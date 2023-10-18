package upcastingAndDowncasting157;

public class Programa {
    public static void main(String[] args) {
        /* UPCASTING: casting da subclasse paa a superclasse - > usado no polimorfismo
        Exp: objeto do tipo BusinessAccount ser atrivuido a uma variável do tipo Account

        -----------------------------------------------------------------------------------------------
        DOWNCASTING: casting da superclasse para a subclasse
        Exp: objeto do tipo Account e querer atribuir esse objeto a uma variável do tipo BusinessAccount

        instanceOf
        usado em metodos que recebem parametros genericos como Equals
        ----------------------------------------------------------------------------------------------
         */

        Account acc = new Account(1001, "Luiz", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        //UPCASTING - BusinessAccount é uma Account
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //DOWNCASTING
//        BusinessAccount acc4 = acc2; // acc2 é do tipo Account e não pode ser convertido para BusinessAccount
        //para a linha de cida dar certo, devemos fazer:
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

//        BusinessAccount acc5 = (BusinessAccount) acc3; // se executar da erro, visto que acc3 foi instanciada como SavingsAccount, que não é uma BusinessAccount, mas uma Account
        if (acc3 instanceof BusinessAccount){ // se acc3 for uma instancia de BusinessAccoount
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan");   // NÃO IMPRIME
        }

        if( acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update"); // IMPRIME Update
        }

    }
}
