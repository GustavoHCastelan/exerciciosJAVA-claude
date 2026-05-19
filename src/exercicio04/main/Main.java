package exercicio04.main;

import exercicio04.config_midia.Midia;
import exercicio04.midias.Musica;
import exercicio04.midias.Podcast;
import exercicio04.reproducao.Reproduzivel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Midia> lista = new ArrayList();
        lista.add(new Musica("Bohemian Rapsody", 5.5, "Queen","Rock"));
        lista.add(new Podcast("Flow #350", 90, "Igor Coelho",350));
        lista.add(new Musica("Beat it", 4, "Michael Jackson","Pop"));
        lista.add(new Podcast("Flow #360", 120, "Igor Coelho",360));

        for (Midia midia : lista){
            midia.exibirInfo();
            if (midia instanceof Reproduzivel){
                ((Reproduzivel) midia).play();
            }
            if (midia instanceof Podcast){
                ((Podcast) midia).stop();
            }
        }

    }
}
