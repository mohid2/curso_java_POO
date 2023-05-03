package ejerccio3;

public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }


    public float getPrecio() {

        return precio;
    }
    public String mostrarDatos(){
       return  "precio: "+ precio+"\n"+"modelo: "+modelo+"\n"+"marca: "+marca;
    }
    public static int indiceCocheMBarato(Vehiculo coche[]){
        float precio;
        int indice=0;
        precio=coche[0].getPrecio();
        for (int i=1;i<coche.length;i++){
            if(coche[i].getPrecio()<precio){
                precio=coche[i].getPrecio();
                indice=i;
            }
        }
        return indice;
    }

}
