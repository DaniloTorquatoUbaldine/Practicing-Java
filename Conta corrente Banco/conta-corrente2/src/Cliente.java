import java.awt.*;

public class Cliente {
    private String nome;
    private String cpf;
    private Contato[] contatos = new Contato[2];
    private Endereco[] enderecos = new Endereco[2];
    public void imprimirContatos(){
            for (Contato contato : contatos){
                try{
                    System.out.println("Contato:" + contato.getDescricao() + " " + contato.getTelefone() + " " + contato.getTipo() + "." );
                } catch (NullPointerException e){
                    System.out.println("Capturado: nulo.");
                }
            }
    }
    public void imprimirEnderecos(){
            for (Endereco endereco: enderecos){
                    try{
                        System.out.println("Endereco: " + endereco.getLogradouro() + " " + endereco.getComplemento() + " " + " número:" + endereco.getNumero() + " " + " cep: " + endereco.getCep() + " " + endereco.getCidade() + " " + endereco.getEstado() + " " + endereco.getPais() + " " + " tipo:" + endereco.getTipo());
                    } catch (NullPointerException e){
                        System.out.println("Capturado: nulo.");
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

    public Endereco[] getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco[] enderecos) {
        this.enderecos = enderecos;
    }
}
