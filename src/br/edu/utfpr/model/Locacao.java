package br.edu.utfpr.model;

import java.time.LocalDate;

public class Locacao {

    private Pessoa pessoa;
    private Livro livro;
    private LocalDate dataInicial;
    private LocalDate dataFinal;

    public Locacao(Pessoa pessoa, Livro livro, LocalDate dataInicial, LocalDate dataFinal) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Livro getLivro() {
        return livro;
    }
}
