package ejerccio5;

import java.util.Scanner;

public class Main {
    public static double calcularAreaMayor(Isosceles iso[]){
        double areaMayor=iso[0].calcularArea();
        for(int i=1;i<iso.length;i++){
            if(areaMayor<iso[i].calcularArea()){
                areaMayor=iso[i].calcularArea();
            }
        }
        return areaMayor;
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double lados,base;
        int numeroTriangolos;
        System.out.print("Diga el numero de treangolos que desea: ");
        numeroTriangolos=entrada.nextInt();
        Isosceles iso[]=new Isosceles[numeroTriangolos];
        for (int i=0;i<numeroTriangolos;i++){
            System.out.println("Diga los datos del treangulo "+(i+1));
            System.out.print("Diga el lado: ");
            lados=entrada.nextDouble();
            System.out.print("Diga la base: ");
            base=entrada.nextDouble();
            iso[i]=new Isosceles(lados,base);
            System.out.println("-----------------------");
            System.out.println("El perimetro es: "+iso[i].calcularPerimetro());
            System.out.println("El area es: "+iso[i].calcularArea());
            System.out.println("-----------------------");
            System.out.println();
        }

        System.out.println();
        System.out.println("El area del treangolo con mayor superficie es: "+calcularAreaMayor(iso));
        }

}
