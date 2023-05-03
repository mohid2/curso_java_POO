package ejerccioAccenture.Polimorfismo.EjercicioPolimorfismo;

public class Deportivo extends Vehiculo {
    private int cilindrada;

    public Deportivo() {

    }

    public Deportivo(Vehiculo v, Deportivo d) {
        super(v);
        this.cilindrada = d.cilindrada;
    }

    public Deportivo(String tipo, String modelo, String matricula, int cilindrada) {
        super(tipo, modelo, matricula);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String mostrarAtributos(){
        return "Datos del deportivo\n" +
                "--------------------------------"+
                "\nMarca: " + getTipo()+
                "\nModelo: " + getModelo() +
                "\nMatricula: " + getMatricula()+
                "\nCilindrada: "+cilindrada;
    }

}
