package ex3modulo8;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calculateGrade() {
        return nota1 + nota2 + nota3;
    }

    public double MissingPoints(){
        if (calculateGrade() < 60){
            return 60.0 - calculateGrade();
        } else {
            return 0;
        }
    }

}
