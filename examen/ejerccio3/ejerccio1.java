package examen.ejerccio3;

import java.util.Scanner;

public class ejerccio1 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num,contadorTotal=0,procentajePares = 0,contadorPares=0,numerosImpares=0;
        do {
            System.out.print("introduce un numero: ");
            num=entrada.nextInt();
            contadorTotal++;
            if (num%2==0){
                contadorPares++;
                procentajePares=contadorPares*100/contadorTotal;
            }
            if(num>0 && num%2!=0){
                numerosImpares+=num;
            }
        }while (num!=-1);
        System.out.println(procentajePares);
        System.out.println(numerosImpares);
        System.out.println();
    }
}
