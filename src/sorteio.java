import java.util.Random;

public class sorteio {
    public static void main(String[] args) {
        Random valor = new Random();
        int numero = valor.nextInt(6) + 1;
        int escolha = 3;

        System.out.println("O número escolhido foi " + escolha);
        System.out.println("O valor sorteado foi " + numero);
        if (numero == escolha) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou!");
        }
    }
}