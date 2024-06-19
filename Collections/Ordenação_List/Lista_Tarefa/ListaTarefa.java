package Collections.Ordenação_List.Lista_Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> aux = new ArrayList<>();

        for(Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                aux.add(t);
            }
        }
        tarefaList.removeAll(aux);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa lt = new ListaTarefa();

        lt.adicionarTarefa("Tarefa 1");
        lt.adicionarTarefa("Tarefa 1");
        lt.adicionarTarefa("Tarefa 2");

        System.out.println("Número total de elementos: " + lt.obterNumeroTotalTarefas());

        lt.removerTarefa("Tarefa 1");

        System.out.println("Número total de elementos: " + lt.obterNumeroTotalTarefas());

        lt.obterDescricoesTarefas();

    }
}
