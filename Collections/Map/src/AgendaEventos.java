import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos = new HashMap<>();
    
    public AgendaEventos(){
        this.eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventos.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
        for (Map.Entry<LocalDate, Evento> evento : eventosTreeMap.entrySet()) {
            System.out.println("Data: " + evento.getKey() + " - Evento: " + evento.getValue().getNome() + " - Atração: " + evento.getValue().getAtracao());
        }
    }

    public void obterProximoEvento(){
        LocalDate data = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
        for (Map.Entry<LocalDate, Evento> evento : eventosTreeMap.entrySet()) {
            if( evento.getKey().isEqual(data) || evento.getKey().isAfter(data)){
                proximaData = evento.getKey();
                proximoEvento = evento.getValue();
                break;
            }
        }
        if (proximoEvento != null) {
            System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
          } else {
            System.out.println("Não há eventos futuros na agenda.");
          }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2024, 5, 19), "Evento 1", "Atração 1");
        agenda.adicionarEvento(LocalDate.of(2024, 5, 20), "Evento 2", "Atração 2");
        agenda.adicionarEvento(LocalDate.of(2024, 8, 20), "Evento 3", "Atração 3");
        agenda.adicionarEvento(LocalDate.of(2024, 10, 25), "Evento 4", "Atração 4");
        agenda.adicionarEvento(LocalDate.of(2024, 10, 30), "Evento 5", "Atração 5");
        agenda.exibirAgenda();
        System.out.println("====================================");
        System.out.println("Próximo evento:");
        agenda.obterProximoEvento();
    }
}
