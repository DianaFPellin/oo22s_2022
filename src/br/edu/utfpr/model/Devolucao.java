package br.edu.utfpr.model;

import java.time.LocalDateTime;
import java.util.List;

public class Devolucao {
    private Pessoa pessoa;
    private Livro livro;
    private LocalDateTime dataDevolucao;

    public Devolucao(Pessoa pessoa, Livro livro, LocalDateTime dataDevolucao) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataDevolucao = dataDevolucao;
    }
}
