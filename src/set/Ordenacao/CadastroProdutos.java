package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibiProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(001L, "Sabonete", 2.5, 3);
        cadastroProdutos.adicionarProduto(002L, "Detergente", 3.95, 2);
        cadastroProdutos.adicionarProduto(003L, "Amaciante de roupas", 20.99, 1);
        cadastroProdutos.adicionarProduto(005L, "Sabão", 2.45, 2);
        cadastroProdutos.adicionarProduto(004L, "Lava roupas", 15.0, 1);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibiProdutosPorPreco());
    }
}
