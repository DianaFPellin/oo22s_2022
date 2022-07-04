package br.edu.utfpr.model;

import java.time.LocalDate;
import java.util.List;

public class Reserva {
    private Pessoa pessoa;
    private Livro livro;
    private LocalDate dataReserva;

    public Reserva(Pessoa pessoa, Livro livro, LocalDate dataReserva) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataReserva = dataReserva;
    }
}
