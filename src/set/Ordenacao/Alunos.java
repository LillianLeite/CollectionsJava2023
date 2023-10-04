package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos> {
    private String nome;
    private Long matricula;
    private double media;

    public Alunos(String nome, Long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alunos alunos)) return false;
        return Objects.equals(getMatricula(), alunos.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    public int compareTo(Alunos alunos) {
        return nome.compareTo(alunos.getNome());
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }
}

    class ComparatorNota implements Comparator<Alunos> {
        public int compare(Alunos o1, Alunos o2) {
            return Double.compare(o1.getMedia(), o2.getMedia());
        }
}