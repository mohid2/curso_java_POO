package ejerccio9;

public abstract class Poligono {
    protected int nLados;

    public Poligono(int nLados) {
        this.nLados = nLados;
    }

    public abstract double calcularArea();

    @Override
    public String toString() {
        return "numero lados: " + nLados;
    }
}
