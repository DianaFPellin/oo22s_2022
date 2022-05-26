package br.edu.utfpr.model;

import java.util.Date;

public class Livro {
    private int idLivro;
    private String tituloLivro;
    private String nomeAutor;
    private float anoLancamento;
    private String edicao;
    private boolean emprestimo;
    private Date diaInicialEmprestimo;
    private Date diaFinalEmprestimo;
    private Date dataReserva;


    public Livro(int idLivro, String tituloLivro, String nomeAutor, float anoLancamento, String edicao, boolean emprestimo) {
        this.idLivro = idLivro;
        this.tituloLivro = tituloLivro;
        this.nomeAutor = nomeAutor;
        this.anoLancamento = anoLancamento;
        this.edicao = edicao;
        this.emprestimo = emprestimo;
    }

    public Livro() {

    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setDataInicialEmprestimo(Date dataEmprestimo) {
        this.diaInicialEmprestimo = dataEmprestimo;
    }

    public void setDataFinalEmprestimo(Date dataEmprestimo) {
        this.diaFinalEmprestimo = dataEmprestimo;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }
}
