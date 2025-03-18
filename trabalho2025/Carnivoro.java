public class Carnivoro extends Dinossauro implements Acoes {
    public Carnivoro(String nome, String peso, String velocidade, int idade, int saude) {
        super(nome, peso, velocidade, idade, saude);
    }
    @Override
    public void emitirSom() {
        System.out.println("O " + this.getNome() + " emitiu um som");
    }
    @Override
    public void mover() {
        System.out.println("O "+this.getNome()+"se moveu");
    }
    
    @Override
    public void comer() {
        System.out.println("O" +this.getNome()+" comeu");
    }
}