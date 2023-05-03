package ejerccioAccenture.herencia.herencia3;

public class Serie extends Ejemplar {
    private int numTemporadas;
    private String tipo;

    public Serie() {
    }

    public Serie(Ejemplar e,Serie s) {
        super(e);
        this.numTemporadas=s.numTemporadas;
        this.tipo=s.tipo;
    }

    public Serie(String titulo, String genero, boolean disponible, int numTemporadas, String tipo) {
        super(titulo, genero, disponible);
        this.numTemporadas = numTemporadas;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "\nnumTemporadas: " + numTemporadas +
                "\ntipo: " + tipo +
                "\nDisponible: "+ isDisponible();
    }
}
