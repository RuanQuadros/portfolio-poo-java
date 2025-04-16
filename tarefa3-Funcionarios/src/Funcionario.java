abstract class Funcionario {
    private String nome;

    public Funcionario (String nome){
        this.nome = nome;
    }
    public void apresentar(){
        System.out.printf("Olá, meu nome é %s.%n", nome);
    }
    abstract void trabalhar();
}
