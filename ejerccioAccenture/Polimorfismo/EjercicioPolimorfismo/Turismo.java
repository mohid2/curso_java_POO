package ejerccioAccenture.Polimorfismo.EjercicioPolimorfismo;

public class Turismo extends Vehiculo {

    public Turismo() {
    }

    public Turismo(Vehiculo v) {
        super(v);
    }

    public Turismo(String tipo, String modelo, String matricula) {
        super(tipo, modelo, matricula);
    }

    @Override
    public String mostrarAtributos(){
        return "Datos del turismo\n" +
                "--------------------------------"+
                "\nMarca: " + getTipo()+
                "\nModelo: " + getModelo() +
                "\nMatricula: " + getMatricula();
    }
}
