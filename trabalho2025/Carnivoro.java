
public class Carnivoro extends Dinossauro implements Comida {

    public Carnivoro(String nome, String peso, String velocidade, int idade, int saude) {
        super(nome, peso, velocidade, idade, saude);
    }

    @Override
    public void comer() {
        System.out.println("O dinossauro come carne");
    }

}
