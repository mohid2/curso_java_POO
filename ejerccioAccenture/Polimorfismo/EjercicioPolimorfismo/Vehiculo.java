package ejerccioAccenture.Polimorfismo.EjercicioPolimorfismo;

public class Vehiculo {
    private String tipo;
    private String modelo;
    private String matricula;

    public Vehiculo() {
    }


    public Vehiculo(Vehiculo v) {
        this.tipo = v.tipo;
        this.modelo =v.modelo;
        this.matricula =v.matricula;
    }

    public Vehiculo(String tipo, String modelo, String matricula) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String mostrarAtributos(){
        return "Datos del vehículo\n" +
                "--------------------------------"+
                "\nMarca: " + tipo +
                "\nModelo: " + modelo +
                "Matricula: " + matricula;
    }
}
