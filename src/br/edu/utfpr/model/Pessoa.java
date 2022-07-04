package br.edu.utfpr.model;

public class Pessoa {

    private int id;
    private String nome;

    public Pessoa() {}

    public Pessoa(int id, String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
}
