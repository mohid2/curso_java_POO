package ejerccioAccenture.EjerciciosClasesAbstractas.claseabstracta.ej1;

public class Cuadrado extends FiguraGeometrica{
    final  int NUM_LADOS_IGUALES = 4;
    private double lado;

    public int getNUM_LADOS_IGUALES() {
        return NUM_LADOS_IGUALES;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
       double area = Math.pow(lado, 2);
        return area;
    }

    @Override
    public double calcularPerímetro() {
        double perimetro=lado*NUM_LADOS_IGUALES;
        return perimetro;
    }
}
