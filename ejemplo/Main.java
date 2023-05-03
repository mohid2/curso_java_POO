package ejemplo;

public class Main {
    public static void main(String[] args) {
        Fraccion a=new Fraccion(3,2);
        Fraccion b=new Fraccion(7,4);
        Fraccion r;
        r=Fraccion.multi(a,b);
        System.out.println(r.mostararFuncion());




    }
}
