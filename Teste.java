import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        // Criando objetos Cliente, Carro, Seguro e Acidente
        Cliente cliente = new Cliente(1, "João", "Rua A");
        Carro carro1 = new Carro("ABC123", LocalDate.of(2021, 1, 1));
        Seguro seguro1 = new Seguro(1, LocalDate.now(), carro1);
        Acidente acidente1 = new Acidente(1, LocalDate.of(2023, 5, 30));
        Acidente acidente2 = new Acidente(2, LocalDate.of(2023, 5, 29));

        // Associando o seguro ao cliente e ao carro
        cliente.adicionarSeguro(seguro1);
        seguro1.adicionarCarro(carro1);
        carro1.adicionarAcidente(acidente1);
        carro1.adicionarAcidente(acidente2);

                // Adicionar um novo seguro e carro para o cliente
                Carro carro2 = new Carro("XYZ987", LocalDate.of(2022, 3, 15));
                Seguro seguro2 = new Seguro(2, LocalDate.now(), carro2);
                Acidente acidente3 = new Acidente(1, LocalDate.of(2015, 3, 30));
                cliente.adicionarSeguro(seguro2);
                seguro2.adicionarCarro(carro2);
                carro2.adicionarAcidente(acidente3);

        // Exibindo os dados
        cliente.ImprimirCliente();
        System.out.println("");

        System.out.println("Seguros: ");
        for (Seguro s : cliente.getSeguros()) {
            System.out.println("Número do Seguro: " + s.getNumeroSeg());
            System.out.println("Data de Criação: " + s.getDataCriacaoSeg());
                for (Carro c : s.getCarro()) {
                    c.imprimirCarros(s.getCarro());

                      
            }

            System.out.println("\nDados de Acidente dos carros");
                    for (Carro c : s.getCarro()) {
                        System.out.println("Número do chassi: " + c.getNumeroChassi());
                        for (Acidente a : c.getAcidentes()) {
                            System.out.println("ID do Acidente: " + a.getIdAcidente());
                            System.out.println("Data do Acidente: " + a.getDataAcidente());
                        }
                        System.out.println(); // Separador entre os carros
                    }
        }      

    }
}