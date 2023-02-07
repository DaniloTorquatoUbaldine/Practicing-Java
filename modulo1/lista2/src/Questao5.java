import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner leitorDoUsuario = new Scanner(System.in);
        double[][] matriz = new double[10][3];
        for (int i = 0;  i < 10; i = i + 1){
            for (int y = 0;  y < 3; y = y + 1){
                System.out.println("Digite o preço de cada produto no primeiro mercado, depois no segundo mercado e depois no terceiro mercado");
                double valor = leitorDoUsuario.nextDouble();
                leitorDoUsuario.nextLine();
                matriz[i][y] = valor;
            }
        }
        int y = 0;
        double media1 = 0;
        double soma1 = 0;
        for (int i = 0; i < 10; i = i + 1){
            soma1 = soma1 + matriz[i][y];
        }
        media1 = soma1 / 10;
        y = 1;
        double media2 = 0;
        double soma2 = 0;
        for (int i = 0; i < 10; i = i + 1){
            soma2 = soma2 + matriz[i][y];
        }
        media2 = soma2 / 10;
        y = 2;
        double media3 = 0;
        double soma3 = 0;
        for (int i = 0; i < 10; i = i + 1){
            soma3 = soma3 + matriz[i][y];
        }


        double[] vetor = new double[10];
        vetor[0] = soma1;
        vetor[1] = soma2;
        vetor[2] = soma3;

        double menorPreco = 9999999;
        int mercado = 0;

        if (soma1 < soma2 && soma1 < soma3){
            mercado = 1;
        }
        if (soma2 < soma1 && soma2 < soma3){
            mercado = 2;
        }
        if (soma3 < soma2 && soma3 < soma1){
            mercado = 3;
        }




        System.out.println("O mercado mais barato para comprar é o " + mercado + "°");

    }
}
