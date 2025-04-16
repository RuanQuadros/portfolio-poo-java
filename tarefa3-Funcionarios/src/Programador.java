public class Programador extends Funcionario {
    public Programador (String nome){
        super(nome);
    }

    @Override
    void trabalhar() {
        System.out.println("Programando e tomando café...");
    }

    @Override
    public void apresentar() {
        super.apresentar();
    }
}
