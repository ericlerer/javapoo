package AP1;
abstract class Evento {
    private String nome;
    private String data;
    private String local;
    private int ingressosInteira;
    private int ingressosMeia;
    private double precoCheio;

    public Evento(String nome, String data, String local, int ingressosInteira, int ingressosMeia) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.ingressosInteira = ingressosInteira;
        this.ingressosMeia = ingressosMeia;
    }

    public abstract boolean isIngressoDisponivel(TipoIngresso tipo, int quantidade);

    public abstract double venderIngresso(TipoIngresso tipo, int quantidade);

    // Implemente os getters e setters conforme necessário
}
