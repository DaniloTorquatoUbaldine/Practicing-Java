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
        Contato contato1 = this.getCliente().getContato1();
        Contato contato2 = this.getCliente().getContato2();
        contato1.imprimirContato();
        Endereco endereco1 = getCliente().getEndereco1();
        Endereco endereco2 = getCliente().getEndereco2();
        endereco1.imprimirEndereco();
        endereco2.imprimirEndereco();
    }
}
