public class Mago extends Personagem implements Magico{
    public Mago (String nome){
        super(nome);
    }
    @Override
    void atacar() {
        System.out.println("Atacando com cajado mágico");
    }
    @Override
    public void lancarFeitico() {
        System.out.println("Lançando feitiço de fogo!");
    }
}
