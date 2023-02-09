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
    }
}
