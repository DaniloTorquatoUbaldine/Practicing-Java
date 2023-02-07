import java.util.Scanner;
import java.util.Random;

public class Questao2 {
    public static void main(String[] args) {
        Scanner leitorDoUsuario = new Scanner(System.in);
        System.out.println("Tente adivinhar o número que pensei.. (0 a 20)");
        int escolha = leitorDoUsuario.nextInt();
        leitorDoUsuario.nextLine();
        Random random = new Random();
        int numero = random.nextInt(20);
        while (numero != escolha){
            if (escolha < numero){
                System.out.println("O némero que pensei está entre" + " " + escolha + " e " + "20");
            } else {
                System.out.println("O némero que pensei está entre" + " " + escolha + " e " + "0");
            }
            System.out.println("Tente novamente.. ");
            int novaEscolha = leitorDoUsuario.nextInt();
            escolha = novaEscolha;
        }
        System.out.println("Acertou!!");

    }
}
