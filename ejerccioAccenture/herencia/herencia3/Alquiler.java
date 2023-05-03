package ejerccioAccenture.herencia.herencia3;

import java.util.ArrayList;
import java.util.Scanner;

public class Alquiler {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Ejemplar> ejemplars = new ArrayList<>();
        ejemplars.add(new Serie("Juego de tronos", "George R. R. Martin", true, 8, "Aventuras"));
        ejemplars.add(new Serie("Los Simpsons", "Matt Groening", false, 25, "Humor"));
        ejemplars.add(new Serie("Padre de familia", "Seth MacFarlane", true, 12, "Humor"));
        ejemplars.add(new Serie("Breaking Bad", "Vince Gilligan", false, 5, "Thriller"));
        ejemplars.add(new Pelicula("Memorias de una Geisha", "Drama", true, "Rob Marshall"));
        ejemplars.add(new Pelicula("La milla verde", "Drama/Fantástico", false, "Frank Darabont"));
        ejemplars.add(new Pelicula("Hermanos por pelotas", "Comedia", true, "Adam McKay"));
        ejemplars.add(new Pelicula("El resplandor", "Terror", false, "Stanley Kubrick"));
        System.out.print("Diga el titulo de la pelicula o serie a prestar: ");
        String titulo = entrada.nextLine();
        prestar(ejemplars,titulo);
        System.out.println();
        System.out.print("Diga el titulo de la pelicula o serie a devolver: ");
        titulo=entrada.nextLine();
        devolver(ejemplars,titulo);
        System.out.println();
        listadoDisponibles(ejemplars);
        System.out.println();
        listadoAlquiladas(ejemplars);



    }
    public static void prestar(ArrayList<Ejemplar>e,String t){
        Ejemplar ej = null;
        for (Ejemplar ejemplar : e) {
            if (ejemplar.getTitulo().equalsIgnoreCase(t)) {
                ej=ejemplar;
                ejemplar.entregar();
                System.out.println(ejemplar);
            }
        }
        if(e==null){
            System.out.println("No tenemos ese ejemplar para prestar");
        }
    }
    public static void devolver(ArrayList<Ejemplar>e,String t){
        for (Ejemplar ejemplar : e) {
            if (ejemplar.getTitulo().equalsIgnoreCase(t)) {
                ejemplar.devolver();
                System.out.println(ejemplar);
            }
        }
    }
    public static void listadoDisponibles(ArrayList<Ejemplar>ejemplars){
        System.out.println("listado de peliculas disponibles");
        System.out.println("----------------------------------");
        for (Ejemplar ejemplar:ejemplars){
            if(ejemplar.isDisponible()){
                System.out.println(ejemplar.getTitulo());
            }
        }
    }
    public static void listadoAlquiladas(ArrayList<Ejemplar>ejemplars){
        System.out.println("listado de peliculas alquiladas");
        System.out.println("----------------------------------");
        for (Ejemplar ejemplar:ejemplars){
            if(!ejemplar.isDisponible()){
                System.out.println(ejemplar.getTitulo());
            }}
    }
}
