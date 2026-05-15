package exercicio03.imoveis;

import exercicio03.imovel.Imovel;

public class Apartamento extends Imovel {
    private int andar;
    private boolean temVaga;

    public Apartamento(String endereco, double areaM2, int andar, boolean temVaga) {
        super(endereco, areaM2);
        this.andar = andar;
        this.temVaga = temVaga;
    }

    @Override
    public double calcularAluguel() {
        if (temVaga && andar > 5) {
            return areaM2 * 25 + 700;
        }else if (andar > 5){
            return areaM2 * 25 + 500;
        }else if (temVaga) {
            return areaM2 * 25 + 200;
        }else {
            return areaM2 * 25;
        }
    }

    @Override
    public void exibirInfo() {
        if (temVaga){
            System.out.println(endereco + " - "+ areaM2 + "m² - Andar: "+ andar +" - Possui Vaga! -  - Aluguel: R$ "+ calcularAluguel());
        }else {
            System.out.println(endereco + " - "+ areaM2 + "m² - Andar: "+ andar +" - Não Possui Vaga! -  - Aluguel: R$ "+ calcularAluguel());
        }
    }
}
