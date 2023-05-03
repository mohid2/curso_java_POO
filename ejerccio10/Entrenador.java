package ejerccio10;

public class Entrenador extends Persona{
    private String estrategia;

    public Entrenador(String nombre, String apellido, int edad, String estrategia) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    @Override
    public void entrenamiento() {
        System.out.println("dirige el entrenamiento");

    }

    @Override
    public void partidoFutbol() {
        System.out.println("dirige un partido de futbol");
    }
    public void planificarEntenamiento(){
        System.out.println("planifica el entrenamiento");
    }
}
