package br.edu.utfpr.service;

import br.edu.utfpr.model.Livro;
import br.edu.utfpr.model.Pessoa;

import java.util.Date;
import java.util.List;

public class Controle_Biblioteca {

    public void emprestaLivro(List<Livro> livros, int idLivro, List<Pessoa> pessoaLocacao, int idPessoa) {
        Livro livro;
        Pessoa pessoa;
        livro = livros.stream().filter(livro1 -> livro1.getIdLivro() == idLivro).findFirst().orElse(null);
        if (livro.isEmprestimo() == false) {
            livro.setEmprestimo(true);
            System.out.println("Boa leitura!");
        } else {
            System.out.println("Livro indisponível! Favor fazer reserva ou escolher outro!");
        }

        pessoa = pessoaLocacao.stream().filter(pessoa1 -> pessoa1.getIdPessoa() == idPessoa).findFirst().orElse(null);
        pessoa.setListaDeLivros(livro);
    }

    public void devolveLivro(List<Livro> livros, int idLivro, Date dataInicialEmprestimo, Date dataFinalEmprestimo) {
        Livro livro;
        livro = livros.stream().filter(livro1 -> livro1.getIdLivro() == idLivro).findFirst().orElse(null);
        if (livro.isEmprestimo() == true) {
            livro.setEmprestimo(false);
            System.out.println("Livro devolvido para a banca com sucesso!");
        }

        double totalizaMulta;
        if (dataInicialEmprestimo.getDate() - dataFinalEmprestimo.getDate() > 7) {
            System.out.println("Multa = 50 Cents per day");
            double diferenca = dataInicialEmprestimo.getDate() - dataFinalEmprestimo.getDate();
            totalizaMulta = 0.50 * diferenca;
            System.out.println("Total da multa = " + totalizaMulta);
        }
    }

    public void reservaLivro(List<Livro> livros, int idLivro, Date dataEmprestimo, List<Pessoa> pessoa, int idPessoa) {
        Livro livro;
        Pessoa pessoa_reserva;
        livro = livros.stream().filter(livro1 -> livro1.getIdLivro() == idLivro).findFirst().orElse(null);
        if (livro.isEmprestimo() == true){
            livro.setDataReserva(dataEmprestimo);
            System.out.println("Livro reservado!");
        }

        pessoa_reserva = pessoa.stream().filter(pessoa1 -> pessoa1.getIdPessoa() == idPessoa).findFirst().orElse(null);
        pessoa_reserva.setListaDeLivros(livro);
    }
}
