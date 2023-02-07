import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        double[] vetor = {1,2,3,3,5,6,7,8,8,9};
        Scanner leitorDoUsuario = new Scanner(System.in);
        System.out.println("Digite um número de 0  a 10");
        double numeroEsolhido = leitorDoUsuario.nextDouble();
        leitorDoUsuario.nextLine();
        int contIgual = 0;
        int contMenor = 0;
        int contMaior = 0;
        for (double numero : vetor){
            if (numero == numeroEsolhido){
                contIgual = contIgual + 1;
            } else if (numeroEsolhido < numero){
                contMaior = contMaior + 1;
            } else {
                contMenor = contMenor + 1;
            }
        }
        System.out.println("Existem " + contIgual + " números iguais no vetor." + " Existem " + contMenor + " números menores no vetor." + " Existem " + contMaior + " núemros maiores no vetor.");
    }
}
