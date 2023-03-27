import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner leitorDoUsuario = new Scanner(System.in);
        String nome = "continuar";
        int cont = 0;
        int maiorAltura = 0;
        int maiorIdade = 0;
        int maiorPeso = 0;
        float media = 0f;
        int soma = 0;
        while (nome.equals("sair") == false) {
            System.out.println("Informe o nome do jogador ");
            String novoNome = leitorDoUsuario.nextLine();
            nome = novoNome;
            if (nome.equals("sair") == false){
                System.out.println("Informe a altura do jogador (em cm, exemplo: 170) ");
                int novaAltura = leitorDoUsuario.nextInt();
                leitorDoUsuario.nextLine();
                System.out.println("Informe o peso do jogador (em kg, exemplo: 70) ");
                int novoPeso = leitorDoUsuario.nextInt();
                leitorDoUsuario.nextLine();
                System.out.println("Informe a idade do jogador, exemplo: 25 ");
                int novaIdade = leitorDoUsuario.nextInt();
                leitorDoUsuario.nextLine();
                cont = cont + 1;
                soma = soma + novaAltura;
                if (novaAltura > maiorAltura) {
                    maiorAltura = novaAltura;
                }
                if (novaIdade > maiorIdade) {
                    maiorIdade = novaIdade;
                }
                if (novoPeso > maiorPeso) {
                    maiorPeso = novoPeso;
                }
            }
        }
        media = soma/cont;

        System.out.println("A quantidade de jogadores cadastrados foi " + cont + ". A altura do maior jogador é " + maiorAltura + " cm " + ". O jogador mais velho tem " + maiorIdade + " anos" + ". O jogador mais pesado pesa " + maiorPeso + " kg" + ". A média das alturas é " + media + " cm.");

    }
}
