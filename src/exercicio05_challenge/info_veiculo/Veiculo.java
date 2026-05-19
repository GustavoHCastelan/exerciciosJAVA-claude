package exercicio05_challenge.info_veiculo;

public abstract class Veiculo {
    protected String placa;
    protected String marca;
    protected double precoDiaria;

    public Veiculo(String placa, String marca, double precoDiaria) {
        this.placa = placa;
        this.marca = marca;
        this.precoDiaria = precoDiaria;
    }

    public abstract String getTipo();

    public String getDados() {
        return ""+getTipo()+"\n"+marca+" - Placa: "+placa+"\nPreço diária: R$ "+precoDiaria+"\n";
    }
}
