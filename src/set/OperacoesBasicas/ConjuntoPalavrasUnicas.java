package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(conjuntoPalavrasUnicasSet.contains(palavra)) {
            conjuntoPalavrasUnicasSet.remove(palavra);
        }
    }

    public boolean verificarPalavra(String palavra) {
        return conjuntoPalavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavasUnicas(){
        System.out.println(conjuntoPalavrasUnicasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Criança");
        conjuntoPalavrasUnicas.adicionarPalavra("Olá");
        conjuntoPalavrasUnicas.adicionarPalavra("Paralelepípedo");
        conjuntoPalavrasUnicas.adicionarPalavra("Estrada");
        conjuntoPalavrasUnicas.adicionarPalavra("Criança");
        conjuntoPalavrasUnicas.adicionarPalavra("Felicidade");

        conjuntoPalavrasUnicas.exibirPalavasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Criança");
       conjuntoPalavrasUnicas.exibirPalavasUnicas();

        conjuntoPalavrasUnicas.exibirPalavasUnicas();

        System.out.println("A palavra 'Estrada' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Estrada"));

        conjuntoPalavrasUnicas.exibirPalavasUnicas();
    }
}
