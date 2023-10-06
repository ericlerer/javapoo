package AP1;
// TicketApp.java
import java.util.EventObject;
import java.util.Scanner;

public class TicketApp {
    private static EventObject eventoAtual;
    private static Ingresso ingressoVendido;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Menu Principal =====");
            System.out.println("1. Cadastre um novo evento");
            System.out.println("2. Realize a venda de um ingresso");
            System.out.println("3. Exibir informações do evento");
            System.out.println("4. Exibir o número de ingressos restantes");
            System.out.println("5. Exibir informações do último ingresso vendido");
            System.out.println("0. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    // Implemente a lógica para cadastrar um novo evento
                    // ...
                    break;
                case 2:
                    // Implemente a lógica para realizar a venda de ingressos
                    // ...
                    break;
                case 3:
                    // Implemente a lógica para exibir informações do evento
                    // ...
                    break;
                case 4:
                    // Implemente a lógica para exibir o número de ingressos restantes
                    // ...
                    break;
                case 5:
                    // Implemente a lógica para exibir informações do último ingresso vendido
                    // ...
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
