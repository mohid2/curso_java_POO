package herencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int nEstudiantes,edad,cEstudiante;
        float notaFinal;
        String nombre,apellido;
        System.out.println();
        System.out.println("\t*** Registro de estudiantes ***");
        System.out.print("\nDiga la cantidad de estudiantes que desea registrar: ");
        nEstudiantes=entrada.nextInt();
        Estudiante estudiante[]=new Estudiante[nEstudiantes];
        for (int i=0;i<nEstudiantes;i++){
            System.out.println("Datos estudiante "+(i+1));
            entrada.nextLine();
            System.out.print("Nombre: ");
            nombre=entrada.nextLine();
            System.out.print("Apellido: ");
            apellido=entrada.nextLine();
            System.out.print("Edad: ");
            edad=entrada.nextInt();
            System.out.print("Codigo estudiante: ");
            cEstudiante=entrada.nextInt();
            System.out.print("Nota final: ");
            notaFinal=entrada.nextFloat();

            estudiante[i]=new Estudiante(nombre,apellido,edad,cEstudiante,notaFinal);
        }
        System.out.println("*****************");
        for (int i=0;i<nEstudiantes;i++){
            estudiante[i].moatrarDatos();
        }
    }
}
