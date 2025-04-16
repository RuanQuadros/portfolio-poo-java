public class Peixe extends Animal{
    @Override
    void mover() {
        System.out.println("Peixe está nadando silenciosamente.");
    }

    @Override
    public void respirar() {
        super.respirar();
    }
}
