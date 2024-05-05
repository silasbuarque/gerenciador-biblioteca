package modelos;

import java.util.Objects;

public class Livro {

    private String titulo;
    private String autor;
    private String ISBN;
    private String genero;
    private int numeroPaginas;
    private boolean disponivel;

    public Livro(String titulo, String autor, String ISBN, String genero, int numeroPaginas, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void deixarDisponivel() {
        this.disponivel = true;
    }

    public void deixarIndisponivel() {
        this.disponivel = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(titulo, livro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(titulo);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", genero='" + genero + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
