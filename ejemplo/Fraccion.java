package ejemplo;

public class Fraccion {
    int numerador;
    int denumerador;

    public  Fraccion(){
    }
    public Fraccion(int numerador, int denumerador) {
        this.numerador = numerador;
        this.denumerador = denumerador;
    }
    public static Fraccion  multi(Fraccion a, Fraccion b){
    int c1= a.numerador*a.denumerador;
    int c2= b.numerador*a.denumerador;
       Fraccion r=new Fraccion(c1,c2);
       return r;


    }

    public String mostararFuncion(){
        String cad="{"+numerador+"/"+denumerador+"}";
        return  cad ;
    }
}

