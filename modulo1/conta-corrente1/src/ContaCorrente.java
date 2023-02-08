public class ContaCorrente {
    public Cliente cliente = new Cliente();
    public String numeroConta;
    public int agencia;
    public double saldo;
    public double chequeEspecial;

    public void imprimirContaCorrente(){
        System.out.println(cliente);
        System.out.println(numeroConta);
        System.out.println(agencia);
        System.out.println(saldo);
        System.out.println(chequeEspecial);
    }
    public boolean sacar(double valor){
        boolean realizado = false;
        double total = retornarSaldoComChequeEspecial();
        if (total > valor && valor > 0){
            realizado = true;
            saldo = saldo - valor;
        } else{
            System.out.println("Não há saldo suficiente.");
        }
        return realizado;
    }
    public boolean depositar(double valor){
        boolean realizado = true;
        saldo = saldo + valor;
        return realizado;
    }
    public double retornarSaldoComChequeEspecial(){
        double valor = this.saldo;
        double contraCheque = this.chequeEspecial;
        double total = valor + contraCheque;
        return total;
    }
    public boolean transferir(ContaCorrente conta, double valor){
        boolean realizado = false;
        double total = retornarSaldoComChequeEspecial();
        if (valor < total && valor > 0){
            saldo = saldo - valor;
            realizado = true;
            conta.depositar(10);
        } else{
            System.out.println("Não há saldo suficiente.");
        }
        return realizado;
    }

}
