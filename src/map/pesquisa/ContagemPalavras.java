package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> comtagemPalavrasMap;

    public ContagemPalavras() {
        this.comtagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String linguagem, Integer contagem) {
        comtagemPalavrasMap.put(linguagem, contagem);
    }

    public void removerPalavra(String linguagem) {
        comtagemPalavrasMap.remove(linguagem);
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : comtagemPalavrasMap.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontarPalavrasMaisFrequentes() {
        String linguagemMaisFrequente = null;
        int maiorcontagem = 0;
        for (Map.Entry<String, Integer> entry : comtagemPalavrasMap.entrySet()) {
            if (entry.getValue() > maiorcontagem) {
                maiorcontagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Java", 2);
        contagemPalavras.adicionarPalavra("Python", 8);
        contagemPalavras.adicionarPalavra("JavaScript", 1);
        contagemPalavras.adicionarPalavra("C#", 6);

        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras");

        System.out.println("A linguagem mais frequente é: " + contagemPalavras.encontarPalavrasMaisFrequentes());
    }
}
