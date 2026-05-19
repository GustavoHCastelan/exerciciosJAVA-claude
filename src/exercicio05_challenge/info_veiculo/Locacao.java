package exercicio05_challenge.info_veiculo;

public class Locacao {
    private Veiculo veiculo;
    private String  nomeCliente;
    private int dias;

    public Locacao(Veiculo veiculo, String nomeCliente, int dias) {
        this.veiculo = veiculo;
        this.nomeCliente = nomeCliente;
        this.dias = dias;
    }

    public double calcularTotal() {
        return veiculo.precoDiaria * dias;
    }

    public String getDados() {
        return "["+veiculo.getDados()+"] - "+nomeCliente+"\n"+dias+" dias -> Valor total: R$ "+calcularTotal();
    }
}
