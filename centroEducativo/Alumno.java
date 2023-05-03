package centroEducativo;

import java.util.ArrayList;
import java.util.Collection;

public class Alumno implements Aprobable {
    private String DNI;
    private String nombre;
    private String apellido;
    private ArrayList<Examen>examenes;

    public Alumno(String DNI, String nombre, String apellido) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.examenes = new ArrayList<>();
    }
    public void agregarExamen(Examen e){
        examenes.add(e);
    }

    public ArrayList<Examen> getExamenes() {
        return examenes;
    }

    @Override
    public boolean aprobo() {
        int i=0;
        while (i< examenes.size() && examenes.get(i).aprobo() ){
            i++;
        }
        return i==this.examenes.size();
    }
}
