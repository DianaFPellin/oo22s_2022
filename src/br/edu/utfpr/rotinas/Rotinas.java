package br.edu.utfpr.rotinas;

import br.edu.utfpr.BancoDeDados;
import br.edu.utfpr.model.Livro;

public class Rotinas {

    public boolean validaSeEstaDisponivel(int livrosId) {
        return BancoDeDados.livros.stream().filter(livro -> livro.getId() == livrosId).findFirst().orElse(null).getDisponivel();
    }

    public Livro getLivrosById(int livrosId) {
        return BancoDeDados.livros.stream().filter(livro -> livro.getId() == livrosId).findFirst().orElse(null);
    }
}
