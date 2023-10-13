package AP1;
enum TipoIngresso {
    INTEIRA,
    MEIA
}

// Enum para representar os diferentes eventos
enum Evento {
    SHOW,
    CINEMA,
    TEATRO
}

// Classe abstrata Ingresso
abstract class Ingresso {
    private Evento evento;
    private TipoIngresso tipo;

    // Construtor da classe Ingresso
    public Ingresso(Evento evento, TipoIngresso tipo) {
        this.evento = evento;
        this.tipo = tipo;
    }

    // Método abstrato para obter o preço do ingresso (deve ser implementado pelas subclasses)
    public abstract double getPreco();

    // Método para obter o tipo de ingresso (inteira ou meia)
    public TipoIngresso getTipo() {
        return tipo;
    }

    // Método para obter o evento para o qual o ingresso foi vendido
    public Evento getEvento() {
        return evento;
    }
}

// Subclasse de Ingresso para ingressos de Show
    class IngressoShow extends Ingresso {
    // Preço base do ingresso para o evento Show
    private static final double PRECO_BASE_SHOW = 50.0;
    }
    
    // Construtor da classe IngressoShow
    public IngressoShow(TipoIngresso tipo) {
        super(Evento.SHOW, tipo);
    }

    // Implementação do método abstrato para obter o preço do ingresso de Show
    @Override
    public double getPreco() {
        if (getTipo() == TipoIngresso.MEIA) {
            // Se for meia entrada, retorna 50% do preço base
            return 0.5 * PRECO_BASE_SHOW;
        } else {
            // Se for inteira, retorna o preço base
            return PRECO_BASE_SHOW;
        }
    }
    public static void main(String[] args) {
        // Criando um ingresso de Show inteira
        Ingresso ingressoShowInteira = new IngressoShow(TipoIngresso.INTEIRA);
        // Calculando e exibindo o preço do ingresso
        System.out.println("Preço do ingresso para o Show (inteira): $" + ingressoShowInteira.getPreco());

        // Criando um ingresso de Show meia entrada
        Ingresso ingressoShowMeia = new IngressoShow(TipoIngresso.MEIA);
        // Calculando e exibindo o preço do ingresso
        System.out.println("Preço do ingresso para o Show (meia entrada): $" + ingressoShowMeia.getPreco());
    }
