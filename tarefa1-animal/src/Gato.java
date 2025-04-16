public class Gato extends Animal implements Falante{
    @Override
    void mover() {
        System.out.println("Gato está andando.");
    }

    @Override
    public void falar() {
        System.out.println("Gato está miando.");
    }
}
