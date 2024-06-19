package classes;

public abstract class Lider extends Personagem {

    public Lider() {
        super("Líder dos Bandidos", 80, 60, 50, 45);
    }

    public void comandoTatico(Personagem alvo) {
        int dano = 25; 
        System.out.println(getNome() + " ordena um ataque coordenado em " + alvo.getNome() + ", causando " + dano + " de dano.");
        alvo.receberDano(dano);
    }
}
