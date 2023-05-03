package examen.ejerccio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String nombre;
        int programacion, entorno, bbdd, lenguajeMarcas,sistemaInformaticos,fol;
        System.out.print("Introduce el nombre del alumno: ");
        nombre = entrada.nextLine();
        do {
            System.out.print("Introduce la nota de programacion: ");
            programacion = entrada.nextInt();
            if(programacion<0 || programacion>10){
                System.out.print("La nota es incorrecta vuelva a introducer la nota.");
                System.out.println();
           }
        }while(programacion<0 || programacion>10);
        do{
        System.out.print("Introduce la nota de entrorno: ");
        entorno=entrada.nextInt();
            if(entorno<0 || entorno>10){
                System.out.print("La nota es incorrecta vuelva a introducer la nota.");
                System.out.println();
            }
        } while (entorno<0 || entorno>10);
        do {
            System.out.print("Introduce la nota de bbdd: ");
            bbdd = entrada.nextInt();
            if(bbdd<0 || bbdd>10){
                System.out.print("La nota es incorrecta vuelva a introducer la nota.");
                System.out.println();
            }
        }while(bbdd<0 || bbdd>10);
        do {
            System.out.print("Introduce la nota de lenguaje de marcas: ");
            lenguajeMarcas = entrada.nextInt();
            if(lenguajeMarcas<0 || lenguajeMarcas>10){
                System.out.print("La nota es incorrecta vuelva a introducer la nota.");
                System.out.println();}
        }while (lenguajeMarcas<0 || lenguajeMarcas>10);
        do {
            System.out.print("Introduce la nota de sistemas informaticos: ");
            sistemaInformaticos = entrada.nextInt();
            if(sistemaInformaticos<0 || sistemaInformaticos>10){
                System.out.print("La nota es incorrecta vuelva a introducer la nota.");
                System.out.println();}
        }while (sistemaInformaticos<0 || sistemaInformaticos>10);
        do {
        System.out.print("Introduce la nota de fol: ");
        fol=entrada.nextInt();
            if(fol<0 || fol>10){
                System.out.print("La nota es incorrecta vuelva a introducer la nota.");
                System.out.println();}
        } while (fol<0 || fol>10);
        BoletinAlumno alumno=new BoletinAlumno(nombre,programacion,entorno,bbdd,lenguajeMarcas,sistemaInformaticos,fol);
        System.out.println();
        System.out.println(alumno);
        System.out.println(alumno.informacionNotas(programacion,entorno,bbdd,lenguajeMarcas,sistemaInformaticos,fol));
        System.out.println(BoletinAlumno.procentajeAprobados(alumno));
        System.out.println(BoletinAlumno.aprobados(alumno));

    }
}
