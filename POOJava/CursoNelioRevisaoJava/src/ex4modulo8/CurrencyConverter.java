package ex4modulo8;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double converterDollarIntoReais(double amount, double dollarPrice){
        return amount * dollarPrice * (1 + IOF);
    }
}
