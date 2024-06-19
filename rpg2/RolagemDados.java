package classes;
import java.util.Random;
class RolagemDados {
    private Random random;

    public RolagemDados() {
        this.random = new Random();
    }

    public int rolarD20() {
        return random.nextInt(20) + 1;
    }

    public int rolarComVantagem() {
        int rolagem1 = rolarD20();
        int rolagem2 = rolarD20();
        System.out.println("Rolagem com Vantagem: Dado 1 = " + rolagem1 + ", Dado 2 = " + rolagem2);
        int resultado = Math.max(rolagem1, rolagem2);
    
        return resultado;
    }

    public int rolarComDesvantagem() {
        int rolagem1 = rolarD20();
        int rolagem2 = rolarD20();
        System.out.println("Rolagem com Desvantagem: Dado 1 = " + rolagem1 + ", Dado 2 = " + rolagem2);
        int resultado = Math.min(rolagem1, rolagem2);
       
        return resultado;
    }
}
