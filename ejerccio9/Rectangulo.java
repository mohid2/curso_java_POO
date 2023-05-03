package ejerccio9;

public class Rectangulo extends Poligono{
    private double altura;
    private double base;

    public Rectangulo( double altura, double base) {
        super(2);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        double area;
        area=altura*base;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangulo\n"+super.toString()+"\naltura: " + altura +
                "\nbase: " + base;
    }
}
