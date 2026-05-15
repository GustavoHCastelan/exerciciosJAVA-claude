package exercicio01.main;

import exercicio01.conta.Conta;
import exercicio01.tipoConta.ContaCorrente;
import exercicio01.tipoConta.ContaPoupanca;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("R$#,##0.00");

        ContaCorrente cc = new ContaCorrente("[CC-001]", 500, 1000);
        ContaPoupanca cp = new ContaPoupanca("[CP-002]", 800, 0.05);
        ArrayList<Conta> lista = new ArrayList<>();

        lista.add(cc);
        lista.add(cp);

        cc.depositar(200);
        cp.depositar(100);

        for (Conta conta : lista){
            System.out.println("Conta "+ conta.getNumero()  + " - Saldo disponível: "+ dc.format(conta.getSaldoDisponivel()));
        }

        System.out.println("\nAplicando rendimento na poupança...");
        cp.aplicarRendimento();
        System.out.println("Conta Poupança "+ cp.getNumero() + " Novo saldo: "+ dc.format(cp.getSaldoDisponivel()));
    }
}