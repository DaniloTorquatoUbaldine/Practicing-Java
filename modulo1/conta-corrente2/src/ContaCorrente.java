public class ContaCorrente extends Conta implements Impressao{
    //public Cliente cliente = new Cliente();
    //public String numeroConta;
    //public int agencia;
    private double chequeEspecial;
    //public double chequeEspecial;


    public void setChequeEspecial(double valor){
        this.chequeEspecial = valor;
    }

    public double retornarSaldoComChequeEspecial(){
        double valor = this.getSaldo();
        double total = valor + chequeEspecial;
        return total;
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
