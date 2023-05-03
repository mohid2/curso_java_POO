package ejerccio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
       double a,b,c,d;
       NumerosComplejos numero1,numero2,suma,multi;
       int opcion, numeroInt;
       do {
           System.out.println("\t*** Operaciones con numeros complejos ***");
           System.out.println("1. Sumar dos numeros complejos");
           System.out.println("2. Multiplicar dos numeros complejos");
           System.out.println("3. Comparar dos numeros complejos");
           System.out.println("4. Multiplicar un numeros complejos con un entero");
           System.out.println("5. Salir");
           System.out.print("Elige la operacion: ");
           opcion=entrada.nextInt();
           switch (opcion){
               case 1:
                   System.out.println("Diga el primer numero complejo");
                   System.out.print("Diga la parte real: ");
                   a=entrada.nextDouble();
                   System.out.print("Diga la parte imaginaria: ");
                   b=entrada.nextDouble();
                   System.out.println("\nDiga el segundo numero complejo");
                   System.out.print("Diga la parte real: ");
                   c=entrada.nextDouble();
                   System.out.print("Diga la parte imaginaria: ");
                   d=entrada.nextDouble();

                   numero1=new NumerosComplejos(a,b);
                   numero2=new NumerosComplejos(c,d);
                   suma=numero1.sumarCoplejos(numero2);
                   System.out.println("\n****************");
                   System.out.println("La suma es : "+suma.getA()+"+"+suma.getB());
                   System.out.println("****************\n");

                   break;
               case 2:
                   System.out.println("\nDiga el primer numero complejo");
                   System.out.print("Diga la parte real: ");
                   a=entrada.nextDouble();
                   System.out.print("Diga la parte imaginaria: ");
                   b=entrada.nextDouble();
                   System.out.println("\nDiga el segundo numero complejo");
                   System.out.print("Diga la parte real: ");
                   c=entrada.nextDouble();
                   System.out.print("Diga la parte imaginaria: ");
                   d=entrada.nextDouble();

                   numero1=new NumerosComplejos(a,b);
                   numero2=new NumerosComplejos(c,d);
                   multi=numero1.multiCoplejos(numero2);
                   System.out.println("\n****************");
                   System.out.println("la multiplicacion es : "+multi.getA()+"+"+multi.getB());
                   System.out.println("****************\n");
                   break;
               case 3:
                   System.out.println("\nDiga el primer numero complejo");
                   System.out.print("Diga la parte real: ");
                   a=entrada.nextDouble();
                   System.out.print("Diga la parte imaginaria: ");
                   b=entrada.nextDouble();
                   System.out.println("\nDiga el segundo numero complejo");
                   System.out.print("Diga la parte real: ");
                   c=entrada.nextDouble();
                   System.out.print("Diga la parte imaginaria: ");
                   d=entrada.nextDouble();

                   numero1=new NumerosComplejos(a,b);
                   numero2=new NumerosComplejos(c,d);
                   if(numero1.compararComplejos(numero1)){
                       System.out.println("\n****************");
                       System.out.println("los numero son iguales");
                       System.out.println("****************\n");

                   }
                   else {
                       System.out.println("\n****************");
                       System.out.println("los numero no son iguales");
                       System.out.println("****************\n");
                   }
                   break;
               case 4:
                   System.out.println("\nDiga el  numero complejo");
                   System.out.print("Diga la parte real: ");
                   a=entrada.nextDouble();
                   System.out.print("Diga la parte imaginaria: ");
                   b=entrada.nextDouble();
                   numero1=new NumerosComplejos(a,b);
                   System.out.print("Diga el numero entero:  ");
                   numeroInt=entrada.nextInt();
                   multi=numero1.complejoInt(numeroInt);
                   System.out.println("\n****************");
                   System.out.println("la multiplicacion del numero complejo con el entero es: "+multi.getA()+"+"+multi.getB());
                   System.out.println("****************\n");
                   break;

           }
       }while ( opcion!=5);


    }
}
