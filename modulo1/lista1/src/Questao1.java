/*
Essa classe é referente à primeira questão do módulo 1.
O algoritmo recebe informções do usuário e concatena
e imprime as informações na tela.
 */

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        //Constantes:
        final String SEU_NOME = "Olá seu nome é ";
        final String VOCE_TEM_IDADE = ", você tem ";
        final String CIDADE_NATAL = ", é da cidade de ";
        final String ESTADO = ", situada no estado da/de/do ";
        final String PONTO = ".";
        //Variáveis:
        Scanner leitorDoUsuario = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = leitorDoUsuario.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = leitorDoUsuario.nextInt();
        leitorDoUsuario.nextLine();
        System.out.println("Informe sua cidade natal: ");
        String cidadeNatal = leitorDoUsuario.nextLine();
        System.out.println("Informe seu estado: ");
        String estado = leitorDoUsuario.nextLine();
        print(SEU_NOME, VOCE_TEM_IDADE, CIDADE_NATAL, ESTADO, PONTO, nome, idade, cidadeNatal, estado);
    }
    public static void print(String SEU_NOME, String VOCE_TEM_IDADE, String CIDADE_NATAL, String ESTADO, String PONTO, String nome, int idade, String cidadeNatal, String estado){
        System.out.println(SEU_NOME + nome + VOCE_TEM_IDADE + idade + CIDADE_NATAL + cidadeNatal + ESTADO + estado + PONTO);
    }
}