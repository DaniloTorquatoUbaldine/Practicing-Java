public abstract class Conta implements Movimentacao {
    private Cliente cliente;
    private String numeroConta;
    private String agencia;
    private double saldo;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        boolean realizado = false;
        saldo = saldo - valor;
        return realizado;
    }

    public boolean depositar(double valor) {
        boolean realizado = false;
        if (valor > 0) {
            saldo = saldo + valor;
        }
        return realizado;
    }

    public boolean transferir(Conta conta, double valor) {
        if (this.sacar(valor)) {
            if (conta.depositar(valor)) {
                return true;
            } else {
                this.depositar(valor);
                return false;
            }
        } else {
            return false;
        }
    }
}

