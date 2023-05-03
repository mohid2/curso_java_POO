package ejerccioAccenture.herencia.herencia3;

import java.util.ArrayList;

public class Ejemplar {
    private String titulo;
    private String genero;
    private boolean disponible;

    public Ejemplar() {
    }

    public Ejemplar(Ejemplar e) {
        this.titulo=e.titulo;
        this.genero=e.genero;
        this.disponible=e.disponible;
    }

    public Ejemplar(String titulo, String genero, boolean disponible) {
        this.titulo = titulo;
        this.genero = genero;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return  "Datos de alquiler" +
                "\n_______________________"+
                "\ntitulo: " + titulo +
                "\ngenero: " + genero;
    }
    public  void entregar(){
        if(disponible){
            disponible=false;
            System.out.println("Se ha prestado " + titulo);
        }
        else {
            System.out.println("No est� disponible " + titulo + " para prestar");
        }
    }
    public void devolver(){
        if(!disponible){
            disponible=true;
            System.out.println("Se ha devuelto " + titulo);
        }
        else {
            System.out.println("No estaba alquilada " + titulo + " para devolver");
        }
    }

}
