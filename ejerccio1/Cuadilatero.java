package ejerccio1;

public class Cuadilatero {
   private float lado1;
   private float lado2;

    public Cuadilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        System.out.println("usando el cunstructor de 2");
    }
    public Cuadilatero(float lado1) {
        this.lado1 =this.lado2=lado1;
        System.out.println("usando el cunstructor de 1");

    }

    public float getPerimetro(){
        float perimetro=2*(lado1+lado2);
        return perimetro;
    }

    public float getArea(){
        float area=lado1*lado2;
        return area;
    }
}
