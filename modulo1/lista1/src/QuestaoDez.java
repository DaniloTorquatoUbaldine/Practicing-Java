/*
Essa classe é referente à décima questão do módulo 1.
O algoritmo calcula o aproveitamento de um aluno.
 */

import java.util.Scanner;

public class QuestaoDez {
    public static void main(String[] args) {
        //Constantes:
        final String IDENTIFICACAO = "O número de identificação do aluno é ";
        final String NOTAS = ". As notas do aluno são: ";
        final String MEDIA = ". A média do aluno é ";
        final String CONCEITO = ". O conceito correspondente é ";
        final String SITUACAO = ". O aluno está ";
        final String PONTO = ".";
        //Variáveis:
        String situacao = "";
        float media = 0f;
        String conceito = "";
        Scanner leitorDoUsuario = new Scanner(System.in);
        System.out.println("Digite a identificação do aluno");
        String identificacao = leitorDoUsuario.nextLine();
        System.out.println("Digite a primeira nota (0 a 10).");
        float primeiraNota = leitorDoUsuario.nextFloat();
        leitorDoUsuario.nextLine();
        System.out.println("Agora digite a segunda nota (0 a 10).");
        float segundaNota = leitorDoUsuario.nextFloat();
        leitorDoUsuario.nextLine();
        System.out.println("Digite a terceira nota (0 a 10).");
        float terceiraNota = leitorDoUsuario.nextFloat();
        leitorDoUsuario.nextLine();
        //O alogritmo irá calcular a média e a situação.
        media = (primeiraNota + segundaNota + terceiraNota)/3;
        if (media >= 9 && media <= 10){
            situacao = "aprovado";
            conceito = "A";
        } else if (media >= 7.5 && media < 9) {
            situacao = "aprovado";
            conceito = "B";
        } else if (media >= 5 && media < 7.5) {
            situacao = "aprovado";
            conceito = "C";
        } else if (media >= 4 && media < 6) {
            situacao = "reprovado";
            conceito = "D";
        } else {
            situacao = "reprovado";
            conceito = "E";
        }
        print(IDENTIFICACAO, NOTAS, CONCEITO, MEDIA, SITUACAO, PONTO, identificacao, situacao, media, conceito, primeiraNota, segundaNota, terceiraNota);
    }
    public static void print(String IDENTIFICACAO, String NOTAS, String CONCEITO, String MEDIA,String SITUACACAO, String PONTO, String identificacao, String situacao, float media, String conceito, float primeiraNota, float segundaNota, float terceiraNota){
        System.out.println(IDENTIFICACAO + identificacao + NOTAS + primeiraNota + " " + segundaNota + " " + terceiraNota + MEDIA + media + CONCEITO + conceito + SITUACACAO + situacao + PONTO);
    }
}
