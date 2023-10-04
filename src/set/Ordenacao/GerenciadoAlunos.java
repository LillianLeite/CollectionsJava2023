package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadoAlunos {
    private Set<Alunos> alunosSet;

    public GerenciadoAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAlunoPorMatricula(long matricula) {
        Alunos alunoParaRemover = null;
        for (Alunos a : alunosSet) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                break;
            }
        }
        alunosSet.remove(alunoParaRemover);
    }

    public void exibirAlunosPorNome() {
        Set<Alunos> alunoPorNome = new TreeSet<>(alunosSet);
        System.out.println(alunoPorNome);
    }

   public void exibirAlunosPorNota() {
        Set<Alunos> alunoPorNota = new TreeSet<>(new ComparatorNota());
        alunoPorNota.addAll(alunosSet);
       System.out.println(alunoPorNota);
   }

    public void exibirAlunos() {
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadoAlunos gerenciadoAlunos = new GerenciadoAlunos();

        gerenciadoAlunos.adicionarAluno("Maria", 001L, 6.3);
        gerenciadoAlunos.adicionarAluno("Diana", 002L, 10.0);
        gerenciadoAlunos.adicionarAluno("Ly", 003L, 9.5);
        gerenciadoAlunos.adicionarAluno("Laura", 003L, 8.5);
        gerenciadoAlunos.adicionarAluno("Wez", 004L, 7.5);

        gerenciadoAlunos.removerAlunoPorMatricula(001L);

        gerenciadoAlunos.exibirAlunosPorNome();
        gerenciadoAlunos.exibirAlunosPorNota();
        gerenciadoAlunos.exibirAlunos();
    }
}
