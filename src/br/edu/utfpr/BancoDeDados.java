package br.edu.utfpr;

import br.edu.utfpr.model.*;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

    public static List<Pessoa> pessoas = (List.of(
            new Pessoa(1,"João"),
                new Pessoa(2,"Maria-Alice"),
                new Pessoa(3,"Lisa")
                ));
    public static List<Locacao> locacoes = new ArrayList<>();
    public static List<Devolucao> devolucoes = new ArrayList<>();
    public static List<Reserva> reservas = new ArrayList<>();
    public static List<Livro> livros = List.of(
            new Livro(1, "Harry Potter e a Câmara Secreta", true),
            new Livro(2, "As Crônicas de Nárnia", true),
            new Livro(3, "Crime e Castigo", true),
            new Livro(4, "Os Simpsons", true),
            new Livro(5, "O Pequeno Principe", true),
            new Livro(6, "Irmão Lobo", true)
    );

}
