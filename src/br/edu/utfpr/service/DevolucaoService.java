package br.edu.utfpr.service;

import br.edu.utfpr.BancoDeDados;
import br.edu.utfpr.model.Devolucao;
import br.edu.utfpr.model.Locacao;
import br.edu.utfpr.model.Pessoa;
import br.edu.utfpr.rotinas.Rotinas;

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

//        validaDataEntregaECalculaMulta();
    }

    private void validaDataEntregaECalculaMulta() {
        LocalDate localDateTime = LocalDate.now();
        long dataEntre;
        Locacao locacao = new Locacao();
        double calculaMulta = 0;

        dataEntre = ChronoUnit.DAYS.between(locacao.getDataInicial(), localDateTime);

        if (dataEntre <= 30) {
            System.out.println("Livro devolvido com sucesso!");
        } else {
           for (int i = 0; i <= dataEntre; i++) {
               calculaMulta = calculaMulta + 0.50;

               if (calculaMulta >= 20) {
                   calculaMulta = calculaMulta + 1;
               }
           }
        }
    }

}
