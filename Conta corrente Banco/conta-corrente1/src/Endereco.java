public class Endereco {
    public int tipo;
    public String logradouro;
    public int numero;
    public String complemento;
    public String cep;
    public String cidade;
    public String estado;
    public String pais;


    public void imprimirEndereco(){
            System.out.println(tipo);
            System.out.println(logradouro);
            System.out.println(numero);
            System.out.println(complemento);
            System.out.println(cep);
            System.out.println(cidade);
            System.out.println(estado);
            System.out.println(pais);
    }
}
