package examen.ejerccio2;

import java.util.Scanner;

public class elmayor {
    public static int mayorCifra(int numero){

        int num,mayor=0;
        while (numero!=0){
            num=numero%10;
            numero=numero/10;
            if(num>mayor){
                mayor=num;
            }
        }
        return mayor;
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num;
        System.out.println("Diga un numero");
        num=entrada.nextInt();
        System.out.println("La mayor cifra del numero es: "+mayorCifra(num));

    }
}
