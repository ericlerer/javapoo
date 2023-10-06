package AP1;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto de Show
        Show show = new Show("RedHot", "Dezembro", "RJ", 100, 55, "Artista", "Rock");

        // Testando a venda de ingressos
        TipoIngresso tipo = TipoIngresso.INTEIRA;
        int quantidade = 2;
        double valorTotal = show.venderIngresso(tipo, quantidade);

        // Exibindo informações sobre o show e a venda de ingressos
        System.out.println("Detalhes do Show:");
        System.out.println("Nome: " + show.getNome());
        System.out.println("Data: " + show.getData());
        System.out.println("Local: " + show.getLocal());
        System.out.println("Artista: " + show.getArtista());
        System.out.println("Gênero Musical: " + show.getGeneroMusical());
        System.out.println("Localização do Ingresso: " + show.getLocalizacaoIngresso());
        System.out.println("Ingressos Inteira Disponíveis: " + show.getIngressosInteira());
        System.out.println("Ingressos Meia Disponíveis: " + show.getIngressosMeia());

        // Exibindo informações sobre a venda de ingressos
        System.out.println("\nDetalhes da Venda:");
        System.out.println("Tipo de Ingresso Vendido: " + tipo);
        System.out.println("Quantidade de Ingressos Vendidos: " + quantidade);
        System.out.println("Valor Total da Venda: " + valorTotal);
        System.out.println("Ingressos Inteira Disponíveis após a venda: " + show.getIngressosInteira());
        System.out.println("Ingressos Meia Disponíveis após a venda: " + show.getIngressosMeia());
    }
}
