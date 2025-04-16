public class Gerente extends Funcionario implements Gerenciavel{
    public Gerente (String nome){
        super(nome);
    }

    @Override
    void trabalhar() {
        System.out.println("Coordenando projetos e fingindo que entende de tech");
    }

    @Override
    public void gerenciar() {
        System.out.println("Gerenciando com planilhas e reuniões.");
    }
}
