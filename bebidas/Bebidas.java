package br.com.bebidas;

// Classe abstrata Bebida (Abstração)
public abstract class Bebidas {

    // Atributos encapsulados
    private String nome;
    private double volume;
    private double preco;

    // Construtor da classe Bebida
    public Bebidas(String nome, double volume, double preco) {
        this.nome = nome;
        this.volume = volume;
        this.preco = preco;
    }

    // Getters e Setters (Encapsulamento)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método abstrato (Polimorfismo)
    public abstract String detalhes();
}
