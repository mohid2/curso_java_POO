package ejerccio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static Scanner entrada=new Scanner(System.in);

    static ArrayList<Persona> persona=new ArrayList<>();
    static Persona futbulista1=new Futbolista("Gonzalo","Higuain",29,9,"Delantero");
    static Persona futbulista2=new Futbolista("Paulo","Dibala",23,21,"Delantero");
    static Persona entrenador=new Entrenador("Maximiliano ","Alegre",49,"Difensiva");
    static Persona medico=new Doctor("Alex","Marroni",55,"Licenciado en Fesioterapia",20);

    public static void main(String[] args) {
        persona.add(futbulista1);
        persona.add(futbulista2);
        persona.add(entrenador);
        persona.add(medico);
        menu();
    }
    public static void menu(){
        int opcion;
        do{
            System.out.println("\tMenu opciones");
            System.out.println("1. Vieje de equepo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de futbol");
            System.out.println("4. Planificar entrenaminto");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesion");
            System.out.println("7. Salir");
            System.out.print("Elege una opcion: ");
            opcion=entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println();
                    for (Persona equipo:persona){
                        System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
                                equipo.viejaEquepo();
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    for (Persona equipo:persona){
                        System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
                        equipo.entrenamiento();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    for (Persona equipo:persona){
                        System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
                        equipo.partidoFutbol();
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.print(entrenador.getNombre()+" "+entrenador.getApellido()+" -> ");
                    ((Entrenador) entrenador).planificarEntenamiento();
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    System.out.print(futbulista1.getNombre()+" "+futbulista1.getApellido()+" -> ");
                    ((Futbolista) futbulista1).entrivista();
                    System.out.print(futbulista2.getNombre()+" "+futbulista2.getApellido()+" -> ");
                    ((Futbolista) futbulista2).entrivista();
                    System.out.println();

                    break;
                case 6:
                    System.out.println();
                    System.out.print(medico.getNombre()+" "+medico.getApellido()+" -> ");
                    ((Doctor) medico).curarLesiones();
                    System.out.println();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Error. el numero no esta en el menu");
            }
        }while (opcion!=7);
    }
}
