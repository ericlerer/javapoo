package AP1;
public class Show extends Evento {
    
    public int getIngressosInteira() {
        return ingressosInteira;
    }

    public int getIngressosMeia() {
        return ingressosMeia;
    }

}


public class Show extends Evento {
    private String artista;
    private String generoMusical;
    private String localizacaoIngresso;

    public Show(String nome, String data, String local, int ingressosInteira, int ingressosMeia, String artista, String generoMusical) {
        super(nome, data, local, ingressosInteira, ingressosMeia);
        this.artista = artista;
        this.generoMusical = generoMusical;
    }

    @Override
    public boolean isIngressoDisponivel(TipoIngresso tipo, int quantidade) {
        if (tipo == TipoIngresso.INTEIRA) {
            return (quantidade <= getIngressosInteira());
        } else if (tipo == TipoIngresso.MEIA) {
            return (quantidade <= getIngressosMeia());
        }
        return false;
    }

    @Override
    public double venderIngresso(TipoIngresso tipo, int quantidade) {
        double precoUnitario;
        if (tipo == TipoIngresso.INTEIRA) {
            precoUnitario = 0.0; // Preço cheio agora é 0.0
        } else if (tipo == TipoIngresso.MEIA) {
            precoUnitario = 0.0; // Meia entrada também é gratuita
        } else {
            precoUnitario = 0.0; // Defina um valor padrão para outros tipos de ingresso
        }

        if (isIngressoDisponivel(tipo, quantidade)) {
            double valorTotal = quantidade * precoUnitario;

            if (tipo == TipoIngresso.INTEIRA) {
                setIngressosInteira(getIngressosInteira() - quantidade);
            } else if (tipo == TipoIngresso.MEIA) {
                setIngressosMeia(getIngressosMeia() - quantidade);
            }

            return valorTotal;
        } else {
            return 0.0;
        }
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public String getLocalizacaoIngresso() {
        return localizacaoIngresso;
    }

    public void setLocalizacaoIngresso(String localizacaoIngresso) {
        this.localizacaoIngresso = localizacaoIngresso;
    }
}
