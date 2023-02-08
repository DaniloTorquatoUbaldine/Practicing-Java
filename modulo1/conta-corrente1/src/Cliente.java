public class Cliente {
    public String nome;
    public String cpf;
    public Contato contato1 = new Contato();
    public Contato contato2 = new Contato();
    private Contato[] contatos = {contato1, contato2};
    public Endereco endereco1 = new Endereco();
    public Endereco endereco2 = new Endereco();
    public Endereco enderecos[] = {endereco1, endereco2};
    public void imprimirContatos(){
            System.out.println("Contato1:" + contato1.descricao + " " + contato1.telefone + " " + contato1.tipo + "." );
            System.out.println("Contato2: " + contato2.descricao + " " + contato2.telefone + " " + contato2.tipo + "." );
    }
    public void imprimirEnderecos(){
            System.out.println("Endereco1: " + endereco1.logradouro + " " + endereco1.complemento + " " + " número:" + endereco1.numero + " " + " cep: " + endereco1.cep + " " + endereco1.cidade + " " + endereco1.estado + " " + endereco1.pais + " " + " tipo:" + endereco1.tipo);
            System.out.println("Endereco2: " + endereco2.logradouro + " " + endereco2.complemento + " " + " número:"  + endereco2.numero + " " +  " cep: " + endereco2.cep + " " + endereco2.cidade + " " + endereco2.estado + " " + endereco2.pais + " " + " tipo:" + endereco2.tipo);
    }
    public void imprimirCliente(){
            System.out.println(nome);
            System.out.println(cpf);
    }
}
