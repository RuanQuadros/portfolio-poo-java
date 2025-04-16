public class Main {
    public static void main(String[] args) {
        Veiculo civic = new Carro();
        civic.mover();
        civic.ligarMotor();
        System.out.println();

        Veiculo av = new Aviao();
        av.mover();
        ((Voador) av).voar();
        System.out.println();

        Veiculo sub = new Submarino();
        sub.mover();
        ((Aquatico) sub).nadar();
    }
}
