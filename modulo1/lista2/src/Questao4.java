import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner leitorDoUsuario = new Scanner(System.in);
        double[][] matriz = new double[5][4];
        for (int i = 0;  i < 5; i = i + 1){
            for (int y = 0;  y < 4; y = y + 1){
                if (y == 3){
                    matriz[i][3] = (matriz[i][1] * 0.6) + (matriz[i][2] * 0.4);
                } else {
                    System.out.println("Digite as informações na ordem: número da matrícula, média da prova, média do trabalho. para cada aluno.");
                    double valor = leitorDoUsuario.nextDouble();
                    leitorDoUsuario.nextLine();
                    matriz[i][y] = valor;
                }
            }
        }
        int y  = 3;
        double maiorNota = 0;
        int matricula  = -1;
        double media = 0;
        double soma = 0;
        for (int i = 0; i < 5; i = i + 1){
            if (matriz[i][y] > maiorNota){
                maiorNota = matriz[i][y];
                matricula = i;
            }
            soma = soma + matriz[i][y];
        }
        media = soma / 5;
        System.out.println("A matrícula que obteve a maior nota foi " + matriz[matricula][0] + ". A média das notas finais é " + media + ".");
    }
}
