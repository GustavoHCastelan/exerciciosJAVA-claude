package exercicio05_challenge.veiculos;

import exercicio05_challenge.info_veiculo.Veiculo;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String marca, double precoDiaria, int cilindradas) {
        super(placa, marca, precoDiaria);
        this.cilindradas = cilindradas;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}
