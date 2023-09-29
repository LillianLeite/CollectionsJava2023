package list.OperacoesBasicas;


import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {

        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(i);
                }
            }
            itemList.removeAll(itemParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public String toString() {
        return "Carrinho de compras{" +
                "itens=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras listacarrinho = new CarrinhoDeCompras();


        listacarrinho.adicionarItem("Sabonete", 2.50, 3);
        listacarrinho.adicionarItem("Detergente", 3.50, 2);
        listacarrinho.adicionarItem("Escova de dentes", 2.0, 3);
        listacarrinho.adicionarItem("Lava roupas", 15.90, 1);
        listacarrinho.adicionarItem("Esfoliante corporal", 18.90, 2);

        listacarrinho.exibirItens();

        listacarrinho.removerItem("Lava Roupas");

        listacarrinho.exibirItens();

        System.out.println("O valor total da compra é: R$" + listacarrinho.calcularValorTotal());
    }
}
