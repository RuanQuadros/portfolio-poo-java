public class Clerigo extends Personagem implements Curavel, Magico{
    public Clerigo (String nome){
        super(nome);
    }
    @Override
    void atacar() {
        System.out.println("Golpeando com cajado sagrado!");
    }
    @Override
    public void lancarFeitico() {
        System.out.println("Lançando feitiço de proteção!");
    }
    @Override
    public void curar() {
        System.out.println("Curando aliados com luz divina!");
    }
}
