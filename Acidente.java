import java.time.LocalDate;
import java.util.List;


public class Acidente {
    private int idAcidente;
    private LocalDate dataAcidente;

    // construtor

    Acidente(int id, LocalDate data) {
        idAcidente = id;
        dataAcidente = data;
    }

    // getter e setter
    public int getIdAcidente() {
        return idAcidente;
    }

    public void setIdAcidente(int idAcidente) {
        this.idAcidente = idAcidente;
    }

    public LocalDate getDataAcidente() {
        return dataAcidente;
    }

    public void setDataAcidente(LocalDate dataAcidente) {
        this.dataAcidente = dataAcidente;
    }

    public void setDataAcidente(int ano, int mes, int dia) {
        this.dataAcidente = LocalDate.of(dia, mes, ano);
    }

    // metodo
    public void ImprimirAcidente() {
        System.out.println("Id do acidente feito: " + idAcidente);
        System.out.println("Data do acidente: " + dataAcidente);
    }

    public void imprimirAcidentes(List<Acidente> acidentes) {
        for (Acidente acidente : acidentes) {
            acidente.ImprimirAcidente();
            System.out.println(); // Separador entre os acidentes
        }
    }
}