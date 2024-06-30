package Collections.Map.Agenda;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Agenda {

    private Map<LocalDate, Evento> eventoMap;

    public Agenda() {
        eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String nomeAtracao) {
        eventoMap.put(data, new Evento(nomeEvento, nomeAtracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> auxMap = new TreeMap<>(eventoMap);
        System.out.println(auxMap);
    }

    public void obterProximoEvento(){
        Map<LocalDate, Evento> auxMap = new TreeMap<>(eventoMap);
        LocalDate dataAtual = LocalDate.now();

        for(Map.Entry<LocalDate, Evento> entry : auxMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento: " + entry.getValue() + "Acontecerá na data " + entry.getKey());
                break;
            }

        }
    }

    public static void main(String[] args) {
        Agenda a = new Agenda();
        a.adicionarEvento(LocalDate.of(2024, 7, 1), "Festa na Praia", "Zezo");
        a.adicionarEvento(LocalDate.of(2024, 5, 1), "Festa na Piscina", "Fagner");
        a.adicionarEvento(LocalDate.of(2024, 8, 1), "Festa na Casa", "Zé ramalho");

        a.exibirAgenda();

        a.obterProximoEvento();
    }
}
