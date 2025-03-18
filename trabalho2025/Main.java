public class Main {
    public static void main(String[] args) {
        Dinossauro[] dinossauros = new Dinossauro[3];
        dinossauros[0] = new Carnivoro("T-Rex", "5000kg", "50km/h", 65, 100);
        dinossauros[1] = new Herbivoro("Triceratops", "8000kg", "30km/h", 70, 100);
        dinossauros[2] = new Carnivoro("Velociraptor", "2000kg", "60km/h", 50, 100);
        
        for (Dinossauro dinossauro : dinossauros) {
            dinossauro.emitirSom();
            dinossauro.mover();
            dinossauro.comer();
            dinossauro.Informacoes();
            System.out.println();
        }
    }
}