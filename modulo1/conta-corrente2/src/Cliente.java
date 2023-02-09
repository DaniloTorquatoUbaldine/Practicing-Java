public class Cliente {
    private String nome;
    private String cpf;
    private Contato contato1 = new Contato();
    private Contato contato2 = new Contato();
    private Contato[] contatos = {contato1, contato2};
    private Endereco endereco1 = new Endereco();
    private Endereco endereco2 = new Endereco();
    private Endereco[] enderecos = {endereco1, endereco2};
    public void imprimirContatos(){
            for (Contato contato : contatos){
                System.out.println("Contato:" + contato.getDescricao() + " " + contato.getTelefone() + " " + contato.getTipo() + "." );
            }
            //System.out.println("Contato1:" + contato1.descricao + " " + contato1.telefone + " " + contato1.tipo + "." );
            //System.out.println("Contato2: " + contato2.descricao + " " + contato2.telefone + " " + contato2.tipo + "." );
    }
    public void imprimirEnderecos(){
            for (Endereco endereco: enderecos){
                System.out.println("Endereco: " + endereco.getLogradouro() + " " + endereco.getComplemento() + " " + " número:" + endereco.getNumero() + " " + " cep: " + endereco.getCep() + " " + endereco.getCidade() + " " + endereco.getEstado() + " " + endereco.getPais() + " " + " tipo:" + endereco.getTipo());
            }
            //System.out.println("Endereco1: " + endereco1.logradouro + " " + endereco1.complemento + " " + " número:" + endereco1.numero + " " + " cep: " + endereco1.cep + " " + endereco1.cidade + " " + endereco1.estado + " " + endereco1.pais + " " + " tipo:" + endereco1.tipo);
            //System.out.println("Endereco2: " + endereco2.logradouro + " " + endereco2.complemento + " " + " número:"  + endereco2.numero + " " +  " cep: " + endereco2.cep + " " + endereco2.cidade + " " + endereco2.estado + " " + endereco2.pais + " " + " tipo:" + endereco2.tipo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Contato getContato1() {
        return contato1;
    }

    public void setContato1(Contato contato1) {
        this.contato1 = contato1;
    }

    public Contato getContato2() {
        return contato2;
    }

    public void setContato2(Contato contato2) {
        this.contato2 = contato2;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public Endereco getEndereco1() {
        return endereco1;
    }

    public void setEndereco1(Endereco endereco1) {
        this.endereco1 = endereco1;
    }

    public Endereco getEndereco2() {
        return endereco2;
    }

    public void setEndereco2(Endereco endereco2) {
        this.endereco2 = endereco2;
    }

    public Endereco[] getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco[] enderecos) {
        this.enderecos = enderecos;
    }
}
