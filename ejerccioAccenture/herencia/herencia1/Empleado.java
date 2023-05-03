package ejerccioAccenture.herencia.herencia1;

public class Empleado extends Persona{
    private int antiguedad;
    private double salario;
    private String puesto;

    public Empleado(){


    }

    public Empleado(Persona p, Empleado e) {
        super(p);
        this.antiguedad = e.antiguedad;
        this.salario = e.salario;
        this.puesto = e.puesto;
    }

    public Empleado(String nombre, String primerA, String segundoA, String dni, int edad, int antiguedad, double salario, String puesto) {
        super(nombre, primerA, segundoA, dni, edad);
        this.antiguedad = antiguedad;
        this.salario = salario;
        this.puesto = puesto;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public double getSalario() {
        return salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public void actualizarSalario(double incremento){
        if(incremento>0){
            this.salario+=incremento;
        }
    }

    @Override
    public String toString() {
        return super.toString() +"\nEmpleado{" +
                "antiguedad=" + antiguedad +
                ", salario=" + salario +
                ", puesto='" + puesto + '\'' +
                '}';
    }
}
