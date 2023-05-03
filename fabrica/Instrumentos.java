package fabrica;

public class Instrumentos {
    private String id;
    private double precio;
    private Tipo tipoInstrumento;

    public Instrumentos(String id, double precio, Tipo tipoInstrumento) {
        this.id = id;
        this.precio = precio;
        this.tipoInstrumento = tipoInstrumento;
    }

    public Tipo getTipoInstrumento() {
        return tipoInstrumento;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Instrumentos{" +
                "id='" + id + '\'' +
                ", precio=" + precio +
                ", tipoInstrumento=" + tipoInstrumento +
                '}';
    }
}
