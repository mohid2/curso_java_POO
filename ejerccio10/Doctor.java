package ejerccio10;

public class Doctor extends Persona {
    private String titulacion;
    private int aniosExperiencia;


    public Doctor(String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    @Override
    public void entrenamiento() {
        System.out.println("da asestencia en un entrenamiento");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("da asestencia en un partido de futbol");

    }
    public void curarLesiones(){
        System.out.println("curar lesion");

    }
}
