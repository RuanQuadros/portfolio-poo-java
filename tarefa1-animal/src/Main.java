public class Main {
    public static void main(String[] args) {
        Animal dog = new Cachorro();
        dog.mover();
        ((Falante) dog).falar();
        System.out.println();

        Animal cat = new Gato();
        cat.mover();
        ((Falante) cat).falar();
        System.out.println();

        Animal nemo = new Peixe();
        nemo.mover();
    }
}
