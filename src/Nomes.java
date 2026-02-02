import java.util.ArrayList;
import java.util.Scanner;

public class Nomes {

    public static void main(String[] args) {
        // Inicialização da lista e do scanner
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("=== Bem-vindo ao CRUD de Nomes ===");

        do {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Cadastrar nome");
            System.out.println("2 - Listar nomes cadastrados");
            System.out.println("3 - Atualizar um nome existente");
            System.out.println("4 - Remover um nome");
            System.out.println("5 - Sair do sistema");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1: // criar usuario
                    System.out.print("Digite o nome para cadastrar: ");
                    String novoNome = scanner.nextLine();
                    nomes.add(novoNome);
                    System.out.println("Nome cadastrado com sucesso!");
                    break;

                case 2:
                    if (nomes.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        System.out.println("\n--- Lista de Nomes ---");
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println(i + " - " + nomes.get(i));
                        }
                    }
                    break;

                case 3: // carregar usuario
                    if (nomes.isEmpty()) {
                        System.out.println("Nada para atualizar. Lista vazia.");
                    } else {
                        System.out.print("Informe o índice (número) que deseja alterar: ");
                        int indexUpdate = scanner.nextInt();
                        scanner.nextLine(); // limpa buffer

                        if (indexUpdate >= 0 && indexUpdate < nomes.size()) {
                            System.out.print("Digite o novo nome: ");
                            String nomeAtualizado = scanner.nextLine();
                            nomes.set(indexUpdate, nomeAtualizado);
                            System.out.println("Nome atualizado com sucesso!");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;

                case 4: // deletar usuario
                    if (nomes.isEmpty()) {
                        System.out.println("Nada para remover. Lista vazia.");
                    } else {
                        System.out.print("Informe o índice (número) que deseja remover: ");
                        int indexDelete = scanner.nextInt();

                        if (indexDelete >= 0 && indexDelete < nomes.size()) {
                            String removido = nomes.remove(indexDelete);
                            System.out.println("Nome '" + removido + "' removido com sucesso!");
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;

                case 5: // sair do sistema
                    System.out.println("Encerrando o sistema... Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}