package concesionario;

public class Auto extends Vehiculo {
    private boolean tieneAire;

    public Auto(String marca, String modelo, String patente, boolean tieneAire) {
        super(marca, modelo, patente);
        this.tieneAire = tieneAire;
    }

    public void encenderAire(){
       if(this.tieneAire==true){
           System.out.println("aire encendido");

       }
    }
}
