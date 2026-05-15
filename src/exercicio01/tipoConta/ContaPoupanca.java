package exercicio01.tipoConta;

import exercicio01.conta.Conta;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numero, double saldo, double taxaRendimento) {
        super(numero, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento () {
        saldo += saldo * taxaRendimento;
    }
}
