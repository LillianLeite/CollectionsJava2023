package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("A agenda está vazia!");
        }
    }

    public void exibirContatos() {
        if (!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        } else {
            System.out.println("A agenda está vazia!");
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
            if (numeroPorNome == null) {
                System.out.println("contato não encontrado na agenda!");
            }
        } else {
            System.out.println("A agenda está vazia!");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Ly",15947);
        agendaContatos.adicionarContato("Wez",15989);
        agendaContatos.adicionarContato("Diana",95947);
        agendaContatos.adicionarContato("Sillas",3477);
        agendaContatos.adicionarContato("Nice",13547);
        agendaContatos.adicionarContato("Levi",25847);
        agendaContatos.adicionarContato("Maria",11111);
        agendaContatos.adicionarContato("Maria",25887);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        String nomePesquisa = "Diana";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("Diana");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExiste = "Lua";
        Integer numeroPesquisaNaoExiste = agendaContatos.pesquisarPorNome("Lua");

    }
}
