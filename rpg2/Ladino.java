package classes;

import java.util.Scanner;

class Ladino extends Personagem {
    private boolean invisivel;

    public Ladino() {
        super("Ladino", 80, 70, 50, 60);
        this.invisivel = false;
    }

    @Override
    public void realizarTeste(String atributo) {
        if (atributo.equalsIgnoreCase("destreza")) {
            System.out.println("Rolagem com vantagem para Destreza: " + rolagemDados.rolarComVantagem());
        } else if (atributo.equalsIgnoreCase("forca")) {
            System.out.println("Rolagem com desvantagem para Força: " + rolagemDados.rolarComDesvantagem());
        } else {
            System.out.println("Rolagem normal: " + rolagemDados.rolarD20());
        }
    }

    public void usarHabilidadeEspecial(Personagem alvo) {
        System.out.println("Escolha a habilidade a ser utilizada:");
        System.out.println("1. Tacar Faca");
        System.out.println("2. Ficar Invisível");

        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                tacarFaca(alvo);
                break;
            case 2:
                ficarInvisivel();
                break;
            default:
                System.out.println("Opção inválida. Usando tacar faca por padrão.");
                tacarFaca(alvo);
                break;
        }
    }

    public void tacarFaca(Personagem alvo) {
        int dano = 20;
        System.out.println(getNome() + " tacou uma faca em " + alvo.getNome() + " causando " + dano + " de dano.");
        alvo.receberDano(dano);
    }

    public void ficarInvisivel() {
        this.invisivel = true;
        this.ataque += 20;
        System.out.println(getNome() + " ficou invisível, ganhando um buff de ataque e pulando o turno do adversário.");
    }

    public boolean SeInvisivel() {
        return invisivel;
    }

    public void InvisibilidadeAcabar() {
        if (invisivel) {
            this.invisivel = false;
            this.ataque -= 20;
            System.out.println(getNome() + " não está mais invisível.");
        }
    }
}
