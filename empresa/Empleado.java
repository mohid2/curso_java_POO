package empresa;

import java.time.LocalDate;
import java.util.Locale;

public abstract class Empleado  {
    private String dni;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado(String dni, String nombre, String apellido, int anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public int getAnioIngreso(){
        return anioIngreso;
    }
    public String nombreCompleto(){
        return nombre+" "+apellido;
    }
    public int antiguidad(){
        int anioActual= LocalDate.now().getYear();
        return  anioActual-getAnioIngreso();
    }



    public abstract double getSalario();

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", anioIngreso=" + anioIngreso +
                '}';
    }
}
