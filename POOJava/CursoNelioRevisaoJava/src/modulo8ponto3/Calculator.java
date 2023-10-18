package modulo8ponto3;
//classe utilizaria
public class Calculator {

    //SÃO STATIC PQ NÃO PRECISAM DE OBJETOS PARA SEREM CHAMADOS. São idependentes
    public static final double PI = 3.1459; // "final" indica que é uma constante, não muda

    public static double circunference(double radius){
        return 2 * PI * radius;
    }

    public static double volume(double radius){
        return 4 * PI * radius * radius * radius / 3;
    }
}
