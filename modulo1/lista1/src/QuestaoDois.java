/*
Essa classe é referente à segunda questão do módulo 1.
O algoritmo fornece informações sobre uma determinada
cidade e estado.
 */

import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        //Constantes:
        final String POPULACAO = "A cidade tem ";
        final String HABITANTES = " habitantes, ";
        final String FESTA = "a principal festa da cidade é: ";
        final String REGIAO = ", e está situada na região ";
        final String PONTO = ".";
        //Variáveis:
        int habitantes;
        String festa;
        String regiao;
        Scanner leitorDoUsuario = new Scanner(System.in);
        System.out.println("Informe o estado da cidade que deseja obter informações (Rio Grande do Sul/ Paraíba / Pernambuco): ");
        String estado = leitorDoUsuario.nextLine();
        System.out.println("Informe a cidade que deseja obter informações (Rio Grande do Sul: Porto Alegre/Pelotas; Paraíba: João Pessoa/Campina Grande; Pernambuco: Recife/Caruaru): ");
        String cidade = leitorDoUsuario.nextLine();
        //O algoritmo irá escolher entres as opções com as informações do usuário:
        if (estado.equals("Rio Grande do Sul")){
            if (cidade.equals("Porto Alegre")) {
                habitantes = 1409351;
                festa = "o Carnaval";
                regiao = "Sul";
                print(POPULACAO, HABITANTES, FESTA, REGIAO, PONTO, habitantes, festa, regiao);
            } else if (cidade.equals("Pelotas")) {
                habitantes = 343132;
                festa = "a Fenadoce";
                regiao = "Sul";
                print(POPULACAO, HABITANTES, FESTA, REGIAO, PONTO, habitantes, festa, regiao);
            }
        } else if (estado.equals("Paraíba")){
            if (cidade.equals("João Pessoa")) {
                habitantes = 817511;
                festa = "o Fest Verão";
                regiao = "Nordeste";
                print(POPULACAO, HABITANTES, FESTA, REGIAO, PONTO, habitantes, festa, regiao);
            } else if (cidade.equals("Campina Grande")) {
                habitantes = 402912;
                festa = "o São João";
                regiao = "Nordeste";
                print(POPULACAO, HABITANTES, FESTA, REGIAO, PONTO, habitantes, festa, regiao);
            }
        } else if (estado.equals("Pernambuco")){
            if (cidade.equals("Recife")) {
                habitantes = 1653461;
                festa = "o Carnaval";
                regiao = "Nordeste";
                print(POPULACAO, HABITANTES, FESTA, REGIAO, PONTO, habitantes, festa, regiao);
            } else if (cidade.equals("Caruaru")) {
                habitantes = 365278;
                festa = "o São João";
                regiao = "Nordeste";
                print(POPULACAO, HABITANTES, FESTA, REGIAO, PONTO, habitantes, festa, regiao);
            }
        } else {
            System.out.println("A cidade ou estado não está entre as opções. Por favor, tente novamente.");
        }
    }
    public static void print(String POPULACAO, String HABITANTES, String FESTA, String REGIAO, String PONTO, int habitantes, String festa, String regiao){
        System.out.println(POPULACAO + habitantes + HABITANTES + FESTA + festa + REGIAO + regiao +  PONTO);
    }
}