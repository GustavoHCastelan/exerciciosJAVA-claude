package exercicio01.tipoConta;

import exercicio01.conta.Conta;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }


    @Override
    public double getSaldoDisponivel() {
        return saldo + limite;
    }
}
