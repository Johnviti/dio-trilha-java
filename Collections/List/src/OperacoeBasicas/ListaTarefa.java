package OperacoeBasicas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {


    private List<Tarefa> tarefas;


    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();
        lista.adicionarTarefa(new Tarefa("Estudar Java"));
        lista.adicionarTarefa(new Tarefa("Estudar Python"));
        lista.adicionarTarefa(new Tarefa("Estudar C++"));
        lista.adicionarTarefa(new Tarefa("Estudar C#"));
        lista.getTarefas().forEach(System.out::println);
        lista.removerTarefa("Estudar Python");
        System.out.println("==========================");
        lista.getTarefas().forEach(System.out::println);
    }

    public ListaTarefa() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefas.remove(tarefa);
                break;
            }
        }
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }


}   
