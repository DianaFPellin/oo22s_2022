package br.edu.utfpr.service;

import br.edu.utfpr.BancoDeDados;
import br.edu.utfpr.model.Devolucao;
import br.edu.utfpr.model.Locacao;
import br.edu.utfpr.model.Pessoa;
import br.edu.utfpr.rotinas.Rotinas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DevolucaoService extends Rotinas {
    public void efetuarDevolucao(Pessoa pessoa, int livrosId) {
        BancoDeDados.devolucoes.add
                (new Devolucao(pessoa,
                            getLivrosById(livrosId),
                            LocalDateTime.now())
        );

        BancoDeDados.livros.stream().filter(livro -> livro.getId() == livrosId).findFirst().orElse(null).setDisponivel(true);
        if  (BancoDeDados.locacoes.stream().filter(locacao -> locacao.getLivro().getId() == livrosId).findFirst().orElse(null) != null) {
            validaDataEntregaECalculaMulta(livrosId);
        }
    }

    private void validaDataEntregaECalculaMulta(int livrosId) {
        LocalDate localDate = LocalDate.now();
        LocalDate data_locacao;
        double calculaMulta = 0;

        data_locacao = BancoDeDados.locacoes.stream().filter(locacao -> locacao.getLivro().getId() == livrosId).findFirst().orElse(null).getDataInicial();

        Duration dataEntre = Duration.between(data_locacao.atStartOfDay(), localDate.atStartOfDay());

        if (dataEntre.toDays() <= 30) {
            System.out.println("Livro devolvido com sucesso!");
        } else {
           calculaMulta = 0;
           for (int i = 0; i < dataEntre.toDays() - 30; i++) {
               calculaMulta = calculaMulta + 0.50;

               if (calculaMulta >= 20) {
                   calculaMulta = calculaMulta + 1;
               }
           }
            System.out.println("Multa devido ao atraso de "+ calculaMulta +" reais!");
        }
    }

}
