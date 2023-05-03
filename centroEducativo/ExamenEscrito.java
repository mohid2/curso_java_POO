package centroEducativo;

public class ExamenEscrito extends Examen {
    public static final int MIN_NOTA=0;
    public static final int MAX_NOTA=10;
    public static final int MOTA_APROBADO=6;
    public static final int MIN_DURACIO=90;
    private int duracion;
    private int nota;

    public ExamenEscrito(String fechaRealización, int duracion, int nota) {
        super(fechaRealización);
        this.duracion = duracion;
        this.nota = nota;
    }

    @Override
    public boolean aprobo() {
        boolean aprobado=false;
        if(nota>=MOTA_APROBADO && duracion<MIN_DURACIO){
            aprobado=true;
        }
        return aprobado;
    }
}
