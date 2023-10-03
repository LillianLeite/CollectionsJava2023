package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public void AgendaContatos(){

        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {

        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                int novoNumero = 0;
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Ly", 12345);
        agendaContatos.adicionarContato("Wez", 12355);
        agendaContatos.adicionarContato("Diana", 12545);
        agendaContatos.adicionarContato("Diana Leite", 12845);
        agendaContatos.adicionarContato("Diana Carneiro", 12399);
        agendaContatos.adicionarContato("Diana (Dia)", 75345);
        agendaContatos.adicionarContato("Ly Leite", 45345);
        agendaContatos.adicionarContato("Wez Macena", 17645);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Diana"));

        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Wez Macena", 55695);
        System.out.println("Contato atualizado" + contatoAtualizado);

        System.out.println(" ");
        System.out.println("Exibir contatos após a atualização: ");
        agendaContatos.exibirContato();

    }
}
