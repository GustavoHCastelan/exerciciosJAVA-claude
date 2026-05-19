package exercicio03.main;

import exercicio03.imoveis.Apartamento;
import exercicio03.imoveis.Casa;
import exercicio03.imovel.Imovel;

import java.util.ArrayList;

public class    Main {
    public static void main(String[] args) {
        double totalAlguel = 0;

        Casa c1 = new Casa("Tucuruvi",100, true);
        Apartamento ap1 = new Apartamento("Santana", 60, 3, true);
        Casa c2 = new Casa("Pinheiros", 80, false);
        Apartamento ap2 = new Apartamento("Itaim", 90, 8, true);

        ArrayList<Imovel> lista =  new ArrayList<>();

        lista.add(c1);
        lista.add(ap1);
        lista.add(c2);
        lista.add(ap2);

        for (Imovel imovel : lista) {
            String tipoImovel;
            if (imovel instanceof Casa){
                tipoImovel = "[Casa] ";
            }else {
                tipoImovel = "[Apartamento] ";
            }
            System.out.print(tipoImovel +"- ");
            imovel.exibirInfo();

            totalAlguel += imovel.calcularAluguel();
        }

        System.out.println("\nTotal de receita: R$ "+totalAlguel);
    }
}
