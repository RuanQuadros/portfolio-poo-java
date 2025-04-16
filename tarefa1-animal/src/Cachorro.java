public class Cachorro extends Animal implements Falante {
    @Override
    void mover() {
        System.out.println("Dog está se movendo.");
    }

    @Override
    public void falar() {
        System.out.println("Dog está latindo");
    }
}
