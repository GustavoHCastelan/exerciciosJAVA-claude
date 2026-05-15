package exercicio02.funcionarios;

import exercicio02.infoFuncionarios.Funcionario;

public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, double salarioBase, String linguagem) {
        super(nome, salarioBase);
        this.linguagem = linguagem;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.2;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println(" - "+ linguagem);
    }
}
