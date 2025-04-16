public class Submarino extends Veiculo implements Aquatico{
    @Override
    void mover() {
        System.out.println("Submarino se movendo.");
    }

    @Override
    public void nadar() {
        System.out.println("Submarino indo para o fundo do oceano.");
    }
}
