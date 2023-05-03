package ejerccio6;

public class NumerosComplejos {
    private double a;
    private double b;

    public NumerosComplejos(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;

    }

    public  NumerosComplejos sumarCoplejos(NumerosComplejos c){
        NumerosComplejos suma=new NumerosComplejos(a+ c.getA(),b+c.getB());
        return suma;
    }
    //c=
    public  NumerosComplejos multiCoplejos(NumerosComplejos c){
        NumerosComplejos multi=new NumerosComplejos((a*c.getA())-(b+c.getB()),(a*c.getB())+(b*c.getA()));
        return multi;
    }
    public boolean compararComplejos(NumerosComplejos c){
        boolean coparar=false;
        if(a==c.getA() && b==c.getB()){
            coparar=true;
            return coparar;
        }
        else {
            coparar=false;
            return coparar ;
        }
    }
    public NumerosComplejos complejoInt(int n){
        NumerosComplejos multiInt=new NumerosComplejos(n*a,n*b);
        return multiInt;
    }


}
