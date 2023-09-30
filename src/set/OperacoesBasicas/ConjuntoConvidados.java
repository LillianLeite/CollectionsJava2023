package set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public boolean removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        return convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Exitem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados.");

        conjuntoConvidados.adicionarConvidado("Ly",1234);
        conjuntoConvidados.adicionarConvidado("Wez",1235);
        conjuntoConvidados.adicionarConvidado("Lais",1234);
        conjuntoConvidados.adicionarConvidado("Diana",1236);
        conjuntoConvidados.adicionarConvidado("Sillas",1237);
        conjuntoConvidados.adicionarConvidado("Nice",1238);
        conjuntoConvidados.adicionarConvidado("Levi",1239);
        conjuntoConvidados.adicionarConvidado("Roger",1240);

        System.out.println("Convidados no conjunto: ");
        conjuntoConvidados.exibirConvidados();
        System.out.println("Exitem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1240);
        System.out.println("Exitem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados.");
        conjuntoConvidados.exibirConvidados();

    }
}
