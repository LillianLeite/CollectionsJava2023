package list.OperacoesBasicas;


import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoDeComprasList;

    public CarrinhoDeCompras() {
        this.carrinhoDeComprasList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoDeComprasList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item v : carrinhoDeComprasList) {
            if (v.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(v);
            }
        }
        carrinhoDeComprasList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(double preco) {
        return carrinhoDeComprasList.size();
    }

    public void exibirItens(String nome) {
        System.out.println(carrinhoDeComprasList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras listacarrinho = new CarrinhoDeCompras();

        System.out.println("O que tem no nosso carrinho de compras é: " + listacarrinho);

        listacarrinho.adicionarItem("Sabonete", 2.50, 3);
        listacarrinho.adicionarItem("Detergente", 3.50, 2);
        listacarrinho.adicionarItem("Escova de dentes", 2.0, 3);
        listacarrinho.adicionarItem("Lava roupas", 15.90, 1);

        System.out.println("O que tem no nosso carrinho de compras é: " + listacarrinho);
    }
}
