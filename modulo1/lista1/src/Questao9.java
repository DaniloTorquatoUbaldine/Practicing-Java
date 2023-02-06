/*
Essa classe é referente à nona questão do módulo 1.
O algoritmo calcula a duração de um jogo.
 */

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        //Constantes:
        final String TEMPO_DE_DURACAO = "O tempo de duração do jogo foi de ";
        final String HORAS = " horas ";
        final String E = "e ";
        final String MINUTOS = " minutos.";
        //Variáveis:
        int tempoHoras = 0;
        int tempoMinutos = 0;
        Scanner leitorDoUsuario = new Scanner(System.in);
        System.out.println("Digite a hora de início do jogo (formatação 24 horas, exemplo: 14 = duas horas da tarde) O tempo máximo de jogo é 24 horas.");
        int inicioHora = leitorDoUsuario.nextInt();
        leitorDoUsuario.nextLine();
        System.out.println("Agora digite os minutos no momento do início do jogo (exemplo: 30).");
        int inicioMinutos = leitorDoUsuario.nextInt();
        leitorDoUsuario.nextLine();
        System.out.println("Digite a hora de finalização do jogo (formatação 24 horas, exemplo: 14 = duas horas da tarde) O tempo máximo de jogo é 24 horas.\"");
        int fimHora = leitorDoUsuario.nextInt();
        leitorDoUsuario.nextLine();
        System.out.println("Agora digite os minutos no momento da finalização do jogo (exemplo: 30).");
        int fimMinutos = leitorDoUsuario.nextInt();
        leitorDoUsuario.nextLine();
        //O algoritmo irá calcular o tempo de jogo.
        if (inicioHora <= fimHora && inicioMinutos <= fimMinutos) {
            tempoHoras = fimHora - inicioHora;
            tempoMinutos = fimMinutos - inicioMinutos;
        } else if (inicioHora <= fimHora &&  inicioMinutos >= fimMinutos){
            tempoHoras = fimHora - inicioHora - 1;
            tempoMinutos = (60 - inicioMinutos) + fimMinutos;
        } else if (inicioHora >= fimHora && inicioMinutos <= fimMinutos) {
            tempoHoras = (24 - inicioHora) + fimHora;
            tempoMinutos = fimMinutos - inicioMinutos;

        } else if (inicioHora >= fimHora && inicioMinutos >= fimMinutos) {
            tempoHoras = (24 - inicioHora) + fimHora - 1;
            tempoMinutos = (60 - inicioMinutos) + fimMinutos;
        }
        print(TEMPO_DE_DURACAO, HORAS, E, MINUTOS, tempoHoras, tempoMinutos);
    }
    public static void print(String TEMPO_DE_DURACAO, String HORAS, String E, String MINUTOS, int tempoHoras, int tempoMinutos){
        System.out.println(TEMPO_DE_DURACAO + tempoHoras + HORAS + E + tempoMinutos + MINUTOS);
    }
}
