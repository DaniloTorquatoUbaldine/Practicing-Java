import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner leitorDoUsuario = new Scanner(System.in);
        System.out.println("Informe o produto ");
        String produto = leitorDoUsuario.nextLine();
        System.out.println("Informe o valor do produto ");
        float valor = leitorDoUsuario.nextFloat();
        leitorDoUsuario.nextLine();
        float desconto = 0.05f;
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println(i + 1 + " " + produto + " " + "x" + " " + "R$" + " " + (valor-(valor*desconto)) + " " + "=" + " " + "R$" + " "+ ((i + 1) * (valor-(valor*desconto))));
            if (desconto < 0.5) {
                desconto = desconto + 0.05f;
            }
        }
    }
}
