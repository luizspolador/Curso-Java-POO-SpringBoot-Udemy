package entities;

// para que o Employee seja ordenado pelo método sort da classe Collection, é necessário implementar a interface Comparable
public class Employee implements Comparable<Employee>{
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    //serve para comparar um objeto com outro
    //retorna um inteiro -> negativo, zero ou positivo
    // EXEMPLO: comparar "maria" com "alex" -> =12 -> maria é maior que alex - ordem alfabetica
    // comparar "alex" com "maria -> =-12 -> alex é menor que maria - ordem alfabetica
    // comparar "maria" com "maria" -> =0 -> são iguais
    @Override
    public int compareTo(Employee otherObject) {
        return name.compareTo(otherObject.getName()); // nesse caso, a comparação é realizada entre os nomes dos diferentes employees(objetos)
//        return salary.compareTo(otherObject.getSalary()); ---->> comparando salarios - ordem crescente
//        return -salary.compareTo(otherObject.getSalary()); ---->> compara salarios - orderm decrescente
    }
}
