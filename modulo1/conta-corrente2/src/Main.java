public class Main {
    public static void main(String[] args) {
        testes();
    }
    public static void testes(){
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
        cliente.setContato1(new Contato());
        Contato contato1 = cliente.getContato1();
        contato1.setDescricao("Contato residencial");
        contato1.setTipo(1);
        contato1.setTelefone("5555555");
        contato1.imprimirContato();
        cliente.setEndereco1(new Endereco());
        Endereco endereco1 = cliente.getEndereco1();
        endereco1.setLogradouro("Rua Claudino Ramos colaço");
        endereco1.setNumero(21);
        endereco1.setComplemento("Apartamento 10");
        endereco1.setCep("11111111");
        endereco1.setCidade("Campina Grande");
        endereco1.setEstado("Paraíba");
        endereco1.setPais("Brasil");
        endereco1.setTipo(1);
        endereco1.imprimirEndereco();
        cliente.setNome("Danilo Torquato Ubaldine");
        cliente.setCpf("11111111111");

        cliente.setContato2(new Contato());
        Contato contato2 = cliente.getContato2();
        contato2.setDescricao("Contato comercial");
        contato2.setTipo(2);
        contato2.setTelefone("66666666");
        contato2.imprimirContato();
        cliente.setEndereco2(new Endereco());
        Endereco endereco2 = cliente.getEndereco2();
        endereco2.setLogradouro("Rua Exemplo");
        endereco2.setNumero(10);
        endereco2.setComplemento("Apartamento 2");
        endereco2.setCep("22222222");
        endereco2.setCidade("Campina Grande");
        endereco2.setEstado("Paraíba");
        endereco2.setPais("Brasil");
        endereco2.setTipo(2);
        endereco2.imprimirEndereco();

        int contato1Tipo= contato1.getTipo();
        System.out.println(contato1Tipo);
        String contato1Telefone = contato1.getTelefone();
        System.out.println(contato1Telefone);
        String contato1Descricao = contato1.getDescricao();
        System.out.println(contato1Descricao);

        int contato2Tipo= contato2.getTipo();
        System.out.println(contato2Tipo);
        String contato2Telefone = contato2.getTelefone();
        System.out.println(contato2Telefone);
        String contato2Descricao = contato2.getDescricao();
        System.out.println(contato2Descricao);

        int endereco1Tipo = endereco1.getTipo();
        String endereco1Pais =endereco1.getPais();
        String endereco1estado =endereco1.getEstado();
        String endereco1Cep =endereco1.getCep();
        int endereco1Numero =endereco1.getNumero();
        String endereco1Complemento =endereco1.getComplemento();
        String endereco1Logradouro =endereco1.getLogradouro();
        String endereco1Cidade =endereco1.getCidade();
        System.out.println(endereco1Cep + " " + endereco1Cidade + " " + endereco1estado + " " + endereco1Pais + " " + endereco1Logradouro + " " + endereco1Complemento + " "+ endereco1Numero + " tipo " +endereco1Tipo + endereco1Tipo );

        int endereco2Tipo = endereco2.getTipo();
        String endereco2Pais =endereco2.getPais();
        String endereco2estado =endereco2.getEstado();
        String endereco2Cep =endereco2.getCep();
        int endereco2Numero =endereco2.getNumero();
        String endereco2Complemento =endereco2.getComplemento();
        String endereco2Logradouro =endereco2.getLogradouro();
        String endereco2Cidade =endereco2.getCidade();
        System.out.println(endereco2Cep + " " + endereco2Cidade + " " + endereco2estado + " " + endereco2Pais + " " + endereco2Logradouro + " " + endereco2Complemento + " "+ endereco2Numero + " tipo " + endereco2Tipo + endereco1Tipo );

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

        novaConta1.imprimir();


        //cliente.setContatos([contato1, contato2]);
        //cliente.setEndereco1({endereco1, endereco2);
//        novaConta1.cliente.nome = "Danilo Torquato Ubaldine";
//        novaConta1.numeroConta = "123";
//        novaConta1.agencia = 1;
//        novaConta1.saldo = 100;
//        novaConta1.chequeEspecial = 100;
//        novaConta1.cliente.cpf = "11111111111";
//
//        ContaCorrente novaConta2 = new ContaCorrente();
//        novaConta2.cliente.nome = "Joao Augusto";
//        novaConta2.numeroConta = "124";
//        novaConta2.agencia = 2;
//        novaConta2.saldo = 50;
//        novaConta2.chequeEspecial = 50;
//        novaConta2.cliente.cpf = "22222222222";
//
//        novaConta1.cliente.contato1.descricao = "Contato residencial";
//        novaConta1.cliente.contato1.telefone = "555555555";
//        novaConta1.cliente.contato1.tipo = 1;
//
//        novaConta1.cliente.contato2.descricao = "Contato comercial";
//        novaConta1.cliente.contato2.telefone = "888888888";
//        novaConta1.cliente.contato2.tipo = 2;
//
//        novaConta1.cliente.endereco1.tipo = 1;
//        novaConta1.cliente.endereco1.logradouro = "Rua Claudino Ramos colaço";
//        novaConta1.cliente.endereco1.numero = 21;
//        novaConta1.cliente.endereco1.complemento = "Apartamento 201";
//        novaConta1.cliente.endereco1.cep = "22222222";
//        novaConta1.cliente.endereco1.cidade = "Campina Grande";
//        novaConta1.cliente.endereco1.estado = "Paraíba";
//        novaConta1.cliente.endereco1.pais = "Brasil";
//
//        novaConta1.cliente.endereco2.tipo = 2;
//        novaConta1.cliente.endereco2.logradouro = "Rua Exemplo";
//        novaConta1.cliente.endereco2.numero = 10;
//        novaConta1.cliente.endereco2.complemento = "10° andar";
//        novaConta1.cliente.endereco2.cep = "33333333";
//        novaConta1.cliente.endereco2.cidade = "Campina Grande";
//        novaConta1.cliente.endereco2.estado = "Paraíba";
//        novaConta1.cliente.endereco2.pais = "Brasil";
//
//        novaConta1.cliente.imprimirContatos();
//        novaConta1.cliente.imprimirEnderecos();
//
//        novaConta1.cliente.contato1.imprimirContato();
//        novaConta1.cliente.endereco1.imprimirEndereco();
//
//        double total = novaConta1.retornarSaldoComChequeEspecial();
//        System.out.println(total);
//
//        boolean tentarSacer = novaConta1.sacar(150);
//        System.out.println(tentarSacer);
//        System.out.println(novaConta1.saldo);
//
//        boolean tentarDepositar = novaConta1.depositar(100);
//        System.out.println(tentarDepositar);
//        System.out.println(novaConta1.saldo);
//
//        boolean tentarTransferir = novaConta1.transferir(novaConta2, 10);
//        System.out.println(tentarTransferir);
//        System.out.println(novaConta1.saldo);
//        System.out.println(novaConta2.saldo);
//
//        novaConta1.cliente.imprimirCliente();

    }

}
