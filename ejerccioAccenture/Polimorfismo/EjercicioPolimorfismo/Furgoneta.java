package ejerccioAccenture.Polimorfismo.EjercicioPolimorfismo;

public class Furgoneta extends Vehiculo{
    private int carga;

    public Furgoneta() {
    }

    public Furgoneta(Vehiculo v, Furgoneta f) {
        super(v);
        this.carga = f.carga;
    }

    public Furgoneta(String tipo, String modelo, String matricula, int carga) {
        super(tipo, modelo, matricula);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    @Override
    public String mostrarAtributos(){
        return "Datos de la furgoneta\n" +
                "--------------------------------"+
                "\nMarca: " + getTipo()+
                "\nModelo: " + getModelo() +
                "\nMatricula: " + getMatricula()+
                "\nCarga: "+carga;
    }
}
