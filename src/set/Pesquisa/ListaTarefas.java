package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;


    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
            }
        }
        tarefaSet.remove(tarefaParaRemover);
    } else {
            System.out.println("O conjunto está vazio!");
        }
        if (tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefa() {
        System.out.println(tarefaSet);
    }

    public int contarTarefa() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas () {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isTarefaConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes () {
        Set<Tarefa> tarefaPendente = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isTarefaConcluida()) {
                tarefaPendente.add(t);
            }
        }
        return tarefaPendente;
    }

    public void marcarTarefaConcluidas(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTarefaConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }

        if (tarefaParaMarcarComoPendente != null) {
            if(tarefaParaMarcarComoPendente.isTarefaConcluida()) {
                tarefaParaMarcarComoPendente.setTarefaConcluida(false);
            }
        }else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.exibirTarefa();
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");
        listaTarefas.adicionarTarefa("Colocar Diana para dormir");
        listaTarefas.adicionarTarefa("Fazer almoço");
        listaTarefas.adicionarTarefa("Digitalizar as provas de português");

        System.out.println("Total de tarefas: " + listaTarefas.contarTarefa());

        listaTarefas.exibirTarefa();
        listaTarefas.removerTarefa("Fazer almoço");
        listaTarefas.exibirTarefa();

        System.out.println("Total de tarefas: " + listaTarefas.contarTarefa());

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluidas("Estudar Java");
        listaTarefas.marcarTarefaConcluidas("Preparar apresentação");
        listaTarefas.marcarTarefaConcluidas("Organizar mesa de trabalho");
        listaTarefas.marcarTarefaConcluidas("Colocar Diana para dormir");
        listaTarefas.marcarTarefaConcluidas("Ler livro");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Colocar Diana para dormir");
        System.out.println(listaTarefas.obterTarefasPendentes());

        System.out.println("Total de tarefas concluídas: " + listaTarefas.obterTarefasConcluidas().size());
        System.out.println("Total de tarefas pendentes: " + listaTarefas.obterTarefasPendentes().size());

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefa();
    }
}
