package ejerccio10;

public class Futbolista extends Persona{
    private int dorsal;
    private String posicion;

    public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public void entrenamiento() {
        System.out.println("entrena");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("juega el partido");
    }
    public void entrivista(){
        System.out.println("da una entrivista");

    }
}
