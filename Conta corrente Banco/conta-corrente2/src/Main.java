public class Main {
    public static void main(String[] args) {
        testes();
    }
    public static void testes(){
        Contato[] contatos1 = new Contato[2];
        contatos1[0] = new Contato();
        contatos1[0].setTipo(1);
        contatos1[0].setTelefone("5555555");
        contatos1[0].setDescricao("Contato residencial");

        Endereco[] endereco1 = new Endereco[2];
        endereco1[0] = new Endereco();
        endereco1[0].setTipo(1);
        endereco1[0].setPais("Brasil");
        endereco1[0].setCidade("Campina Grande");
        endereco1[0].setCep("Brasil");
        endereco1[0].setLogradouro("Rua Claudino Ramos colaço");
        endereco1[0].setNumero(21);
        endereco1[0].setComplemento("Apartamento 10");
        endereco1[0].setEstado("Paraíba");


        ContaCorrente novaConta1 = new ContaCorrente();
        ContaCorrente novaConta2 = new ContaCorrente();
        ContaPoupanca novaConta3 = new ContaPoupanca();
        ContaPoupanca novaConta4 = new ContaPoupanca();
        novaConta3.setAgencia("10");
        novaConta3.setNumeroConta("15");
        novaConta3.setSaldo(10);
        novaConta4.setAgencia("11");
        novaConta4.setNumeroConta("16");
        novaConta4.setSaldo(20);
        novaConta2.setSaldo(10);
        novaConta2.setChequeEspecial(10);
        novaConta1.setAgencia("1");
        novaConta1.setNumeroConta("123");
        novaConta1.setCliente(new Cliente());
        novaConta1.setSaldo(100);
        novaConta1.setChequeEspecial(100);
        double saldo = novaConta1.getSaldo();
        System.out.println(saldo);
        String agencia = novaConta1.getAgencia();
        System.out.println(agencia);
        String numero = novaConta1.getNumeroConta();
        System.out.println(numero);
        Cliente cliente = novaConta1.getCliente();


        cliente.setNome("Danilo Torquato Ubaldine");
        cliente.setCpf("11111111111");

        contatos1[1] = new Contato();
        contatos1[1].setDescricao("Contato comercial");
        contatos1[1].setTipo(2);
        contatos1[1].setTelefone("3333333");
        contatos1[1].imprimirContato();

        int contato1Tipo= contatos1[0].getTipo();
        System.out.println(contato1Tipo);
        String contato1Telefone = contatos1[0].getTelefone();
        System.out.println(contato1Telefone);
        String contato1Descricao = contatos1[0].getDescricao();
        System.out.println(contato1Descricao);

        int contato2Tipo= contatos1[1].getTipo();
        System.out.println(contato2Tipo);
        String contato2Telefone = contatos1[1].getTelefone();
        System.out.println(contato2Telefone);
        String contato2Descricao = contatos1[1].getDescricao();
        System.out.println(contato2Descricao);

        int endereco1Tipo = endereco1[0].getTipo();
        String endereco1Pais =endereco1[0].getPais();
        String endereco1estado =endereco1[0].getEstado();
        String endereco1Cep =endereco1[0].getCep();
        int endereco1Numero =endereco1[0].getNumero();
        String endereco1Complemento =endereco1[0].getComplemento();
        String endereco1Logradouro =endereco1[0].getLogradouro();
        String endereco1Cidade =endereco1[0].getCidade();
        System.out.println(endereco1Cep + " " + endereco1Cidade + " " + endereco1estado + " " + endereco1Pais + " " + endereco1Logradouro + " " + endereco1Complemento + " "+ endereco1Numero + " tipo " +endereco1Tipo + endereco1Tipo );

        String cliente1 = cliente.getNome();
        System.out.println(cliente1);
        double saldoTotal = novaConta1.retornarSaldoComChequeEspecial();
        System.out.println(saldoTotal);
        novaConta1.depositar(10);
        double saldoTotal2 = novaConta1.retornarSaldoComChequeEspecial();
        System.out.println(saldoTotal2);
        novaConta1.sacar(10);
        double saldoTotal3 = novaConta1.retornarSaldoComChequeEspecial();
        System.out.println(saldoTotal3);
        novaConta1.transferir(novaConta2, 10);
        double saldoTotal4 = novaConta1.retornarSaldoComChequeEspecial();
        System.out.println(saldoTotal4);
        double saldoTotal5 = novaConta2.retornarSaldoComChequeEspecial();
        System.out.println(saldoTotal5);

        double saldoPoupanca3 = novaConta3.getSaldo();
        System.out.println(saldoPoupanca3);
        novaConta3.creditarTaxa();
        double saldoPoupanca31 = novaConta3.getSaldo();
        System.out.println(saldoPoupanca31);

        //Testando deixar sem alguns atributos para ver o resultado. E testando deixar sem um dos objetos para ver o resultado com o try/catch.

        cliente.imprimirContatos();

        cliente.getContatos()[0] = new Contato();
        cliente.getContatos()[0].setDescricao("Conta comercial");
        cliente.getContatos()[0].setTelefone("333333333");
        cliente.getContatos()[0].setTipo(1);

        cliente.getContatos()[1] = new Contato();
        cliente.getContatos()[1].setDescricao("Conta residencial");
        cliente.getContatos()[1].setTelefone("777777777");
        cliente.getContatos()[1].setTipo(2);

        cliente.imprimirContatos();

        cliente.imprimirEnderecos();


        cliente.getEnderecos()[0] = new Endereco();
        cliente.getEnderecos()[0].setEstado("Paraíba");
        cliente.getEnderecos()[0].setLogradouro("Rua Claudino Ramos Colaço");
        cliente.getEnderecos()[0].setTipo(1);
        cliente.getEnderecos()[0].setCep("777777777");
        cliente.getEnderecos()[0].setCidade("Campina Grande");

        cliente.getEnderecos()[1] = new Endereco();
        cliente.getEnderecos()[1].setEstado("Pernambuco");
        cliente.getEnderecos()[1].setLogradouro("Rua exemplo");
        cliente.getEnderecos()[1].setTipo(2);
        cliente.getEnderecos()[1].setCep("99999999");
        cliente.getEnderecos()[1].setCidade("Recife");

        cliente.imprimirEnderecos();

    }

}