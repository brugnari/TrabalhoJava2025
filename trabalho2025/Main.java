
public class Main {

    public static void main(String[] args) {

        Carnivoro tRex = new Carnivoro("T-Rex", "1000", "50", 100, 100);
        tRex.informacoes();
        tRex.emitirSom();
        tRex.comer();
        tRex.correr();

        Carnivoro velociraptor = new Carnivoro("Velociraptor", "500", "100", 50, 50);
        velociraptor.informacoes();
        velociraptor.emitirSom();
        velociraptor.correr();
        velociraptor.comer();

        Herbivoro estegossauro = new Herbivoro("Estegossauro", "2000", "20", 200, 200);
        estegossauro.informacoes();
        estegossauro.emitirSom();
        estegossauro.correr();
        estegossauro.comer();
    }
}
