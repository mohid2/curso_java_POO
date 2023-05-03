package ejerccio9;

public class Triangulo extends Poligono {
    protected double ladoA;
    protected double ladoB;
    protected double base;

    public Triangulo( double ladoA, double ladoB, double base) {
        super(3);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.base = base;
    }

    @Override
    public double calcularArea() {
         double area;
         double piremetro=ladoA+ladoB+base;
         double s=piremetro/2;
         area=Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-base));
         return area;
    }

    @Override
    public String toString() {
        return "Triangulo\n" +super.toString()+
                "\nladoA: " + ladoA +
                "\nladoB: " + ladoB +
                "\nbase: " + base ;
    }
}
