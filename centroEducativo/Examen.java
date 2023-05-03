package centroEducativo;

public abstract class Examen implements Aprobable {
    private String fechaRealización;

    public Examen(String fechaRealización) {
        this.fechaRealización = fechaRealización;
    }

}
