package classes;

import java.util.Scanner;

public class Cd extends Midia{
    private int nMusicas;

    public Cd() {

    }

    public Cd(int c, double p, String s, int m) {
        this.codigo = c;
        this.preco = p;
        this.nome = s;
        this.nMusicas = m;
    }

    @Override
    public String getTipo() {
        return nome;
    }

    @Override
    public String getDetalhes() {
        return "Código: " + this.codigo + "\nNome: " + this.nome + "\nPreço: " + this.preco + "\nnMusicas: " + this.nMusicas;
    }

    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }

    public void inserirDados(){

        Scanner sc = new Scanner(System.in);

        super.inserirDados();
        System.out.println("informe o numero de Musicas:");
        setnMusicas(sc.nextInt());

    }
}
