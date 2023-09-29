package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoas(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparetorPorAltura() );
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoas("Ly",23,1.60);
        ordenacaoPessoas.adicionarPessoas("Wez",24,1.70);
        ordenacaoPessoas.adicionarPessoas("Diana",2,0.90);
        ordenacaoPessoas.adicionarPessoas("Sillas",25,1.70);
        ordenacaoPessoas.adicionarPessoas("Nice",49,1.60);
        ordenacaoPessoas.adicionarPessoas("Levi",51,1.68);

        System.out.println(ordenacaoPessoas.pessoaList);
        System.out.println(ordenacaoPessoas.ordenadoPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
