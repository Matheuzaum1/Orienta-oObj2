package Aula02.Ex1;

import java.util.Scanner;

public class AgendaDeContatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao;

        do {
            System.out.println("\n--- Menu Agenda de Contatos ---");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Remover contato");
            System.out.println("3. Exibir todos os contatos");
            System.out.println("4. Pesquisar contato");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Sobrenome: ");
                    String sobrenome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Aniversário: ");
                    String aniversario = scanner.nextLine();
                    Contato contato = new Contato(nome, sobrenome, telefone, endereco, aniversario);
                    agenda.adicionarContato(contato);
                    break;

                case 2:
                    System.out.print("Digite o nome do contato a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;

                case 3:
                    System.out.println("Lista de Contatos:");
                    agenda.exibirContatos();
                    break;

                case 4:
                    System.out.print("Digite parte do nome para pesquisar: ");
                    String termoPesquisa = scanner.nextLine();
                    agenda.pesquisarContato(termoPesquisa);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
