/*
Essa classe é referente à quinta questão do módulo 1.
O algoritmo recebe as dimensões de um retângulo e
calcula a área.
 */

import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {
        //Constantes:
        final String AREA = "A área do triângulo é igual a ";
        final String UNIDADE = " m²";
        final String PONTO = ".";
        //Variáveis:
        float area;
        Scanner leitorDoUsuario = new Scanner(System.in);
        System.out.println("Informe o comprimento da base do triângulo em m²: ");
        float base = leitorDoUsuario.nextFloat();
        leitorDoUsuario.nextLine();
        System.out.println("Informe o comprimento da altura do triângulo em m²: ");
        float altura = leitorDoUsuario.nextFloat();
        leitorDoUsuario.nextLine();
        //O algoritmo irá calcular a área do triângulo a partir das dimensões informadas:
        area = (base * altura)/2;
        print(AREA, UNIDADE, PONTO, area);
    }
    public static void print(String AREA, String UNIDADE, String PONTO, float area){
        System.out.println(AREA + area + UNIDADE + PONTO);
    }
}
