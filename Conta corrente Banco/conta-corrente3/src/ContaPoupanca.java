public class ContaPoupanca extends Conta implements Impressao{
    static  final double JUROS_MENSAL = 1.01;

    public void creditarTaxa(){
        double saldo = this.getSaldo();
        saldo = saldo * JUROS_MENSAL;
        this.setSaldo(saldo);
    }

    @Override
    public void imprimir() {
        Cliente cliente = this.getCliente();
        cliente.imprimirEnderecos();
        cliente.imprimirContatos();

    }
}
