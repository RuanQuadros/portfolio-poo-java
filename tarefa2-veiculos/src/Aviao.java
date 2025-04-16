public class Aviao extends Veiculo implements Voador{
    @Override
    void mover() {
        System.out.println("Avião se movendo.");
    }

    @Override
    public void voar() {
        System.out.println("Avião voando no momento");
    }
}
