import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        testes();
    }
    public static void testes(){

        ContaCorrente conta1 = new ContaCorrente();
        conta1.setSaldo(100);
        conta1.setChequeEspecial(50);
        conta1.setNumeroConta("1");
        conta1.setAgencia("123");
        Cliente cliente = new Cliente();
        conta1.setCliente(cliente);
        //cliente.getContatos().add(new Contato());
        Contato contato1 = new Contato();
        Contato contato2 = new Contato();
        ArrayList<Contato> contatos = new ArrayList<>();
        contatos.add(contato1);
        contatos.add(contato2);
        cliente.setContatos(contatos);
        cliente.getContatos().get(0).setTelefone("55555777777");
        cliente.getContatos().get(0).setTipo(1);
        cliente.getContatos().get(0).setDescricao("contato residencial");

        cliente.imprimirContatos();

        ContaCorrente conta2 = new ContaCorrente();
        conta2.setSaldo(150);
        conta2.setChequeEspecial(100);
        conta2.setNumeroConta("2");
        conta2.setAgencia("124");
        Cliente cliente2 = new Cliente();
        conta2.setCliente(cliente2);
        ArrayList<Contato> contatos2 = new ArrayList<>();
        Contato contato3 = new Contato();
        Contato contato4 = new Contato();
        contatos2.add(contato3);
        contatos2.add(contato4);
        cliente.setContatos(contatos2);

        double saldo1 = conta1.getSaldo();
        System.out.println(saldo1);

        conta1.depositar(10);
        double saldo2 = conta1.getSaldo();

        System.out.println(saldo2);


        double saldo3 = conta1.getSaldo();
        System.out.println(saldo3);

        conta1.sacar(10);

        double saldo4 = conta1.getSaldo();
        System.out.println(saldo4);

        double saldo5 = conta2.getSaldo();
        System.out.println(saldo5);
        conta1.transferir(conta2, 10);
        double saldo6 = conta1.getSaldo();
        double saldo7 = conta2.getSaldo();
        System.out.println(saldo6);
        System.out.println(saldo7);

        ContaPagamento conta3 = new ContaPagamento();
        conta3.setSaldo(120);
        conta3.setCliente(cliente);

        ContaPagamento conta5 = new ContaPagamento();
        conta5.setSaldo(1000);
        conta5.setCliente(cliente);

        double saldoPagamento = conta3.getSaldo();
        System.out.println(saldoPagamento);

        conta3.sacar(100);

        double saldoPagamento2 = conta3.getSaldo();
        System.out.println(saldoPagamento2);

        ContaPoupanca conta4 = new ContaPoupanca();
        ContaPoupanca conta6 = new ContaPoupanca();

        double saldoPagamento5 = conta4.getSaldo();
        System.out.println(saldoPagamento5);
        conta4.setSaldo(200);
        conta6.setSaldo(200);
        double saldoPagamento6 = conta4.getSaldo();
        System.out.println(saldoPagamento6);

        conta4.sacar(100);

        double saldoPagamento7 = conta4.getSaldo();
        System.out.println(saldoPagamento7);

        conta4.depositar(100);

        double saldoPagamento8 = conta4.getSaldo();
        System.out.println(saldoPagamento8);


        System.out.println(conta3.getSaldo());

        conta3.depositar(10);

        System.out.println(conta3.getSaldo());

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        conta1.transferir(conta2, 10);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());

        System.out.println(conta3.getSaldo());
        System.out.println(conta5.getSaldo());
        conta3.transferir(conta5, 10);
        System.out.println(conta3.getSaldo());
        System.out.println(conta5.getSaldo());

        System.out.println(conta4.getSaldo());
        System.out.println(conta6.getSaldo());
        conta4.transferir(conta6, 10);
        System.out.println(conta4.getSaldo());
        System.out.println(conta6.getSaldo());



        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        System.out.println(conta3.getSaldo());
        System.out.println(conta4.getSaldo());
        System.out.println(conta5.getSaldo());
        System.out.println(conta6.getSaldo());

    }

}