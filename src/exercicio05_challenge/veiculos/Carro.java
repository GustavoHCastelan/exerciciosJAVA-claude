package exercicio05_challenge.veiculos;

import exercicio05_challenge.info_veiculo.Veiculo;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String placa, String marca, double precoDiaria, int numPortas) {
        super(placa, marca, precoDiaria);
        this.numPortas = numPortas;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}
