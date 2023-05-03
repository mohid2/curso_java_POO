package ejerccioAccenture.EjerciciosClasesAbstractas.claseabstracta.ej2;

public abstract class Empleado {
     public static final double PRECIO_HORA_EXTRA = 10.0;
     public static final double INC_MESA = 5.0;
    private String nombre;
    private double salario;
    private String puesto;

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public abstract void indicarPuesto();
    public abstract double calcularSalario();
}
