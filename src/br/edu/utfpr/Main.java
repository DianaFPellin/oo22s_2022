package br.edu.utfpr;
/*
Criar programa orientado à objetos para solucionar os seguintes casos de uso:
V Será o controle de uma biblioteca
V Desenvolver método para a locação de livro
V deverá validar se livro está disponível
- Método para reserva de livro
- Valida se há alguma reserva para data e se estará disponível
- Método para devolução do livro
- Válida se a data da entrega é anterior a data máxima
- caso tenha vencido calcular 50 centavos ao dia até 20 reais, depois 1 real por dia

 */


import br.edu.utfpr.model.Livro;
import br.edu.utfpr.service.BancoDeDados;
import br.edu.utfpr.service.Controle_Biblioteca;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BancoDeDados bancoDeDados = new BancoDeDados();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bom dia, escolha a opção desejada: ");
        System.out.println("1 - Fazer empréstimo de livro;");
        System.out.println("2 - Fazer devolução de livros;");
        System.out.println("3 - Fazer reserva;");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                Controle_Biblioteca controle_biblioteca = new Controle_Biblioteca();
                System.out.println("Digite o ID do livro a ser locado: ");
                int idLivro = scanner.nextInt();
                System.out.println("Digite o ID da pessoa requerinte: ");
                int idPessoa = scanner.nextInt();
                controle_biblioteca.emprestaLivro(bancoDeDados.getListLivros(), idLivro, bancoDeDados.getListPessoas(), idPessoa);
                Livro livroEmprestimo = new Livro();

                livroEmprestimo.setDataInicialEmprestimo(new Date());
                livroEmprestimo.setDataFinalEmprestimo(new Date());
                break;
            case 2:
                Controle_Biblioteca controle_biblioteca_devolucao = new Controle_Biblioteca();
                System.out.println("Digite o ID do livro a ser devolvido: ");
                int idLivro_devolucao = scanner.nextInt();
                System.out.println("Digite o ID da pessoa: ");
                int idPessoa_Devolucao = scanner.nextInt();
                controle_biblioteca_devolucao.devolveLivro(bancoDeDados.getListLivros(), idLivro_devolucao, new Date(), new Date());

                break;
            case 3:
                Controle_Biblioteca controle_biblioteca_reserva = new Controle_Biblioteca();
                System.out.println("Digite o ID do livro a ser devolvido: ");
                int idLivro_reserva = scanner.nextInt();
                System.out.println("Digite o ID da pessoa: ");
                int idPessoa_reserva = scanner.nextInt();
                System.out.println("Digite a data da reserva: ");
                Date sim = new Date();

                controle_biblioteca_reserva.reservaLivro(bancoDeDados.getListLivros(), idLivro_reserva, sim, bancoDeDados.getListPessoas(), idPessoa_reserva);
                break;

        }
    }
}
