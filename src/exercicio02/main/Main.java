package exercicio02.main;

import exercicio02.funcionarios.Desenvolvedor;
import exercicio02.infoFuncionarios.Funcionario;
import exercicio02.funcionarios.Gerente;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double somaSalarios = 0;

        Desenvolvedor d = new Desenvolvedor("Gustavo", 3000, "JAVA");
        Desenvolvedor d2 = new Desenvolvedor("Pedro", 2500, "Python");
        Gerente g = new Gerente("Joao", 6000, 1000);
        ArrayList<Funcionario> lista = new ArrayList<>();

        lista.add(d);
        lista.add(d2);
        lista.add(g);

        System.out.println("========= FUNCIONÁRIOS =========");
        for (Funcionario f : lista){
            String cargoFuncionario = "";
            if (f instanceof Desenvolvedor){
                cargoFuncionario = "[Desenvolvedor] ";
            }else {
                cargoFuncionario = "[Gerente] ";
            }
            System.out.print(cargoFuncionario + "");
            f.exibirInfo();

            somaSalarios += f.calcularSalario();
        }

        System.out.println("\nTotal da folha: R$" + somaSalarios);
    }
}
