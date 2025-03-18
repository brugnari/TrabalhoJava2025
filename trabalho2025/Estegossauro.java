
public class Estegossauro extends Dinossauro implements Herbivoro {

    public Estegossauro(String nome, String peso, String velocidade, int idade, int saude) {
        super(nome, peso, velocidade, idade, saude);

    }

    @Override
    public void emitirSom() {
        System.out.println("O estegossauro emite som");
    }

    @Override
    public void correr() {
        System.out.println("O estegossauro se move");
    }

    @Override
    public void comerVegetais() {
        System.out.println("O estegossauro come uma saladona");
    }

}
