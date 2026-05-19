package exercicio04.midias;

import exercicio04.config_midia.Midia;
import exercicio04.reproducao.Reproduzivel;

public class Podcast extends Midia implements Reproduzivel {
    private String apresentador;
    private int episodio;

    public Podcast(String titulo, double duracao, String apresentador, int episodio) {
        super(titulo, duracao);
        this.apresentador = apresentador;
        this.episodio = episodio;
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo podcast: "+ titulo +" - Ep."+ episodio +" com " + apresentador);
    }

    @Override
    public void pause() {
        System.out.println("\nPodcast pausado");
    }

    @Override
    public void stop() {
        System.out.println("\nPodcast parando...");
        System.out.println("Podcast parado");
    }

    @Override
    public String getTipo() {
        return "Podcast";
    }
}
