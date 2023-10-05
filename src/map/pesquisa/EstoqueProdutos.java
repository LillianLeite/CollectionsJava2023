package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProdutos(long cod, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto(nome,preco, quantidade));
    }

    public void exibirProdutos() {
            System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0.0;
            for(Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : estoqueProdutosMap.values()) {
            if(p.getPreco() > maiorPreco) {
                produtoMaisCaro = p;
                maiorPreco = p.getPreco();
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoqueProdutosMap.values()) {
            if(p.getPreco() < menorPreco) {
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorToatalProdutoEstoque = 0.0;
        if(!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long,Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorToatalProdutoEstoque) {
                    maiorValorToatalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProdutos(1L, "Notebook", 1500.0, 1);
        estoque.adicionarProdutos(2L, "Mouse", 25.0, 5);
        estoque.adicionarProdutos(3L, "Monitor", 400.0, 10);
        estoque.adicionarProdutos(4L, "Teclado", 40.0, 2);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalEstoque());

        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());

        System.out.println("Produto com maior quantidade em valor no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}
