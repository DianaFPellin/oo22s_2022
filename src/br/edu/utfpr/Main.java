package br.edu.utfpr;

import br.edu.utfpr.model.Livro;
import br.edu.utfpr.model.Pessoa;
import br.edu.utfpr.service.DevolucaoService;
import br.edu.utfpr.service.LocacaoService;
import br.edu.utfpr.service.ReservaService;

import java.util.Scanner;

/*
Criar programa orientado à objetos para solucionar os seguintes casos de uso:
- Será o controle de uma biblioteca V
- Desenvolver método para a locação de livro V
- deverá validar se livro está disponível V
- Método para reserva de livro V
- Valida se há alguma reserva para data e se estará disponível V
- Método para devolução do livro V
- Válida se a data da entrega é anterior a data máxima V
- caso tenha vencido calcular 50 centavos ao dia até 20 reais, depois 1 real por dia V

 */
public class Main {

    public static void main(String[] args) {

        int opcao = 0;

        while(opcao != 4) {
            System.out.println("###-SISTEMA BIBLIOTECA-###");
            System.out.println("1 - Empréstimo");
            System.out.println("2 - Devolução");
            System.out.println("3 - Reservar livro");
            System.out.println("4 - Sair");
            System.out.println("/");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int id_usuario;
                    System.out.println("Digite o ID do requerente: ");
                    id_usuario = scanner.nextInt();

                    int id_livro;
                    System.out.println("Informe o ID do livro: ");
                    id_livro = scanner.nextInt();

                    LocacaoService locacao = new LocacaoService();
                    Pessoa pessoa = BancoDeDados.pessoas.stream().filter(pessoa1 -> pessoa1.getId() == id_usuario).findFirst().orElse(null);
                    locacao.efetuarLocacao(pessoa, id_livro);
                    break;
                case 2:
                    int id_usuario_devolucao;
                    System.out.println("Digite o ID do cliente: ");
                    id_usuario_devolucao = scanner.nextInt();

                    Integer id_livro_devolucao;
                    System.out.println("Informe o ID do livro: ");
                    id_livro_devolucao = scanner.nextInt();

                    DevolucaoService devolucao = new DevolucaoService();
                    Pessoa pessoa_devolucao = BancoDeDados.pessoas.stream().filter(pessoa2 -> pessoa2.getId() == id_usuario_devolucao).findFirst().orElse(null);
                    devolucao.efetuarDevolucao(pessoa_devolucao, id_livro_devolucao);
                    break;
                case 3:
                    int id_usuario_reserva;
                    System.out.println("Digite o ID do cliente: ");
                    id_usuario_reserva = scanner.nextInt();

                    int id_livro_reserva;
                    System.out.println("Informe o ID do livro: ");
                    id_livro_reserva = scanner.nextInt();

                    ReservaService reserva = new ReservaService();
                    Pessoa pessoa_reserva = BancoDeDados.pessoas.stream().filter(pessoa2 -> pessoa2.getId() == id_usuario_reserva).findFirst().orElse(null);
                    reserva.efetuarReserva(pessoa_reserva, id_livro_reserva);
                    break;
            }
        }
    }
}
