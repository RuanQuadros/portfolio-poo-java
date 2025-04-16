import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Funcionario ruan = new Programador("Ruan");
        Funcionario felipe = new Gerente("Felipe");
        Funcionario vayne = new Estagiario("Vayne");
        funcionarios.add(ruan);
        funcionarios.add(felipe);
        funcionarios.add(vayne);

        for(Funcionario f : funcionarios){
            f.apresentar();
            f.trabalhar();
            if(f instanceof Gerenciavel){
                ((Gerenciavel) f).gerenciar();
            }
            System.out.println();
        }
    }
}
