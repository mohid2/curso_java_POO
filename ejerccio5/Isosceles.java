package ejerccio5;

public class Isosceles {
    private double lados;
    private double base;

    public Isosceles(double lados, double base) {
        this.lados = lados;
        this.base = base;

    }
    public double calcularPerimetro(){
        double prtimetro;
        prtimetro=(2*lados)+base;
        return prtimetro;
    }
    public double calcularArea(){
        double area,altura;
        altura=Math.sqrt(Math.pow(lados,2)-(Math.pow(base,2)/4));
        area=(base*altura)/2;
        return area;
    }

}
