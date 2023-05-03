package ejerccioAccenture.EjerciciosClasesAbstractas.claseabstracta.ej2;

public class Cocinero extends Empleado{
    public int horasExtras;

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public void indicarPuesto() {
        System.out.println(getNombre()+"es un "+getPuesto());

    }

    @Override
    public double calcularSalario() {
       double salario = super.getSalario() + (horasExtras * PRECIO_HORA_EXTRA);
        return salario;
    }
}
