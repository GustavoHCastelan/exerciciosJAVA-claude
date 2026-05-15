package exercicio01.conta;

public class Conta {
    protected String numero;
    protected double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getSaldoDisponivel() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void depositar (double valor) {
        saldo += valor;
    }
}
