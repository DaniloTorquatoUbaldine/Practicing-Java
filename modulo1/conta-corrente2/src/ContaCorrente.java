public class ContaCorrente extends Conta implements Impressao{
    private double chequeEspecial;


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
