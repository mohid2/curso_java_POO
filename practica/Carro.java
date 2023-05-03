package practica;

public class Carro {
    private String marca;
    private String modelo;
    private int puertas;
    private String descripcion;

    public Carro(String marca, String modelo, int puertas, String descripcion) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public String toString() {
        return
                "\nmarca: " + marca +
                "\nmodelo: " + modelo +
                "\npuertas: " + puertas +
                "\ndescripcion: " + descripcion+"\n";
    }
}
