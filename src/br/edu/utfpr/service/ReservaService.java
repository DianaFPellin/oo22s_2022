package br.edu.utfpr.service;

import br.edu.utfpr.BancoDeDados;
import br.edu.utfpr.model.Livro;
import br.edu.utfpr.model.Locacao;
import br.edu.utfpr.model.Pessoa;
import br.edu.utfpr.model.Reserva;
import br.edu.utfpr.rotinas.Rotinas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class ReservaService extends Rotinas {

    public void efetuarReserva(Pessoa pessoa, int livrosId) {
        LocalDate localDate;
        Scanner scanner = new Scanner(System.in);
        if (validaSeEstaDisponivel(livrosId)) {
            System.out.println("Informe a data da reserva (aaaa-mm-dd): ");
            localDate = LocalDate.parse(scanner.next(), DateTimeFormatter.ISO_LOCAL_DATE);
            BancoDeDados.reservas.add(
                    new Reserva(pessoa,
                            getLivrosById(livrosId),
                            localDate
                    )
            );
            System.out.println("A reserva foi marcada para: " + localDate);
            BancoDeDados.livros.stream()
                    .filter(livro -> livro.getId() == livrosId)
                    .findFirst().get().setDisponivel(false);
        }else{
            System.out.println("Livro indisponível!");
        }
    }
}
