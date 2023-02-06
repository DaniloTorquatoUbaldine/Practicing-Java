/*
Essa classe é referente à quarta questão do módulo 1.
O algoritmo fornece a tradução de palavras.
 */
public class Questao4 {
    public static void main(String[] args) {
        //Constantes:
        final String A = "A é igual a ";
        final String B = ". B é igual a ";
        final String PONTO = ".";
        //Variáveis:
        int a = 10;
        int b = 20;
        int temp;
        //Primeiro o algoritmo vai printar os valores originais.
        print(A, B, PONTO, a, b);
        //O algoritmo irá realocar as variáveis utilizando a variável temporária.
        temp = a;
        a = b;
        b = temp;
        print(A, B, PONTO, a, b);
    }
    public static void print(String A, String B, String PONTO, int a, int b){
        System.out.println(A + a + B + b + PONTO);
    }
}