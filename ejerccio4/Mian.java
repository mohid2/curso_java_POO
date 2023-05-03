package ejerccio4;

import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numeroatletas,numeroatleta,ganador;
        float tiempo;
        String nombre;

        System.out.println("diga el numero de atletas que van a participar ");
        numeroatletas=entrada.nextInt();
        Atleta atleta[]=new Atleta[numeroatletas];
        for (int i=0;i<atleta.length;i++){
            System.out.println("diga el numero del atleta "+(i+1));
            numeroatleta=entrada.nextInt();
            System.out.println("diga el nombre del atleta "+(i+1));
            nombre=entrada.nextLine();
            System.out.println("diga el tiempo del atleta "+(i+1));
            tiempo=entrada.nextFloat();

            atleta[i]= new  Atleta(numeroatleta,nombre,tiempo);
        }
        ganador=Atleta.indiceGanador(atleta);
        System.out.println("el ganador de la carrera es: ");
        System.out.println(atleta[ganador].mostrarDatosGanador());
    }
}
