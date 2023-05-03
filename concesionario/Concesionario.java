package concesionario;

import java.util.ArrayList;
import java.util.Collection;

public class Concesionario {
    private String nombre;
    private Collection<Vehiculo> vehiculos;

    public Concesionario(String nombre) {
        this.nombre = nombre;
        this.vehiculos=new ArrayList<>();
    }

    public void agregarVehiculos(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
}
