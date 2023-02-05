/*
Essa classe é referente à sexta questão do módulo 1.
O algoritmo recebe as dimensões de eleitores e imprime
os percentuais.
 */

import java.util.Scanner;

public class QuestaoSeis {
    public static void main(String[] args) {
        //Constantes:
        final String QUANTIDADE_DE_VOTOS = "A quantidade de votos";
        final String FOI = " foi ";
        final String EM_RELACAO = " em relação ao total de eleitores";
        final String BRANCOS = " brancos";
        final String NULOS = " nulos";
        final String VALIDOS = " válidos";
        final String POR_CENTO = "%";
        final String PONTO = ". ";
        //Variáveis:
        float percentualValidos;
        float percentualBrancos;
        float percentualNulos;
        Scanner leitorDoUsuario = new Scanner(System.in);
        System.out.println("Informe o total de eleitores ");
        float total = leitorDoUsuario.nextFloat();
        leitorDoUsuario.nextLine();
        System.out.println("Informe o total votos brancos ");
        float brancos = leitorDoUsuario.nextFloat();
        leitorDoUsuario.nextLine();
        System.out.println("Informe o total votos nulos ");
        float nulos = leitorDoUsuario.nextFloat();
        leitorDoUsuario.nextLine();
        //O algoritmo vai calcular os percentuais:
        percentualValidos = (brancos + nulos)/(total)*100;
        percentualBrancos = (brancos)/(total)*100;
        percentualNulos = (nulos)/(total)*100;
        print(QUANTIDADE_DE_VOTOS, FOI, EM_RELACAO, BRANCOS, NULOS, VALIDOS, POR_CENTO, PONTO, total, brancos, nulos, percentualValidos, percentualNulos, percentualBrancos);
    }
    public static void print(String QUANTIDADE_DE_VOTOS, String FOI, String EM_RELACAO, String BRANCOS, String NULOS, String VALIDOS, String POR_CENTRO, String PONTO, float total, float brancos, float nulos, float percentualValidos, float percentualNulos, float percentualBrancos){
        System.out.println(QUANTIDADE_DE_VOTOS + VALIDOS + EM_RELACAO + FOI + percentualValidos + POR_CENTRO + PONTO + QUANTIDADE_DE_VOTOS + BRANCOS + EM_RELACAO + FOI + percentualBrancos + POR_CENTRO + PONTO +QUANTIDADE_DE_VOTOS + NULOS + EM_RELACAO + FOI + percentualNulos + POR_CENTRO + PONTO);
    }
}
