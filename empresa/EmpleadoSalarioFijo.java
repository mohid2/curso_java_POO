package empresa;

public class EmpleadoSalarioFijo  extends Empleado{
    private static final double PRC1=0.05;
    private static final double PRC2=0.10;
    private static final double ANIO1=2;
    private static final double ANIO2=5;

    private double sueldoBasico;

    public EmpleadoSalarioFijo(String dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }
    private double procentajeAdicional(){
        double procentaje = 0;
        if(super.antiguidad()>=ANIO1 && super.antiguidad()<5){
            procentaje=PRC1;
        }
        else if (super.antiguidad()>ANIO2){
            procentaje=PRC2;
        }
        return procentaje ;
    }

    @Override
    public double getSalario(){
        return sueldoBasico+sueldoBasico*procentajeAdicional();
    }
}
