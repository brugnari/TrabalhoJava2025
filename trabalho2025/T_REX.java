public class T_REX extends Dinossauro implements Acoes {

    public T_REX(String nome, String peso, String velocidade, int idade, int saude) {
        super(nome, peso, velocidade, idade, saude);
    }

    @Override
    public void emitirSom() {
        System.out.println("O T-REX emite som");
    }

    @Override
    public void mover() {
        System.out.println("O T-REX se move");
    }

    @Override
    public void comer() {
        System.out.println("O T-REX come");
    }

}
