package ejerccioAccenture.EjerciciosClasesAbstractas.claseabstracta.ej2;

public class Camarero extends Empleado{
    private int numMesasAsignadas;
    private int horasExtras;

    public int getNumMesasAsignadas() {
        return numMesasAsignadas;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setNumMesasAsignadas(int numMesasAsignadas) {
        this.numMesasAsignadas = numMesasAsignadas;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public void indicarPuesto() {
        System.out.println(getNombre()+" es un "+getPuesto());

    }

    @Override
    public double calcularSalario() {
        double salario = getSalario()+ (horasExtras * PRECIO_HORA_EXTRA) +
                (numMesasAsignadas * INC_MESA);
        return salario;
    }
}
