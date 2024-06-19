package classes;

import java.util.Scanner;

class Paladino extends Personagem {
    public Paladino() {
        super("Paladino", 90, 75, 60, 80);
    }

    
    public void realizarTeste(String atributo) {
        System.out.println("Rolagem normal: " + rolagemDados.rolarD20());
    }

public void usarHabilidadeEspecial(Personagem alvo) {
    System.out.println("Escolha a habilidade a ser utilizada:");
    System.out.println("1. Curar");
    System.out.println("2. Atacar");
    
    Scanner scanner = new Scanner(System.in);
    int escolha = scanner.nextInt();
    
    switch (escolha) {
        case 1:
            curar();
            break;
        case 2:
            atacar();
            break;
        default:
            System.out.println("Opção inválida. Usando ataque por padrão.");
            atacar();
            break;
    }
}

public void curar() {
    System.out.println(nome + " usou a habilidade Curar, recuperando " + cura + " de vida.");
    vida += cura;
    if (vida > 90) {
        vida = 90; 
    }
    System.out.println("Vida atual: " + vida);
}
}
