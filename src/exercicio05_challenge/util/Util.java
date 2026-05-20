package exercicio05_challenge.util;

import exercicio05_challenge.info_veiculo.Locacao;
import exercicio05_challenge.info_veiculo.Veiculo;
import exercicio05_challenge.veiculos.Carro;
import exercicio05_challenge.veiculos.Moto;

import javax.swing.*;

import java.util.ArrayList;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;


public class Util {

    private ArrayList<Veiculo> listaV = new ArrayList<>();
    private ArrayList<Locacao> listaL = new ArrayList<>();

    public void menu () {
        showMessageDialog(null, "Seja Bem-Vindo(a)!");
        int opcao;

        String aux = "Selecione o perfil: \n";
        aux += "[1] Funcionário\n";
        aux += "[2] Cliente\n";
        aux += "[3] Sair";

        do {
            opcao = parseInt(showInputDialog(aux));
            switch (opcao){
                case 1 -> menuFuncionario();
                case 2 -> menuCliente();
                case 3 -> showMessageDialog(null, "Até breve!");
                default -> showMessageDialog(null, "Opção inválida");
            }
        }while (opcao != 3);
    }

    private void menuFuncionario() {
        JPasswordField campoSenha = new JPasswordField();
        showConfirmDialog(  null, campoSenha, "Digite a senha:", JOptionPane.OK_CANCEL_OPTION);
        String senha = new String(campoSenha.getPassword());
        if (!senha.equals("a1b2c3")){
            showMessageDialog(null, "Acesso negado!");
            return;
        }
        String aux = "Selecione a opção desejada: \n";
        aux += "[1] Cadastrar veículo\n";
        aux += "[2] Voltar\n";

        int opcao;
        do {
            opcao = parseInt(showInputDialog(aux));
            switch (opcao) {
                case 1:
                    String veiculo = showInputDialog("Carro ou Moto?");
                    if (veiculo.equals("Carro") || veiculo.equals("carro")){
                        String placa = showInputDialog("Placa do Carro:");
                        String marca = showInputDialog("Marca do Carro:");
                        double precoDiaria = parseDouble(showInputDialog("Preço da diária:"));
                        int numPortas = parseInt(showInputDialog("Número de portas:"));

                        Carro carro = new Carro(placa, marca, precoDiaria, numPortas);
                        listaV.add(carro);
                    }else if (veiculo.equals("Moto") || veiculo.equals("moto")){
                        String placa = showInputDialog("Placa da Moto:");
                        String marca = showInputDialog("Marca da Moto:");
                        double precoDiaria = parseDouble(showInputDialog("Preço da diária:"));
                        int cilindradas = parseInt(showInputDialog("Cilindradas: "));

                        Moto moto = new Moto(placa, marca, precoDiaria, cilindradas);
                        listaV.add(moto);
                    }else {
                        showMessageDialog(null, "Veículo não reconhecido.");
                    }
                    break;
                case 2:
                  break;
                default:
                    showMessageDialog(null, "Opção inválida");
                    break;
            }
        }while (opcao != 2);
    }

    private void menuCliente() {
        String aux = "Selecione a opção desejada: \n";
        aux += "[1] Realizar locação\n";
        aux += "[2] Exibir locações\n";
        aux += "[3] Voltar\n";

        int opcao;
        do {
            opcao = parseInt(showInputDialog(aux));
            switch (opcao){
                case 1 -> realizarLocacao();
                case 2 -> exibirLocacao();
                case 3 -> {}
                default -> showMessageDialog(null, "Opção inválida");
            }
        }while (opcao != 3);
    }

    private void exibirLocacao() {
        if (listaL.isEmpty()) {
            showMessageDialog(null, "Nenhuma locação cadastrada!");
            return;
        }
        String lista = "";
        for (Locacao locacao : listaL){
            lista += locacao.getDados() + "\n";
        }
        showMessageDialog(null, lista);
    }

    private void realizarLocacao() {
        if (listaV.isEmpty()) {
            showMessageDialog(null, "Nenhum veículo cadastrado!");
            return;
        }
        int i=1;
        String lista = "";
        for (Veiculo veiculos : listaV){
            lista += "[" + i + "] " + veiculos.getDados() + "\n";
            i++;
        }
        i = parseInt(showInputDialog(lista));

        Veiculo veiculo = listaV.get(i-1);
        String nomeCliente = showInputDialog("Digite seu nome: ");
        int dias = parseInt(showInputDialog("Digite quantos dias ficará com o veículo: "));

        Locacao locacao = new Locacao(veiculo,nomeCliente,dias);
        listaL.add(locacao);
        showMessageDialog(null, "Locação realizada com sucesso!");

    }
}
