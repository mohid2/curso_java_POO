package empresa;

public class EmpleadoAComesion extends Empleado {
    private double salarioMinimo;
    private int nClientesCaptados;
    private double montoCobrarClienteCaptado;

    public EmpleadoAComesion(String dni, String nombre, String apellido, int anioIngreso, double salarioMinimo, int nClientesCaptados, double montoCobrarClienteCaptado) {
        super(dni, nombre, apellido, anioIngreso);
        this.salarioMinimo = salarioMinimo;
        this.nClientesCaptados = nClientesCaptados;
        this.montoCobrarClienteCaptado = montoCobrarClienteCaptado;
    }

    public int getnClientesCaptados() {
        return nClientesCaptados;
    }


    @Override
    public double getSalario() {
        double salario=nClientesCaptados*montoCobrarClienteCaptado;;
        if(salario<salarioMinimo){
            salario=salarioMinimo;
        }

        return salario;
    }

    @Override
    public String toString() {
        return super.toString()+"EmpleadoAComesion{" +
                "salarioMinimo=" + salarioMinimo +
                ", nClientesCaptados=" + nClientesCaptados +
                ", montoCobrarClienteCaptado=" + montoCobrarClienteCaptado +
                '}';
    }
}
