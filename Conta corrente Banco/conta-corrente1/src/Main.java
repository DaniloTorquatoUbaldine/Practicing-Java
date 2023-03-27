public class Main {
    public static void main(String[] args) {
        testes();
    }
    public static void testes(){
        ContaCorrente novaConta1 = new ContaCorrente();
        novaConta1.cliente.nome = "Danilo Torquato Ubaldine";
        novaConta1.numeroConta = "123";
        novaConta1.agencia = 1;
        novaConta1.saldo = 100;
        novaConta1.chequeEspecial = 100;
        novaConta1.cliente.cpf = "11111111111";

        ContaCorrente novaConta2 = new ContaCorrente();
        novaConta2.cliente.nome = "Joao Augusto";
        novaConta2.numeroConta = "124";
        novaConta2.agencia = 2;
        novaConta2.saldo = 50;
        novaConta2.chequeEspecial = 50;
        novaConta2.cliente.cpf = "22222222222";

        novaConta1.cliente.contato1.descricao = "Contato residencial";
        novaConta1.cliente.contato1.telefone = "555555555";
        novaConta1.cliente.contato1.tipo = 1;

        novaConta1.cliente.contato2.descricao = "Contato comercial";
        novaConta1.cliente.contato2.telefone = "888888888";
        novaConta1.cliente.contato2.tipo = 2;

        novaConta1.cliente.endereco1.tipo = 1;
        novaConta1.cliente.endereco1.logradouro = "Rua Claudino Ramos colaço";
        novaConta1.cliente.endereco1.numero = 21;
        novaConta1.cliente.endereco1.complemento = "Apartamento 201";
        novaConta1.cliente.endereco1.cep = "22222222";
        novaConta1.cliente.endereco1.cidade = "Campina Grande";
        novaConta1.cliente.endereco1.estado = "Paraíba";
        novaConta1.cliente.endereco1.pais = "Brasil";

        novaConta1.cliente.endereco2.tipo = 2;
        novaConta1.cliente.endereco2.logradouro = "Rua Exemplo";
        novaConta1.cliente.endereco2.numero = 10;
        novaConta1.cliente.endereco2.complemento = "10° andar";
        novaConta1.cliente.endereco2.cep = "33333333";
        novaConta1.cliente.endereco2.cidade = "Campina Grande";
        novaConta1.cliente.endereco2.estado = "Paraíba";
        novaConta1.cliente.endereco2.pais = "Brasil";

        novaConta1.cliente.imprimirContatos();
        novaConta1.cliente.imprimirEnderecos();

        novaConta1.cliente.contato1.imprimirContato();
        novaConta1.cliente.endereco1.imprimirEndereco();

        double total = novaConta1.retornarSaldoComChequeEspecial();
        System.out.println(total);

        boolean tentarSacer = novaConta1.sacar(150);
        System.out.println(tentarSacer);
        System.out.println(novaConta1.saldo);

        boolean tentarDepositar = novaConta1.depositar(100);
        System.out.println(tentarDepositar);
        System.out.println(novaConta1.saldo);

        boolean tentarTransferir = novaConta1.transferir(novaConta2, 10);
        System.out.println(tentarTransferir);
        System.out.println(novaConta1.saldo);
        System.out.println(novaConta2.saldo);

        novaConta1.cliente.imprimirCliente();

    }

}
