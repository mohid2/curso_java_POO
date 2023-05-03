package ejerccioAccenture.herencia.herencia1;

public class Empresa {
    public static void main(String[] args) {
        Empleado empleado=new Empleado();
        empleado.setNombre("Rebeca ");
        empleado.setPrimerApellido("Velasco");
        empleado.setSegundoApellido("González");
        empleado.setDni("11.111.111-H");
        empleado.setEdad(30);
        empleado.setAntiguedad(20);
        empleado.setSalario(1800.00);
        empleado.setPuesto("Jefe");
        System.out.println(empleado);
        empleado.actualizarSalario(150);
        System.out.println(empleado);
    }
}
