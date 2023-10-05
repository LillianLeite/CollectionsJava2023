package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("O dicionário está vazio!");
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            System.out.println("O dicionário está vazio");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = dicionarioMap.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        return "Linguagem não encontrada";

    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("evangélio", " Doutrina de Jesus Cristo e dos que nele acreditam.");
        dicionario.adicionarPalavra("adélio", " Pessoa desconhecida ou obscura.");

        dicionario.exibirPalavras();

        dicionario.pesquisarPorPalavra("evangélio");

        dicionario.removerPalavra("adélio");
        dicionario.exibirPalavras();
    }
}
