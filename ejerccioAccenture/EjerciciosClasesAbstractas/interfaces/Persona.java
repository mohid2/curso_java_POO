package ejerccioAccenture.EjerciciosClasesAbstractas.interfaces;

public class Persona implements Comportamientos {
    private String nombre;
    private String genero;

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void respirar() {
        System.out.println(nombre+" esta respirando");
    }

    @Override
    public void dormir() {
        System.out.println(nombre+" está durmiendo en la cama");
    }

    @Override
    public void comer() {
        System.out.println(nombre+"está comiendo en la mesa");
    }
}
