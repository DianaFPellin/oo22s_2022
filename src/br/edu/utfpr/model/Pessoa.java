package br.edu.utfpr.model;

import java.util.List;

public class Pessoa {
    private int idPessoa;
    private String nome;
    private String endereco;
    private String dataNasc;
    private List<Livro> listLivros;

    public Pessoa(int idPessoa, String nome, String endereco, String dataNasc) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.endereco = endereco;
        this.dataNasc = dataNasc;
    }

    public void setListaDeLivros(Livro livroDisponivel) {
        this.listLivros.add(livroDisponivel);
    }

    public int getIdPessoa() {
        return idPessoa;
    }
}
