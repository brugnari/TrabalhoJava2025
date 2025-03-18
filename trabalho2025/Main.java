
public class Main {
    public static void main(String[] args) {
        Dinossauro[] Objetodinossauro = new Dinossauro[2];
        Objetodinossauro[0] = new Carnivoro("T-REX", "5 toneladas", "50 km/h", 10, 100);
        Objetodinossauro[1] = new Herbivoro("Estegossauro", "2 toneladas", "30 km/h", 15, 100);

        for (Dinossauro dino : Objetodinossauro) {
            dino.Informacoes();
            dino.emitirSom();
            dino.mover();
            dino.comer();
            System.out.println();
        }
    }
}