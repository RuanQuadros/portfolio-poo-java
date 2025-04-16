public class Estagiario extends Funcionario{
    public Estagiario (String nome){
        super(nome);
    }

    @Override
    void trabalhar() {
        System.out.println("Fazendo tudo o que pedem e mais um pouco");
    }

}
