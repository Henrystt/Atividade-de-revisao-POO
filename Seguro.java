import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Seguro {
    private int numeroSeg;
    private LocalDate dataCriacaoSeg;
    private List<Carro> carros;
  

    // construtor
    Seguro(int numero, LocalDate dataCriacaoSeg, Carro carro) {
        numeroSeg = numero;
        this.dataCriacaoSeg = dataCriacaoSeg;
        this.carros = new ArrayList<>();

    }

    // getter e setter
    public int getNumeroSeg() {
        return numeroSeg;
    }

    public void setNumeroSeg(int numeroSeg) {
        this.numeroSeg = numeroSeg;
    }

    public LocalDate getDataCriacaoSeg() {
        return dataCriacaoSeg;
    }

    public void setDataCriacaoSeg(LocalDate dataCriacaoSeg) {
        this.dataCriacaoSeg = dataCriacaoSeg;
    }

    public void setDataCriacaoSeg(int ano, int mes, int dia) {
        this.dataCriacaoSeg = LocalDate.of(dia, mes, ano);

    }

    public List<Carro> getCarro(){
        return carros;
    }

    // metodos
    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void ImprimiSeguro() {
        System.out.println("Numero do seguro: " + getNumeroSeg());
        System.out.println("Criacao do seguro: " + dataCriacaoSeg);
    }

}
