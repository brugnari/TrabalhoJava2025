public class Herbivoro extends Dinossauro implements Acoes {

    public Herbivoro(String nome, String peso, String velocidade, int idade, int saude) {
        super(nome, peso, velocidade, idade, saude);
       
    }
    @Override
    public void emitirSom() {
        System.out.println("O "+this.getNome() + " emite som");
    }
    @Override
    public void mover() {
        System.out.println("O "+this.getNome()+" se move");
    }
     @Override
    public void comer() {
        System.out.println("O "+this.getNome()+" comeu");
    }
    
   
}
