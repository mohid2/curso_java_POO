package empresa;

import java.util.ArrayList;
import java.util.Collection;

public class Empresa {
    private Collection<Empleado>empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    public void mostrarSalario(){
        for (Empleado empleado:empleados){
            System.out.println(empleado.nombreCompleto()+": $ "+empleado.getSalario());
        }

    }
    public Empleado empleadoConMasClientes(){
        int i=0;
        Empleado e=null;
        for (Empleado empleado:empleados){
            if(empleado instanceof EmpleadoAComesion){
                if (((EmpleadoAComesion) empleado).getnClientesCaptados()>i){
                    i=((EmpleadoAComesion) empleado).getnClientesCaptados();
                    e=empleado;

                }
            }

        }
        return e;
    }
}
