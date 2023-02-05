/*
Essa classe é referente à sétima questão do módulo 1.
O algoritmo calcula o preço total.
 */

import java.util.Scanner;

public class QuestaoSete {
    public static void main(String[] args) {
        //Constantes:
        final String ABCD = "ABCD";
        final float ABCDPRECO = 5.30f;
        final String XYPK = "XYPK";
        final float XYPKPRECO = 6.00f;
        final String KLMP = "KLMP";
        final float KLMPPRECO = 3.20f;
        final String QRST = "QRST";
        final float QRSTPRECO = 2.50f;
        final String PRECO = "O preço total é ";
        final String REAIS = " reais.";
        //Variáveis:
        boolean validacaoCodigo = false;
        float preco = 0f;
        Scanner leitorDoUsuario = new Scanner(System.in);
        System.out.println("Digite o código (ABCD / XYPK / KLMP / QRST)");
        String codigo = leitorDoUsuario.nextLine();
        //O algoritmo irá validar o código e calcular o total:
        if (codigo.equals(ABCD) || codigo.equals(XYPK) || codigo.equals(KLMP) || codigo.equals(QRST)) {
            validacaoCodigo = true;
            System.out.println("Informe a quantidade ");
            int quantidade = leitorDoUsuario.nextInt();
            leitorDoUsuario.nextLine();
            if (codigo.equals(ABCD) && validacaoCodigo == true) {
                preco = ABCDPRECO * quantidade;
            } else if (codigo.equals(XYPK) && validacaoCodigo == true) {
                preco = XYPKPRECO * quantidade;
            } else if (codigo.equals(KLMP) && validacaoCodigo == true) {
                preco = KLMPPRECO * quantidade;
            } else if (codigo.equals(QRST) && validacaoCodigo == true) {
                preco = QRSTPRECO * quantidade;
            }
        } else {
            System.out.println("Código inválido.");
        }
        if (validacaoCodigo == true){
            print(PRECO, REAIS, preco);
        }
    }
    public static void print(String PRECO, String REAIS, float preco){
        System.out.println(PRECO + preco + REAIS);
    }
}