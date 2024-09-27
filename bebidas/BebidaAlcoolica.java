package br.com.bebidas;

// Subclasse BebidaAlcoolica (Herança)
public class BebidaAlcoolica extends Bebidas {
    private double teorAlcoolico;

    // Construtor da subclasse BebidaAlcoolica
    public BebidaAlcoolica(String nome, double volume, double preco, double teorAlcoolico) {
        super(nome, volume, preco);
        this.teorAlcoolico = teorAlcoolico;
    }

    // Método que retorna os detalhes da bebida (Polimorfismo)
    @Override
    public String detalhes() {
        return "Bebida Alcoólica " + getNome() + ", Teor Alcoólico: " + teorAlcoolico + "%, Volume: " + getVolume() + "ml, Preço: R$" + getPreco();
    }
}
