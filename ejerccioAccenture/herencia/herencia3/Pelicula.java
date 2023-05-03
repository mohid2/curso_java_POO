package ejerccioAccenture.herencia.herencia3;

public class Pelicula extends Ejemplar {
    private String director;

    public Pelicula() {
    }

    public Pelicula(Ejemplar e, Pelicula p) {
        super(e);
        this.director = p.director;
    }

    public Pelicula(String titulo, String genero, boolean disponible, String director) {
        super(titulo, genero, disponible);
        this.director = director;
    }

    @Override
    public String toString() {
        return   super.toString()+
                "\ndirector: " + director +
                "\nDisponible: "+ isDisponible();
    }
}
