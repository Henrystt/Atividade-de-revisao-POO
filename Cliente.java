import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private int codCli;
    private String nomeCli;
    private String enderecoCli;
    private List<Seguro> seguros;
    

    // construtor
    public Cliente(int cod, String nome, String endereco) {
        codCli = cod;
        nomeCli = nome;
        enderecoCli = endereco;
        this.seguros = new ArrayList<>();
    }
 /*   public Cliente() {
        codCli = 0;
        nomeCli = null;
        enderecoCli = null;
        this.seguros = new ArrayList<>();
    }

    public Cliente(Cliente c) {
        codCli = c.codCli;
        nomeCli = c.nomeCli;
        enderecoCli = c.enderecoCli;
        this.seguros = new ArrayList<>();


    }
 */
   
    // getters e setter
    public List<Seguro> getSeguros() {
        return seguros;
    }

    public int getCodCli() {
        return codCli;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getEnderecoCli() {
        return enderecoCli;
    }

    public void setEnderecoCli(String enderecoCli) {
        this.enderecoCli = enderecoCli;
    }

    // metodos
    public void adicionarSeguro(Seguro seguro){
        seguros.add(seguro);
    }
        
    public void atualizarEndereco(String novoEndereco) {
        this.enderecoCli = novoEndereco;
    }

    public void ImprimirCliente() {
        System.out.println("Codigo do Cliente: " + getCodCli());
        System.out.println("Endereco do Cliente: " + getEnderecoCli());
        System.out.println("Nome do Cliente: " + getNomeCli());
    }


}