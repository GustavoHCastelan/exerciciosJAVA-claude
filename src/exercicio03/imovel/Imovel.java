package exercicio03.imovel;

public abstract class Imovel {
    protected String endereco;
    protected double areaM2;

    public Imovel(String endereco, double areaM2) {
        this.endereco = endereco;
        this.areaM2 = areaM2;
    }

    public abstract double calcularAluguel();
    public abstract void exibirInfo ();
}
