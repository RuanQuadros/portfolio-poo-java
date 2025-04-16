import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personagem> personagems = new ArrayList<>();
        Personagem draven = new Guerreiro("Draven");
        Personagem ryze = new Mago("Ryze");
        Personagem soraka = new Clerigo("Soraka");
        personagems.add(draven);
        personagems.add(ryze);
        personagems.add(soraka);

        for(Personagem p : personagems){
            p.apresentar();
            p.atacar();
            if(p instanceof Magico){
                ((Magico)p).lancarFeitico();
            }
            if(p instanceof Curavel){
                ((Curavel)p).curar();
            }
            System.out.println();
        }
    }
}
