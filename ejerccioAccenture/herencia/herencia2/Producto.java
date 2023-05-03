package ejerccioAccenture.herencia.herencia2;

public class Producto {
    private String nombre;
    private double precio;


    public Producto() {
    }

    public Producto(Producto p) {
        this.nombre=p.nombre;
        this.precio= p.precio;
    }


    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double calcularImporteTotal(double cantidad){
        double precioTotal;
        precioTotal=cantidad*getPrecio();
        return precioTotal;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
