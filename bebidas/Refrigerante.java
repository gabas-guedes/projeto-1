package br.com.bebidas;

// Subclasse Refrigerante (Herança)
public class Refrigerante extends Bebidas {
    private String sabor;
    private boolean gas;

    // Construtor da subclasse Refrigerante
    public Refrigerante(String nome, double volume, double preco, String sabor, boolean gas) {
        super(nome, volume, preco);
        this.sabor = sabor;
        this.gas = gas;
    }

    // Método que retorna os detalhes da bebida (Polimorfismo)
    @Override
    public String detalhes() {
        String tipoGas = gas ? "com gás" : "sem gás";
        return "Refrigerante sabor " + sabor + ", " + tipoGas + ", Volume: " + getVolume() + "ml, Preço: R$" + getPreco();
    }
}
