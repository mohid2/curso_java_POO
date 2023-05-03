package ejerccioAccenture.EjerciciosClasesAbstractas.claseabstracta.ej1;

public class Calculo {
    public static final double LONG_LADO_CUADRADO=2.0;
    public static void main(String[] args) {
        Cuadrado cuadrado=new Cuadrado();
        cuadrado.setLado(LONG_LADO_CUADRADO);
        System.out.println("area: "+cuadrado.calcularArea());
        System.out.println("perimetro: "+cuadrado.calcularPerímetro());

    }
}
