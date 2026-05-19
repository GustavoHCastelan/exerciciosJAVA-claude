package exercicio04.midias;

import exercicio04.config_midia.Midia;
import exercicio04.reproducao.Reproduzivel;

public class Musica extends Midia implements Reproduzivel {
    private String artista;
    private String genero;

    public Musica(String titulo, double duracao, String artista, String genero) {
        super(titulo, duracao);
        this.artista = artista;
        this.genero = genero;
    }

    @Override
    public void play() {
        System.out.println("Tocando música : "+  titulo + " - "+ artista);
    }

    @Override
    public void pause() {
        System.out.println("Música pausada");
    }

    @Override
    public void stop() {
        System.out.println("Música parada");
    }

    @Override
    public String getTipo() {
        return "Música";
    }
}
