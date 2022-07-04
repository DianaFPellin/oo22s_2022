package br.edu.utfpr.model;

import java.time.LocalDateTime;
import java.util.List;

public class Locacao {

    private Pessoa pessoa;
    private Livro livro;
    private LocalDateTime dataInicial;
    private LocalDateTime dataFinal;

    public Locacao() {
    }

    public Locacao(Pessoa pessoa, Livro livro, LocalDateTime dataInicial, LocalDateTime dataFinal) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public LocalDateTime getDataInicial() {
        return dataInicial;
    }

    public LocalDateTime getDataFinal() {
        return dataFinal;
    }
}
