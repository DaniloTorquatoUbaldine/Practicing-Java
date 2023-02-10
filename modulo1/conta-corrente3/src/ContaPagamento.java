public class ContaPagamento extends Conta implements Impressao{
    static final double TAXA_SAQUE = 4.25;

    @Override
    public void imprimir() {

    }

    @Override
    public boolean sacar(double valor) {
        boolean realizado = false;
        double saldo = this.getSaldo();
        if (valor > 0){
            if ((valor + TAXA_SAQUE) <= saldo){
                double novoSaldo = saldo - valor - TAXA_SAQUE;
                realizado = true;
                this.setSaldo(novoSaldo);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("O valor não pode ser negativo");
        }
        return realizado;
    }
}
