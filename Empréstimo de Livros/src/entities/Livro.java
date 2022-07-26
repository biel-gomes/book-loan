package entities;

import java.util.Date;

import entities.enums.Idioma;
import entities.enums.Situacao;

public class Livro {
    public static int geraIdLivro = 1;
    public static int geraIdTitulo = 1;

    private int idLivro;
    private int idTitulo;
    private String titulo;
    private String autor;
    private String genero;
    private String resumo;
    private Idioma idioma;
    private String editora;
    private Date dataPublicacao;
    private int nPaginas;
    private double nota;
    private Situacao situacao;

    public Livro(int idTitulo, String titulo, String autor, String genero, String resumo, Idioma idioma,
            String editora, Date dataPublicacao, int nPaginas, Situacao situacao) {
        this.idLivro = geraIdLivro;
        geraIdLivro ++;

        this.idTitulo = Cadastro.buscaLivro(titulo);
        if(this.idTitulo == -1) {
            this.idTitulo = geraIdTitulo;
            geraIdTitulo ++;
        }

        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.resumo = resumo;
        this.idioma = idioma;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
        this.nPaginas = nPaginas;
        this.nota = 0; // Começa em '0', ou seja, sem avaliações
        this.situacao = situacao;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public int getIdTitulo() {
        return idTitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public int getNPaginas() {
        return nPaginas;
    }

    public void setNPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
}
