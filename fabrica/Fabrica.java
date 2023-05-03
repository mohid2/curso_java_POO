package fabrica;

import java.util.ArrayList;

public class Fabrica {
    private ArrayList<Sucursal> sucursales;

    public Fabrica() {
        this.sucursales = new ArrayList<>();
    }
    public void agregarSucursales(Sucursal a){
        this.sucursales.add(a);
    }

   public ArrayList<Instrumentos>buscarInstrumentos(Tipo a){
        ArrayList<Instrumentos>insEncontrado=new ArrayList<>();
        for (Sucursal sucursal:sucursales){
            insEncontrado.addAll(sucursal.buscarInstrumentos(a));
        }
        return insEncontrado;
    }

    public void mostrarInstrumentos(){
        for (Sucursal sucursal:sucursales){
            System.out.println(sucursal.getNombre());
            sucursal.mostrarInstrumentos();
        }

    }

    public void mostrarSucursales(String id){
        for (Sucursal sucursal:sucursales){
            System.out.println(sucursal);
        }
    }
    public Instrumentos borrarInstrumento(String id){
        Instrumentos borrado=null;
        int i=0;
        while (i<sucursales.size() && borrado==null){
            borrado=sucursales.get(i).borarrInstrumento(id);
            i++;
        }
        return borrado;
    }
    public ArrayList<Double>  porcInstrumentosPorTipo (String nom){
        ArrayList<Double> procentajes=null;
        Sucursal s=buscarSucursal(nom);
        if(s!=null){
            procentajes=s.porcInstrumentosPorTipo();
        }
        return procentajes;
    }
    private Sucursal buscarSucursal(String s){
        Sucursal su=null;
        int i=0;
        while (i<sucursales.size() && !this.sucursales.get(i).getNombre().equalsIgnoreCase(s)){
            i++;
        }
        if(i<sucursales.size()){
            su=this.sucursales.get(i);
        }
        return su;
    }

}
