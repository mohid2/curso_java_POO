package coleccion1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Concesuinario1 {
    private String nombre;
    private HashSet<Auto1> autos;

    public Concesuinario1(String nombre) {
        this.nombre = nombre;
        this.autos=new HashSet<>();
    }

    public void agregarAutos(Auto1 a){
        this.autos.add(a);
    }

    public Auto1 buscarAuto(String matricula){
        Auto1 auto=null;
        Iterator<Auto1> it=this.autos.iterator();
        while (it.hasNext() && auto==null){
            Auto1 a=it.next();
            if (a.getMatricula().equalsIgnoreCase(matricula)){
                auto=a;
            }
        }

        return auto;
    }
}
