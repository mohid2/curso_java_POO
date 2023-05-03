package ejerccio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int x,y,opcion,incremento=0;
        Tablero t1;
        System.out.println("diga la posicion de x");
        x=entrada.nextInt();
        System.out.println("diga la posicion de y");
        y= entrada.nextInt();
        t1=new Tablero(x,y);
        do {
            System.out.println("\n\t MENU:. ");
            System.out.println("1. Mover hacia arriba");
            System.out.println("2. Mover hacia abajo ");
            System.out.println("3. Mover hacia la izqierda");
            System.out.println("4. Mover hacia la derecha ");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion=entrada.nextInt();
            if(opcion!=5){
                System.out.println("\nDigita la cantidad de espacios a moverse");
                incremento=entrada.nextInt();
            }
            switch (opcion){
                case 1:
                    t1.movirArriba(incremento);
                    break;
                case 2:
                    t1.movirAbajo(incremento);

                    break;
                case 3:
                    t1.movirIzquierda(incremento);

                    break;
                case 4:
                    t1.movirderecha(incremento);
                    break;
                case 5:
                    break;
            }
            System.out.println("la posicion actual de (x,y) es: "+ "("+t1.getX()+","+t1.getY()+")");
        }while (opcion!=5);






    }
}
