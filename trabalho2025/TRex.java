
public class TRex extends Dinossauro implements Carnivoro {

    public TRex(String nome, String peso, String velocidade, int idade, int saude) {
        super(nome, peso, velocidade, idade, saude);
    }

    @Override
    public void emitirSom() {
        System.out.println("O T-REX emite som");
    }

    @Override
    public void comerCarne() {
        System.out.println("O T-REX come um bifão");
    }

}
