package entities;

public class PessoaFisica extends Contribuinte {
    private Double gastosSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double tax() {
        // ternario
        double imposto = (getRendaAnual() < 20000.0) ? getRendaAnual() * 0.15 : getRendaAnual() * 0.25;

//        double imposto;
//        if(getRendaAnual() < 20000.0){
//            imposto = getRendaAnual() * 0.15;
//        } else {
//            imposto = getRendaAnual() * 0.25;
//        }
//        imposto -= (gastosSaude * 0.5);
        if(imposto < 0.0){
            imposto =  0.0;
        }
            return imposto;
    }
}
