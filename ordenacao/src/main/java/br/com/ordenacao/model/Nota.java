package br.com.ordenacao.model;

public class Nota {

    private String nome;
    private double valor;

    public Nota(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
