package AP1;
enum TipoIngresso {
    INTEIRA,
    MEIA
}

// Enum para representar os tipos de localização do ingresso em um show
enum Localizacao {
    PISTA,
    CAMAROTE
}

// Classe Ingresso que contém informações básicas sobre o ingresso
abstract class Ingresso {
    private String evento;
    private TipoIngresso tipo;

    // Construtor, getters e setters
    public Ingresso(String evento, TipoIngresso tipo) {
        this.evento = evento;
        this.tipo = tipo;
    }

    public abstract double getPreco();

    public TipoIngresso getTipo() {
        return tipo;
    }
}

// Subclasse IngressoShow que herda de Ingresso
public class IngressoShow extends Ingresso {
    private String artista; // Nome do artista do show
    private String generoMusical; // Gênero musical do show
    private Localizacao localizacao; // Localização do ingresso (pista ou camarote)

    // Construtor da classe IngressoShow
    public IngressoShow(String evento, TipoIngresso tipo, String artista, String generoMusical, Localizacao localizacao) {
        super(evento, tipo);
        this.artista = artista;
        this.generoMusical = generoMusical;
        this.localizacao = localizacao;
    }

    // Métodos getters para obter informações sobre o ingresso
    public String getArtista() {
        return artista;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    // Implementação do método abstrato para calcular o preço do ingresso de shows
    @Override
    public double getPreco() {
        // Lógica para calcular o preço do ingresso de shows
        double precoBase = 100.0; // Preço base do ingresso para o show
        double precoFinal = precoBase;

        // Aplica desconto para meia entrada
        if (getTipo() == TipoIngresso.MEIA) {
            precoFinal *= 0.5; // 50% de desconto para meia entrada
        }

        // Aplica custo adicional para ingressos de camarote
        if (getLocalizacao() == Localizacao.CAMAROTE) {
            precoFinal += 50.0; // Adiciona R$50,00 para ingressos de camarote
        }

        return precoFinal;
    }
}
