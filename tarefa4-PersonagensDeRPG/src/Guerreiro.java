public class Guerreiro extends Personagem{
    public Guerreiro (String nome){
        super(nome);
    }
    @Override
    void atacar() {
        System.out.println("Atacando com espada!");
    }
}
