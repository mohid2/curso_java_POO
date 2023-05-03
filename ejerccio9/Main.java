package ejerccio9;

import java.util.*;

public class Main {
    static ArrayList<Poligono> poligonos=new ArrayList<>();

    public static void main(String[] args) {
        llenarPoligono();
        recorerArreglo();


    }
    static Scanner entrada=new Scanner(System.in);
    public static void llenarPoligono(){
        int opcion;
        double ladoA,ladoB,ladoC;
        do{
            System.out.println("Diga que poligono quieres almacenar");
            System.out.println("1. Treangolo");
            System.out.println("2. Rectangulo");
            System.out.println("3. salir");
            opcion=entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Diga el lado A");
                    ladoA=entrada.nextDouble();
                    System.out.println("Diga el lado B");
                    ladoB=entrada.nextDouble();
                    System.out.println("Diga el lado C");
                    ladoC=entrada.nextDouble();
                    Triangulo triangulo=new Triangulo(ladoA,ladoB,ladoC);
                    poligonos.add(triangulo);
                    break;
                case 2:
                    System.out.println("Diga el lado A");
                    ladoA=entrada.nextDouble();
                    System.out.println("Diga el lado B");
                    ladoB=entrada.nextDouble();
                    Rectangulo rectangulo=new Rectangulo(ladoA,ladoB);
                    poligonos.add(rectangulo);
                    break;
            }

        }while (opcion!=3);

    }
    public static void recorerArreglo(){
      for(Poligono poli:poligonos){
          System.out.println(poli.toString());
          System.out.println("Area: "+poli.calcularArea());
      }
    }
}
