package br.edu.utfpr.model;

public class Livro {

    private Integer id;
    private String titulo;
    private boolean disponivel;

    public Livro(Integer id, String titulo, Boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.disponivel = disponivel;
    }

    public Integer getId() {
        return this.id;
    }

    public Boolean getDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

}
