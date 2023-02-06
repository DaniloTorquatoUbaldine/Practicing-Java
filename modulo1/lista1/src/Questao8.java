/*
Essa classe é referente à oitava questão do módulo 1.
O algoritmo calcula o aumento no salário.
 */

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        //Constantes:
        final String CENTO_E_UM = "101";
        final String CENTO_E_UM_CARGO = "Gerente";
        final String CENTRO_E_DOIS = "102";
        final String CENTO_E_DOIS_CARGO = "Engenheiro";
        final String CENTO_E_TRES = "103";
        final String CENTO_E_TRES_CARGO = "Técnico";
        final String SALARIO = "O salário com reajuste será ";
        final String REAIS = " reais.";
        final String DIFERENCA = " A diferença entre o salário sem reajuste e com reajuste é de ";
        //Variáveis:
        float salarioReajustado = 0f;
        float diferenca = 0f;
        Scanner leitorDoUsuario = new Scanner(System.in);
        System.out.println("Digite o cargo (Gerente / Engenheiro / Técnico)");
        String cargo = leitorDoUsuario.nextLine();
        System.out.println("Informe o salário ");
        float salario = leitorDoUsuario.nextFloat();
        leitorDoUsuario.nextLine();
        //O algoritmo irá calcular o total:
        if (cargo.equals(CENTO_E_UM_CARGO)) {
            salarioReajustado = salario + (salario * 10)/100;
            diferenca = salarioReajustado - salario;
        } else if (cargo.equals(CENTO_E_DOIS_CARGO)) {
            salarioReajustado = salario + (salario * 20)/100;
            diferenca = salarioReajustado - salario;
        } else if (cargo.equals(CENTO_E_TRES_CARGO)){
            salarioReajustado = salario + (salario * 30)/100;
            diferenca = salarioReajustado - salario;
        } else {
            salarioReajustado = salario + (salario * 40)/100;
            diferenca = salarioReajustado - salario;
        }
        if (cargo.equals(CENTO_E_UM_CARGO) || cargo.equals(CENTO_E_DOIS_CARGO) || cargo.equals(CENTO_E_TRES_CARGO)) {
            print(SALARIO, REAIS, DIFERENCA, salarioReajustado, diferenca);
        } else {
            System.out.println("Cargo inválido.");
        }
    }
    public static void print(String SALARIO, String REAIS, String DIFERENCA, float salarioReajustado, float diferenca){
        System.out.println(SALARIO + salarioReajustado + REAIS + DIFERENCA + diferenca + REAIS);
    }
}
