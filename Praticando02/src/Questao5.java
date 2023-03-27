import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner leitorDoUsuario = new Scanner(System.in);
        double[][] matriz = {
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5},
                {4, 5, 6},
                {5, 6, 7},
                {6, 7, 8},
                {7, 8, 9},
                {8, 9, 10},
                {9, 10, 11},
                {10, 11, 12},
        };
        int y = 0;
        double soma1 = 0;
        double soma2 = 0;
        double soma3 = 0;
        int mercado = 0;
        double menorValor = 999999;
        for (int i = 0; i < 10; i++){
            soma1 = soma1 + matriz[i][y];
        }
        y=1;
        for (int i = 0; i < 10; i++){
            soma2 = soma2 + matriz[i][y];
        }
        y=2;
        for (int i = 0; i < 10; i++){
            soma3 = soma3 + matriz[i][y];
        }
        double[] vetor = {soma1, soma2, soma3};
        for (int i = 0; i < 3; i++){
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
                mercado = i + 1;
            }
        }
        System.out.println(soma1);
        System.out.println(soma2);
        System.out.println(soma3);
        System.out.println("O mercado mais barato para comprar é o " + mercado +  "°");
    }
}
