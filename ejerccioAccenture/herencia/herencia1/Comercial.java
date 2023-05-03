package ejerccioAccenture.herencia.herencia1;

public class Comercial extends Empleado{
    private double comision;

    public Comercial() {
    }

    public Comercial(Persona p, Empleado e, Comercial c) {
        super(p, e);
        this.comision = c.comision;
    }

    public Comercial(String nombre, String primerA, String segundoA, String dni, int edad, int antiguedad, double salario, String puesto, double comision) {
        super(nombre, primerA, segundoA, dni, edad, antiguedad, salario, puesto);
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString()+"Comercial{" +
                "comision=" + comision +
                '}';
    }
    public void calcularComision(double incremento,double plus){
        this.comision+=incremento+plus;
    }
    public void calcularComision(double incremento){
        this.comision+=incremento;
    }
    public void actualizarSalario(double incremento){
        double sueldoActual=getSalario();

        if(getAntiguedad()<=5){
            calcularComision(25);
        }
        else {
           calcularComision(25,100);
        }
        double nuevaComision=comision;
        setSalario(sueldoActual+comision+incremento);
    }
}
