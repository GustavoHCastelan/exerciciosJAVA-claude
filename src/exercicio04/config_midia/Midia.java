package exercicio04.config_midia;

public abstract class Midia {
    protected String titulo;
    protected double duracao;

    public Midia(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public void exibirInfo () {
    System.out.println("\n["+ getTipo() +"] - "+ titulo +" - Duração: "+ duracao + " min");
    }

    public abstract String getTipo ();
}
