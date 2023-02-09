import java.awt.*;

public class Cliente {
    private String nome;
    private String cpf;

    private Contato[] contatos = new Contato[2];
    private Endereco endereco1 = new Endereco();
    private Endereco endereco2 = new Endereco();
    private Endereco[] enderecos = {endereco1, endereco2};
    public void imprimirContatos(){
            for (Contato contato : contatos){
                try{
                    System.out.println("Contato:" + contato.getDescricao() + " " + contato.getTelefone() + " " + contato.getTipo() + "." );
                } catch (NullPointerException e){
                    System.out.println("Null");
                }
            }
    }
    public void imprimirEnderecos(){
            for (Endereco endereco: enderecos){
                    try{
                        System.out.println("Endereco: " + endereco.getLogradouro() + " " + endereco.getComplemento() + " " + " número:" + endereco.getNumero() + " " + " cep: " + endereco.getCep() + " " + endereco.getCidade() + " " + endereco.getEstado() + " " + endereco.getPais() + " " + " tipo:" + endereco.getTipo());
                    } catch (NullPointerException e){
                        System.out.println("Null");
                    }
                }
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
