package concesionario;

public class Moto extends Vehiculo {
    private int anchoDeManubrio;

    public Moto(String marca, String modelo, String patente, int anchoDeManubrio) {
        super(marca, modelo, patente);
        this.anchoDeManubrio = anchoDeManubrio;
    }

    public void haceCaballito(){
        System.out.println("la mota esta sobre una rueda ");
    }
}
