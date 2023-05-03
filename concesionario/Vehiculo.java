package concesionario;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String patente;

    public Vehiculo(String marca, String modelo, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }

    public void acelerar(){
        System.out.println("acelerando....");
    }
    public void frenar(){
        System.out.println("frenando...");
    }
    public void encender(){
        System.out.println("arrancando....");
    }
}
