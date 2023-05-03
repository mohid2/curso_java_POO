package ejerccio8;

public class Sucursal {
    private int numeroSucursal;
    private String direccion;
    private String cuidad;

    public Sucursal(int numeroSucursal, String direccion, String cuidad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.cuidad = cuidad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCuidad() {
        return cuidad;
    }
    public String moatrarDatos(){
        return "numero sucursal: "+getNumeroSucursal()+"\nDireccion: "+getDireccion()+"\nCuidad: "+getCuidad();
    }

    public double calcularPrecioPaquete(Paquete l){
        double precio;
        precio=l.getPeso();
        if(l.getPrioridad()==1){
            precio+=10;
        }
        else if (l.getPrioridad()==2){
            precio+=20;}
        return precio;
        }
}
