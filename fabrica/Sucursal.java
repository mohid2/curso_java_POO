package fabrica;

import java.util.ArrayList;
import java.util.Iterator;

public class Sucursal {
    private String nombre;
    private ArrayList<Instrumentos> instrumentos;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public void listarInstrumentos(Instrumentos a){
        this.instrumentos.add(a);
    }

    public String getNombre() {
        return nombre;
    }
    public ArrayList<Instrumentos>buscarInstrumentos(Tipo a){
        ArrayList<Instrumentos>insEncontrados=new ArrayList<>();
        for (Instrumentos instrumento:instrumentos){
            if(instrumento.getTipoInstrumento()==a){
                insEncontrados.add(instrumento);
            }
        }
        return insEncontrados;
    }




    public void mostrarInstrumentos(){
        for (Instrumentos instrumento:instrumentos){
            System.out.println(instrumento);
        }

    }
    public Instrumentos borarrInstrumento(String id){
        Instrumentos borrado=buscarInstrumento(id);
        this.instrumentos.remove(borrado);
        return borrado;
    }
    public Instrumentos buscarInstrumento(String id){
        Instrumentos encontrado=null;
        int i=0;
        while (i<instrumentos.size() && !this.instrumentos.get(i).getId().equalsIgnoreCase(id)){
              i++;
        }
        if(i<instrumentos.size()){
            encontrado=instrumentos.get(i);
        }
        return encontrado;

    }
    public ArrayList<Double> porcInstrumentosPorTipo (){
        int cantCuerda=0,cantViento=0,cantPercusion=0,i=0;
        ArrayList<Double>procentajes=new ArrayList<>();
        for (Instrumentos inst:instrumentos){
            if(inst.getTipoInstrumento()==Tipo.CUERDA){
                cantCuerda++;
            }
            if(inst.getTipoInstrumento()==Tipo.VIENTO){
                cantViento++;
            }
            if(inst.getTipoInstrumento()==Tipo.PERCUSION){
                cantPercusion++;
            }
            i++;
        }
        if(cantCuerda!=0){
            procentajes.add(((double)cantCuerda*100)/i);
        }
        if(cantViento!=0){
            procentajes.add(((double)cantViento*100)/i);
        }
        if(cantPercusion!=0){
            procentajes.add(((double)cantPercusion*100)/i);
        }
        return procentajes;
    }


    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", instrumentos=" + instrumentos +
                '}';
    }
}
