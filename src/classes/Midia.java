package classes;

import java.util.Scanner;

public abstract class Midia {

    Scanner sc = new Scanner(System.in);

    protected int codigo;
    protected double preco;
    protected String nome;

    public Midia() {

    }

    public Midia(int c, double p, String n) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return nome;
    }

    public String getDetalhes() {
        return "Código: " + this.codigo + "\nNome: " + this.nome + "\nPreço: " + this.preco;
    }

    // metodos
    public void printDados() {
        getTipo();
        getDetalhes();
    }

    public void inserirDados() {
        System.out.println("Informe os dados:");

        System.out.println("Nome: ");
        setNome(sc.nextLine());

        System.out.println("Preço: ");
        setPreco(sc.nextDouble());

        System.out.println("Código:");
        setCodigo(sc.nextInt());
    }

}
