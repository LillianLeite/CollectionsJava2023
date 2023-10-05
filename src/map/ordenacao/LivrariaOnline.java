package map.ordenacao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
    private Map<String,Livro> livrariaMap;

    public LivrariaOnline() {
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livrariaMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        if (!livrariaMap.isEmpty()) {
            livrariaMap.remove(titulo);
        } else {
            System.out.println("A livraria está vazia!");
        }
    }

    public void exibirLivrosOrdenadosPorPreco(double preco) {
        if (!livrariaMap.isEmpty()) {
            Map<String, Livro> livrariaTreeMap = new TreeMap<>(livrariaMap);
            System.out.println(livrariaTreeMap.get(preco));
        }
    }

  /*  public void pesquisarLivrosPorAutor(String titulo) {
        if (!livrariaMap.isEmpty()) {
            for (Livro l : livrariaMap) {
                livrariaMap.get(titulo);
            }
        }
    }*/

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro();
    }
}
