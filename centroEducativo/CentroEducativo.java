package centroEducativo;

import java.util.ArrayList;
import java.util.Collection;

public class CentroEducativo {
    private Collection<Alumno>alumnos;

    public CentroEducativo() {
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumnos(Alumno a){
            alumnos.add(a);
    }

    public int cantAprobados(){
        int aprobados=0;
        for (Alumno alumno:alumnos){
            if(alumno.aprobo()){
                aprobados++;
            }
        }
        return aprobados;
    }
}
