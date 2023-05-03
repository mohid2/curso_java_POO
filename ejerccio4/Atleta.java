package ejerccio4;

public class Atleta {
   private int numeroAtlita;
   private String nombre;
   private float tiempoCarrera;

    public Atleta(int numeroAtlita, String nombre, float tiempoCarrera) {
        this.numeroAtlita = numeroAtlita;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }
    public float getTiempoCarrera(){
        return tiempoCarrera;
    }
    public  String mostrarDatosGanador(){
        return "numero atleta: "+ numeroAtlita+"\n"+"nombre: "+nombre+"\n"+"tiempo carrera: "+tiempoCarrera;
    }

    public static int indiceGanador(Atleta atleta[]){
        int indice=0;
        float tiempo;
        tiempo=atleta[0].getTiempoCarrera();
        for (int i=1;i<atleta.length;i++){
            if(atleta[i].getTiempoCarrera()<tiempo){
                tiempo=atleta[i].getTiempoCarrera();
                indice=i;
            }
        }
        return indice;

    }


}
