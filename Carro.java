import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Carro {
    private String numeroChassi;
    private LocalDate anoFabricacao;
    private List<Acidente> acidentes;

    // construtor 
    Carro(String chassi, LocalDate fabricacao) {
        numeroChassi = chassi;
        anoFabricacao = fabricacao;
        this.acidentes = new ArrayList<>();

    }

    // getter e setter
    public LocalDate getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public void setAnoFabricacao(LocalDate anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setAnoFabricacao(int ano, int mes, int dia) {
        this.anoFabricacao = LocalDate.of(dia, mes, ano);
    }

    public List<Acidente> getAcidentes() {
        return acidentes;
    }

    // metodos
    public void adicionarAcidente(Acidente acidente) {
        acidentes.add(acidente);
    }

    public void exibirAcidentes() {
        for (Acidente acidente : acidentes) {
            acidente.ImprimirAcidente();
        }
    }

    public void ImprimirCarro() {
        System.out.println("Numero do chassi: " + getNumeroChassi());
        System.out.println("Ano de fabricacao: " + getAnoFabricacao());
    }

    public void imprimirCarros(List<Carro> carros) {
        for (Carro carro : carros) {
            carro.ImprimirCarro();
            System.out.println(); // Separador entre os carros
        }
    }
    
}
