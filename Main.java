import br.com.bebidas.BebidaAlcoolica;
import br.com.bebidas.Refrigerante;


public class Main {
    public static void main(String[] args) {
        // Criando instâncias de diferentes bebidas
        Refrigerante refrigeranteCola = new Refrigerante("Cola", 350, 5.00, "Cola", true);
        BebidaAlcoolica cerveja = new BebidaAlcoolica("Cerveja", 600, 12.00, 5.0);

        // Exibindo detalhes de cada bebida
        System.out.println(refrigeranteCola.detalhes());
        System.out.println(cerveja.detalhes());
    }
}
