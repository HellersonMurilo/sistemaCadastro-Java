import java.util.Scanner;

import javax.swing.JOptionPane;

import classes.Cd;
import classes.Dvd;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        boolean controle = false;
        int opcoes;

        // iniciando os construtores
        Cd cd = new Cd();
        Dvd dvd = new Dvd();

        // Criando o Menu
        System.out.println("Seja bem vindo ao sistema de gerenciamento de CDs e DVDs");
        System.out.println("==========================================================");

        while (controle == false) {
            System.out.println("Informe o que deseja fazer: \n1 - Cadastrar \n2 - Ver Dados \n3 - Encerrar");
            opcoes = sc.nextInt();

            switch (opcoes) {
                case 1:
                    System.out.println("O que deseja cadastrar? \n1 - CD \n2 - DVD");
                    int cadastroNumero = sc.nextInt();
                    switch (cadastroNumero) {
                        case 1:
                            cd.inserirDados();
                            System.out.println("Cadastro Realizado com Sucesso!");
                            break;
                        case 2:
                            dvd.inserirDados();
                            System.out.println("Cadastro Realizado com Sucesso");
                            System.out.println("");
                            System.out.println("");
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Quais dados deseja visualizar? \n1 - CD \n2 - DVD");
                    int visualizarDados = sc.nextInt();
                    switch (visualizarDados) {
                        case 1:
                            System.out.println(cd.getDetalhes());
                            System.out.println("");
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println(dvd.getDetalhes());
                            System.out.println("");
                            System.out.println("");

                        default:
                            break;
                    }
                    break;
                case 3:
                    System.err.println("Sistema Encerrado");
                    System.exit(0);
                    controle = true;
                    break;
                default:
                    break;
            }
        }

    }
}
