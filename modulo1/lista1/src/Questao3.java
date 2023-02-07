/*
Essa classe é referente à terceira questão do módulo 1.
O algoritmo fornece a tradução de palavras.
 */

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        //Constantes:
        final String TRADUCAO = "A tradução da palavra é ";
        final String PONTO = ".";
        //Variáveis:
        Scanner leitorDoUsuario = new Scanner(System.in);
        System.out.println("Digite a palavra que deseja traduzir (letras minúsuclas).");
        String palavra = leitorDoUsuario.nextLine();
        //O algoritmo irá tarduzir a palavra:
        if (palavra.equals("cachorro")){
            palavra = "dog";
            print(TRADUCAO, PONTO, palavra);
        } else if (palavra.equals("tempo")) {
            palavra = "time";
            print(TRADUCAO, PONTO, palavra);
        }else if (palavra.equals("amor")) {
            palavra = "love";
            print(TRADUCAO, PONTO, palavra);
        }else if (palavra.equals("cidade")) {
            palavra = "city";
            print(TRADUCAO, PONTO, palavra);
        }else if (palavra.equals("feliz")) {
            palavra = "happy";
            print(TRADUCAO, PONTO, palavra);
        }else if (palavra.equals("triste")) {
            palavra = "sad";
            print(TRADUCAO, PONTO, palavra);
        }else if (palavra.equals("deveria")) {
            palavra = "should";
            print(TRADUCAO, PONTO, palavra);
        }else if (palavra.equals("poderia")) {
            palavra = "could";
            print(TRADUCAO, PONTO, palavra);
        }else if (palavra.equals("dog")) {
            palavra = "cachorro";
            print(TRADUCAO, PONTO, palavra);
        }else if (palavra.equals("time")) {
            palavra = "tempo";
            print(TRADUCAO, PONTO, palavra);
        }else if (palavra.equals("love")) {
            palavra = "amor";
            print(TRADUCAO, PONTO, palavra);
        }else if (palavra.equals("city")) {
            palavra = "cidade";
            print(TRADUCAO, PONTO, palavra);
        }else if (palavra.equals("happy")) {
            palavra = "feliz";
            print(TRADUCAO, PONTO, palavra);
        }else if (palavra.equals("sad")) {
            palavra = "triste";
            print(TRADUCAO, PONTO, palavra);
        }else if (palavra.equals("should")) {
            palavra = "deveria";
            print(TRADUCAO, PONTO, palavra);
        }else if (palavra.equals("could")) {
            palavra = "poderia";
            print(TRADUCAO, PONTO, palavra);
        } else {
            System.out.println("Essa palavra não é válida.");
        }

    }
    public static void print(String TRADUCAO, String PONTO, String palavra){
        System.out.println(TRADUCAO + palavra + PONTO);
    }
}