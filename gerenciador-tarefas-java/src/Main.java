import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static List<Tarefa> listatarefas = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            menu();
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    adicionar();
                    break;

                case 2:
                    editar();
                    break;

                case 3:
                    exluir();
                    break;

                case 4:
                    listar();
                    break;

                case 5:
                    System.out.println("Saindo ...");
                    break;

                default:
                    System.out.println("Opção inválida . Tente novamente.");
            }
        } while (opcao != 5);

    }

    public static void menu () {
        System.out.println("*** Gerenciador de Tarefas ***");
        System.out.println("1- Adicionar");
        System.out.println("2- Editar");
        System.out.println("3- Excluir");
        System.out.println("4- Listar");
        System.out.println("5- Sair");
        System.out.println(("\nEscolha a opção: "));
    }

    public static void adicionar () {
        System.out.println("Título: ");
        String titulo = sc.nextLine();
        System.out.println("Descrição: ");
        String descricao = sc.nextLine();
        System.out.println("Data de vencimento: ");
        String datavenc = sc.nextLine();
        System.out.println("Status: (Pendente ou Concluída): ");
        String status = sc.nextLine();
        System.out.println("Código: (Necessário para editar ou excluir tarefas) ");
        String codigo = sc.nextLine();

        Tarefa novaTarefa = new Tarefa(titulo, descricao, datavenc, status, codigo);
        listatarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada.");
    }

    public static void editar () {
        System.out.println("Informe o código da tarefa que deseje editar: ");
        String codigo = sc.nextLine();

        boolean tarefaEncontrada = false;

        for (Tarefa novaTarefa : listatarefas) {
            if (novaTarefa.getCodigo().equals(codigo)) {
                System.out.println("Tarefa encontrada.");
                tarefaEncontrada = true;

                System.out.println("Novo título:");
                String novoTitulo = sc.nextLine();
                System.out.println("Nova descrição:");
                String novaDescricao = sc.nextLine();
                System.out.println("Nova data de vencimento:");
                String novoDatavenc = sc.nextLine();
                System.out.println("Novo status:");
                String novoStatus = sc.nextLine();

                novaTarefa.setTitulo(novoTitulo);
                novaTarefa.setDescricao(novaDescricao);
                novaTarefa.setDatavenc(novoDatavenc);
                novaTarefa.setStatus(novoStatus);

                System.out.println("Tarefa atualizada");
                novaTarefa.exibirInformacoes();
                break;
            }
        }
        if (!tarefaEncontrada) {
            System.out.println("Código não encontrado");
        }
    }

    public static void exluir () {
        System.out.println("Informe o código do tarefa que deseja excluir: ");
        String codigo = sc.nextLine();

        boolean tarefaEncontrada = false;

        for (Tarefa novaTarefa : listatarefas) {
            if (novaTarefa.getCodigo().equals(codigo)) {
                listatarefas.remove(novaTarefa);
                System.out.println("Tarefa excluída");
                tarefaEncontrada = true;
                break;
            }
        }
        if (!tarefaEncontrada) {
            System.out.println("Código não encontrado");
        }
    }

    public static void listar () {
        if (listatarefas.isEmpty()) { // isEmpty para verificar ve está vazio
            System.out.println("Nenhuma tarefa adicionada.");
        } else {
            for (Tarefa novaTarefa : listatarefas) {
                novaTarefa.exibirInformacoes();
            }
        }
    }

}