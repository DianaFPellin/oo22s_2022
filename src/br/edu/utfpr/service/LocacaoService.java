package br.edu.utfpr.service;

import br.edu.utfpr.BancoDeDados;
import br.edu.utfpr.model.Livro;
import br.edu.utfpr.model.Locacao;
import br.edu.utfpr.model.Pessoa;
import br.edu.utfpr.rotinas.Rotinas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class LocacaoService extends Rotinas {

    public void efetuarLocacao(Pessoa pessoa, int livrosId) {
        if(validaSeEstaDisponivel(livrosId) != true) {
            System.out.println("O Livro está indisponível");
        } else {
            BancoDeDados.locacoes.add(
                    new Locacao(pessoa,
                            getLivrosById(livrosId),
                            LocalDate.now(),
                            ChronoUnit.DAYS.addTo(LocalDate.now(), 30))
            );

            BancoDeDados.livros.stream()
                    .filter(livro -> livro.getId() == livrosId)
                    .findFirst().get().setDisponivel(false);
            System.out.println("Livro emprestado com sucesso!");
        }
    }
}
