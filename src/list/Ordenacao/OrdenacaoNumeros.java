package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscentente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        numerosAscendente.sort(Collections.reverseOrder());
        return numerosAscendente;
    }

    public void exibirNumeros() {
        System.out.println(this.numerosList);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(24);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(23);
        ordenacaoNumeros.adicionarNumero(49);
        ordenacaoNumeros.adicionarNumero(25);
        ordenacaoNumeros.adicionarNumero(51);
        ordenacaoNumeros.adicionarNumero(1);

        ordenacaoNumeros.exibirNumeros();

        System.out.println(ordenacaoNumeros.ordenarAscentente());

        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
