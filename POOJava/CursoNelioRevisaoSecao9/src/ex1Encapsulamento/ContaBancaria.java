package ex1Encapsulamento;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    //CONSTRUTORES
    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        depositar(depositoInicial);
    }

    //GETTERS AND SETTERS
    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    //METODOS

    public void depositar(double quantidade){
        saldo += quantidade;
    }

    public void sacar(double quantidade){
        saldo -= quantidade + 5.00;
    }


    //TO STRING
    public String toString(){
        return "conta: " + numeroConta + ", titular: " + nomeTitular + ", saldo: $" + String.format("%.2f", saldo);
    }


}
