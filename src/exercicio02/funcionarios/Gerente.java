package exercicio02.funcionarios;

import exercicio02.infoFuncionarios.Funcionario;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println(" - Bônus: R$" + bonus);
    }
}
