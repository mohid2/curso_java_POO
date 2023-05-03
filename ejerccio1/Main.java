package ejerccio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cuadilatero c1;
        Scanner entrada=new Scanner(System.in);
        System.out.println("diga el primer lado ");
        float lado1=entrada.nextFloat();
        System.out.println("dia el segundo lado");
        float lado2=entrada.nextFloat();
        if(lado1==lado2){
            c1=new Cuadilatero(lado1);
        }
        else {
            c1=new Cuadilatero(lado1,lado2);
        }
        System.out.println("el area es igual "+c1.getArea());
        System.out.println("el perimetro es igual "+c1.getPerimetro());
}}
