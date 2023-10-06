package AP1;
public enum TipoIngresso {
    INTEIRA,
    MEIA
}

// Classe abstrata Ingresso
abstract class Ingresso {
    private Evento evento;
    private TipoIngresso tipo;

    public Ingresso(Evento evento, TipoIngresso tipo) {
        this.evento = evento;
        this.tipo = tipo;
    }

    public abstract double getPreco();
}
