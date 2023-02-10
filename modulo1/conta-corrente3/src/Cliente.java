import java.awt.*;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Contato> contatos = new ArrayList<>();
    private ArrayList<Endereco> enderecos = new ArrayList<>();
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

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList contatos) {
        this.contatos = contatos;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList enderecos) {
        this.enderecos = enderecos;
    }
}
