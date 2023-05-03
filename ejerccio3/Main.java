package ejerccio3;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String marca,modelo;
        float precio;
        int numroVehiculos,indiceBarato;
        System.out.println("cuantos vehiculos qires instanciar");
        numroVehiculos=entrada.nextInt();
        Vehiculo coche[]=new Vehiculo[numroVehiculos];
        for (int i=0;i<numroVehiculos;i++){
            entrada.nextLine();
            System.out.println("digite las caracteristicas del coche "+(i+1)+": ");
            System.out.println("diga la marca: ");
            marca=entrada.nextLine();
            System.out.println("diga el modelo: ");
            modelo=entrada.nextLine();
            System.out.println("diga el precio: ");
            precio=entrada.nextFloat();

            coche[i]=new Vehiculo(marca,modelo,precio);
        }
        indiceBarato=Vehiculo.indiceCocheMBarato(coche);
        System.out.println("\nel coche mas barato es: ");
        System.out.println(coche[indiceBarato].mostrarDatos());

    }
}
