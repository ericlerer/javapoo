package AP1;
import java.util.Scanner;

public class TicketApp {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Evento evento = null;
        Ingresso ultimoIngressoVendido = null;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar novo evento");
            System.out.println("2. Realizar venda de ingresso");
            System.out.println("3. Exibir informações do evento");
            System.out.println("4. Exibir número de ingressos restantes");
            System.out.println("5. Exibir informações do último ingresso vendido");
            System.out.println("6. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    evento = cadastrarNovoEvento(scanner);
                    break;
                case 2:
                    if (evento != null) {
                        realizarVendaIngresso(scanner, evento);
                    } else {
                        System.out.println("Por favor, cadastre um evento primeiro.");
                    }
                    break;
                case 3:
                    if (evento != null) {
                        evento.exibirInformacoes();
                    } else {
                        System.out.println("Nenhum evento cadastrado.");
                    }
                    break;
                case 4:
                    if (evento != null) {
                        int ingressosRestantes = evento.getNumeroIngressosRestantes();
                        System.out.println("Número de ingressos restantes: " + ingressosRestantes);
                    } else {
                        System.out.println("Nenhum evento cadastrado.");
                    }
                    break;
                case 5:
                    if (ultimoIngressoVendido != null) {
                        exibirInformacoesIngresso(ultimoIngressoVendido);
                    } else {
                        System.out.println("Nenhum ingresso vendido ainda.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static Evento cadastrarNovoEvento(Scanner scanner) {
        // Implemente a lógica para cadastrar um novo evento aqui
        // Você pode perguntar ao usuário os detalhes do evento e retornar uma instância da classe de evento apropriada
        // (Show, Exposicao, Jogo)
        return null; // Substitua pelo evento criado
    }

    private static void realizarVendaIngresso(Scanner scanner, Evento evento) {
        // Implemente a lógica para realizar a venda de ingressos aqui
        // Você pode perguntar ao usuário o tipo de ingresso (inteira ou meia) e a quantidade desejada,
        // criar um ingresso correspondente e exibir as informações para confirmação
        // Lembre-se de atualizar a variável 'ultimoIngressoVendido' com o ingresso criado
    }

    private static void exibirInformacoesIngresso(Ingresso ingresso) {
        // Implemente a lógica para exibir as informações do último ingresso vendido aqui
        // Utilize o método 'exibirInformacoes' da classe de ingresso
    }
}

