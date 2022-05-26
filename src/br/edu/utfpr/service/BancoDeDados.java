package br.edu.utfpr.service;

import br.edu.utfpr.model.Livro;
import br.edu.utfpr.model.Pessoa;

import java.util.List;

public class BancoDeDados {
    List<Livro> listLivros = List.of( new Livro(1, "Ponyo - Uma amizade que veio do mar", "Xingling", 1990, "2ª", false),
            new Livro(2,"Wadahara", "Xingling2", 2012, "1ª", false),
            new Livro(3,"Equirídio - O livro do herói", "Adventure Time", 2012, "11ª", false),
            new Livro(4,"Metafísica para iniciantes", "F", 2005, "14ª", true),
            new Livro(5,"O guia definitivo para você FRACASSAR no lol!", "Eu msm", 2022, "1ª", false),
            new Livro(6,"Diário de um banana", "Kittnew", 2012, "1ª", true),
            new Livro(7,"O guia do mochileiro das galáxias", "Douglas Adams", 1973, "12ª", true));

    List<Pessoa> listPessoas = List.of(new Pessoa(1, "Jobersvald", "Xingling 169", "10/12/1990"),
            new Pessoa(2, "Maria Lucelia", "XiaoHu", "05/10/2000"),
            new Pessoa(3, "PneuMoniac", "Rua: Fernando R. R. Silva", "10/10/1997")
            );

    public List<Livro> getListLivros() {
        return listLivros;
    }

    public List<Pessoa> getListPessoas() {
        return listPessoas;
    }
}
