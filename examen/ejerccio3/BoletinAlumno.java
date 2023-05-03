package examen.ejerccio3;

import java.util.ArrayList;
import java.util.List;

public class BoletinAlumno {
    private String nombre;
    private int programacion;
    private int entorno;
    private int bbdd;
    private int lenguajeMarcas;
    private int sistemaInformaticos;
    private int fol;

    public BoletinAlumno(String nombre, int programacion, int entorno, int bbdd, int lenguajeMarcas, int sistemaInformaticos, int fol) {
        this.nombre = nombre;
        this.programacion = programacion;
        this.entorno = entorno;
        this.bbdd = bbdd;
        this.lenguajeMarcas = lenguajeMarcas;
        this.sistemaInformaticos = sistemaInformaticos;
        this.fol = fol;
    }

    private boolean comprobarNota(int nota){
        if(nota<=0 && nota>=10){
            return true;
        }
        else {
            return false;
        }

    }
    public static double procentajeAprobados(BoletinAlumno a){
        double num=0;
        if(a.programacion<=4){
            num++;
        }
        if(a.entorno<4){
            num++;
        }
        if(a.sistemaInformaticos<=4){
            num++;
        }
        if(a.fol<=4){
            num++;
        }
        if(a.bbdd<=4){
            num++;
        }
        double procentaje=((6-num)*100)/6;
        return procentaje;
    }

    public static String aprobados(BoletinAlumno a){

        if(a.programacion<=4 && (a.bbdd<=4 || a.lenguajeMarcas<=4 || a.entorno<=4 || a.sistemaInformaticos<=4 || a.fol<=4)){
            return "repetidor";
        }
        else if (a.bbdd<=4 && (a.programacion<=4 || a.lenguajeMarcas<=4 || a.entorno<=4 || a.sistemaInformaticos<=4 || a.fol<=4)){
            return "repetidor";
        }
        else if(a.sistemaInformaticos<=4 && (a.bbdd<=4 || a.lenguajeMarcas<=4 || a.entorno<=4 || a.programacion<=4 || a.fol<=4)){
            return "El alumno "+a.nombre+" pasa con modulos pendientes";
        }
        else if(a.programacion<=4) {
            return "El alumno "+a.nombre+" pasa con modulos pendientes";
        }
        else if(a.lenguajeMarcas<=4) {
            return "El alumno "+a.nombre+" pasa con modulos pendientes";
        }
        else if(a.entorno<=4 ) {
            return "El alumno "+a.nombre+" pasa con modulos pendientes";
        }
        else if(a.sistemaInformaticos<=4 ) {
            return "El alumno "+a.nombre+" pasa con modulos pendientes";
        }
        else if(a.bbdd<=4) {
            return "El alumno "+a.nombre+" pasa con modulos pendientes";
        }
        else if(a.fol<=4) {
            return "El alumno "+a.nombre+" pasa con modulos pendientes";
        }

        else if(a.lenguajeMarcas<=4 && (a.entorno<=4 || a.fol<=4)) {
            return "El alumno "+a.nombre+" pasa con modulos pendientes";
        }
        else if(a.entorno<=4 && (a.lenguajeMarcas<=4 || a.fol<=4)){
            return "aprobado";
        }
        else if(a.fol<=4 && (a.entorno<=4 || a.lenguajeMarcas<=4)){
            return "El alumno "+a.nombre+" pasa con modulos pendientes";
        }
        else {
            return "El alumno "+a.nombre+" pasa sin modulos pendientes";
        }
    }
    public  String informacionNotas(int programacion, int entorno, int bbdd, int lenguajeMarcas, int sistemaInformaticos, int fol){
        int Suspensos=0,Aprobados=0,Notables=0,Subresalientes=0;
        List<Integer> asig =new ArrayList<>();
        asig.add(programacion);
        asig.add(entorno);
        asig.add(bbdd);
        asig.add(lenguajeMarcas);
        asig.add(sistemaInformaticos);
        asig.add(fol);
        for(int i=0;i<asig.size();i++){
            if(asig.get(i)<=4){
                Suspensos++;
            }
            if((asig.get(i)>=5)&&( asig.get(i)<7)){
                Aprobados++;
            }
            if (asig.get(i)>=7 && asig.get(i)<=8 ) {
                Notables++;
            }
            if(asig.get(i)>=9){
                Subresalientes++;
            }
        }
        return "Suspensos: "+Suspensos+"\nAprobados: "+Aprobados+"\nNotable: "+Notables+"\nSuspensos: "+Subresalientes;
    }

    @Override
    public String toString() {
        return
                "nombre: "+ nombre +
                "\nprogramacion: " + programacion +
                "\nentorno=" + entorno +
                "\nbbdd: " + bbdd +
                "\nlenguajeMarcas: " + lenguajeMarcas +
                "\nsistemaInformaticos: "+ sistemaInformaticos+
                "\nfol=" + fol;
    }
}
