package coleccion;

import java.util.ArrayList;
import java.util.Collection;

public class Concesionario {
    private String nombre;
    private ArrayList<Auto> autos;

    public Concesionario(String nombre) {
        this.nombre = nombre;
        this.autos =new ArrayList<>();
    }
    public void agregarAutos(Auto a){
        this.autos.add(a);
    }
    public ArrayList<Auto> maximo(){
      ArrayList<Auto>autoMax=new ArrayList<>();
        double kmMax=-1;
        for (Auto auto:autos){
            if (auto.getKm()>=kmMax){
                kmMax=auto.getKm();
                autoMax.add(auto);
            }
        }
            return autoMax;
    }
    public Auto minimo(){
        Auto autoMini= null;
        double kmMini=Integer.MAX_VALUE;
        for (Auto auto:autos){
            if (auto.getKm()<kmMini){
                kmMini=auto.getKm();
                autoMini=auto;
            }
    }
        return autoMini;
    }
}
