package modulo8ponto1;
// ENTIDADE TRIANGULO

// POO possibilita: reaproveitamento de código e delegação de responsabilidades
public class Triangulo {

    public double a;
    public double b;
    public double c;

    public double area(){ // não possui parametros, visto que para o calculo da área so precisa de a, b, c (ja dentro da classe)
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
