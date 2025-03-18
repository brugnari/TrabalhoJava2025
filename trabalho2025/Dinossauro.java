public abstract class Dinossauro {
private String nome,peso,velocidade;
private int idade,saude;
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getPeso() {
    return peso;
}
public void setPeso(String peso) {
    this.peso = peso;
}
public String getVelocidade() {
    return velocidade;
}
public void setVelocidade(String velocidade) {
    this.velocidade = velocidade;
}
public int getIdade() {
    return idade;
}
public void setIdade(int idade) {
    this.idade = idade;
}
public int getSaude() {
    return saude;
}
public void setSaude(int saude) {
    this.saude = saude;
}
public Dinossauro(String nome, String peso, String velocidade, int idade, int saude) {
    this.nome = nome;
    this.peso = peso;
    this.velocidade = velocidade;
    this.idade = idade;
    this.saude = saude;
}

    
    public abstract void emitirSom();
    public abstract void mover();
    public abstract void comer();

public void Informacoes() {
    System.out.println("Nome: "+this.getNome());
    System.out.println("Peso: "+this.getPeso());
    System.out.println("Velocidade: "+this.getVelocidade());
    System.out.println("Idade: "+this.getIdade());
    System.out.println("Saude: "+this.getSaude());
    
}

}
