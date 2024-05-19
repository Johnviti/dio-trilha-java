package Pesquisa;


import java.util.List;
import java.util.ArrayList;

public class CatalogoLivro {
    private List<Livro> livros;

    public static void main(String[] args) {
        CatalogoLivro catalogo = new CatalogoLivro();
        catalogo.adicionarLivro("Java", "Autor1", 2020);
        catalogo.adicionarLivro("Python", "Autor2", 2021);
        catalogo.adicionarLivro("C++", "Autor3", 2022);
        catalogo.adicionarLivro("C#", "Autor4", 2023);
        catalogo.pesquisarPorAutor("Autor1");
        catalogo.pesquisarPorAnoPublicacao(2021);
        catalogo.pesquisarPorTitulo("Java");
        catalogo.removerLivro("Java");
        System.out.println("==========================");
        catalogo.pesquisarPorAutor("Autor1");
        catalogo.pesquisarPorAnoPublicacao(2021);
        catalogo.pesquisarPorTitulo("Java");
    }

    public CatalogoLivro() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public void removerLivro(String titulo){
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(livro);
                break;
            }
        }
    }

    public void pesquisarPorAutor(String autor){
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(livro);
            }
        }
    }

    public void pesquisarPorAnoPublicacao(int anoPublicacao){
        for (Livro livro : livros) {
            if (livro.getAnoPublicacao() == anoPublicacao) {
                System.out.println(livro);
            }
        }
    }

    public void pesquisarPorTitulo(String titulo){
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(livro);
            }
        }
    }


}

