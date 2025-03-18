
public class Velociraptor extends Dinossauro {

    public Velociraptor(String nome, String peso, String velocidade, int idade, int saude) {
        super(nome, peso, velocidade, idade, saude);
    }

    @Override
    public void emitirSom() {
        System.out.println("O velociraptor emite som");
    }

    @Override
    public void correr() {
        System.out.println("O velociraptor se move");
    }

    public void comerCarne() {
        System.out.println("O velociraptor come um bifão");
    }

    public void correrRapido() {
        System.out.println("O velociraptor corre na velocidade da luz");
    }

}
