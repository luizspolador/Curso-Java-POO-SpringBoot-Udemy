package entities;

public class PessoaJuridica extends Contribuinte{
    private Integer numerFuncionarios;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String name, Double rendaAnual, Integer numerFuncionarios) {
        super(name, rendaAnual);
        this.numerFuncionarios = numerFuncionarios;
    }

    public Integer getNumerFuncionarios() {
        return numerFuncionarios;
    }

    public void setNumerFuncionarios(Integer numerFuncionarios) {
        this.numerFuncionarios = numerFuncionarios;
    }

    @Override
    public double tax() {
        double imposto = (numerFuncionarios > 10) ? getRendaAnual() * 0.14 : getRendaAnual() * 0.16;

        if(imposto < 0.0){
            imposto = 0.0;
        }
        return imposto;
    }
}
