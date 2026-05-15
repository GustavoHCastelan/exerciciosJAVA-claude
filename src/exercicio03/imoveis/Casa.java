package exercicio03.imoveis;

import exercicio03.imovel.Imovel;

public class Casa extends Imovel {
    private boolean temGaragem;

    public Casa(String endereco, double areaM2, boolean temGaragem) {
        super(endereco, areaM2);
        this.temGaragem = temGaragem;
    }

    @Override
    public double calcularAluguel() {
        if (temGaragem) {
            return areaM2 * 20 + 300;
        }else {
            return areaM2 * 20;
        }
    }

    @Override
    public void exibirInfo() {
        if (temGaragem ){
            System.out.println(endereco + " - "+ areaM2 + "m² - Possui Garagem! - Aluguel: R$ "+ calcularAluguel());
        }else {
            System.out.println(endereco + " - "+ areaM2 + "m² - Não Possui Garagem! - Aluguel: R$ "+ calcularAluguel());
        }
    }
}
