package classes;

public abstract class Saqueador extends Personagem {

    public Saqueador() {
        super("Saqueador", 60, 50, 30, 40);
    }

    public void ataqueFurtivo(Personagem alvo) {
        int dano = 20;
        System.out.println(getNome() + " realiza um ataque furtivo em " + alvo.getNome() + ", causando " + dano + " de dano.");
        alvo.receberDano(dano);
    }
}
