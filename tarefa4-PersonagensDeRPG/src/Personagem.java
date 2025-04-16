abstract class Personagem {
    private String nome;

    public Personagem (String nome){
        this.nome = nome;
    }
    public void apresentar(){
        System.out.printf("Eu sou %s, pronto pra batalha!%n", nome);
    }
    abstract void atacar();
}
