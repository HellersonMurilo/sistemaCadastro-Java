package classes;

import java.util.Scanner;

public class Dvd extends Midia {
    Scanner sc = new Scanner(System.in);
    private int nFaixas;

    public Dvd() {

    }

    public Dvd(int c, double p, String s, int f) {
        this.codigo = c;
        this.preco = p;
        this.nome = s;
        this.nFaixas = f;
    }

    @Override
    public String getTipo() {
        return nome;
    }

    @Override
    public String getDetalhes() {
        return "Código: " + this.codigo + "\nNome: " + this.nome + "\nPreço: " + this.preco + "Faixa: " + this.nFaixas;
    }

    void setFaixas(int f) {

    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    public void inserirDados() {
        super.inserirDados();
        System.out.println("Faixa: ");
        setFaixas(sc.nextInt());
    }

}
