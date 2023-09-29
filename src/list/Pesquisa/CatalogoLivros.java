package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livroPorIntervaloAnos.add(l);
                }
            }
        }
        return livroPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivrosList = new CatalogoLivros();

                catalogoLivrosList.adicionarLivro("Eu Sou o número Quatro", "Pittacus Lore", 2010);
                catalogoLivrosList.adicionarLivro("O poder dos Seis", "Pittacus Lore", 2011);
                catalogoLivrosList.adicionarLivro("Ascenção dos Nove", "Pittacus Lore", 2012);
                catalogoLivrosList.adicionarLivro("Percy Jackson e o ladrão de raios", "Rick Riordan", 2005);
                catalogoLivrosList.adicionarLivro("Percy Jackson e o mar de monstros", "Rick Riordan", 2006);
                catalogoLivrosList.adicionarLivro("Percy Jackson e o herói perdido", "Rick Riordan", 2010);
                catalogoLivrosList.adicionarLivro("Dominando Java + 100 exercícios resolvidos", "Ruhan Conceição", 2014);
                catalogoLivrosList.adicionarLivro("Livro 1", "Autor 1", 2021);
                catalogoLivrosList.adicionarLivro("Livro 1", "Autor 2", 2022);

                System.out.println(catalogoLivrosList.pesquisarPorAutor("Rick Riordan"));
                System.out.println(catalogoLivrosList.pesquisarPorIntervaloAnos(2010, 2021));
                System.out.println(catalogoLivrosList.pesquisarPorTitulo("Livro 1"));
    }
}



