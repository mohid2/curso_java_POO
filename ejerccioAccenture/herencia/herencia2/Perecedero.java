package ejerccioAccenture.herencia.herencia2;

public class Perecedero extends Producto {
    private int diasACaducar;


    public Perecedero() {
    }

    public Perecedero(Producto p, Perecedero pe) {
        super(p);
        this.diasACaducar=pe.diasACaducar;
    }

    public Perecedero(String nombre, double precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }

    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        if(diasACaducar>0){
            this.diasACaducar = diasACaducar;
        }
    }
    @Override
    public double calcularImporteTotal(double cantidad){
        double precioTotal;
        precioTotal=cantidad*getPrecio();
        double descuento;
        if(diasACaducar==1){
            descuento=precioTotal*0.50;
            precioTotal-=descuento;
        }
        else if (diasACaducar==2){
            descuento=precioTotal*0.25;
            precioTotal-=descuento;

        }
        else {
            descuento=precioTotal*0.10;
            precioTotal-=descuento;
        }

        return precioTotal;
    }


    @Override
    public String toString() {
        return super.toString()+"\nPerecedero{" +
                "diasACaducar=" + diasACaducar +
                '}';
    }
}
