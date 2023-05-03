package ejerccio10;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void viejaEquepo(){
        System.out.println("viajar");

    }
    public abstract void entrenamiento();
    public abstract void partidoFutbol();
}
