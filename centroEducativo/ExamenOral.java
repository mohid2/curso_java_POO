package centroEducativo;

public class ExamenOral extends Examen {
    private NivelSatisfacción nivelSatisfacción;


    public ExamenOral(String fechaRealización, NivelSatisfacción nivelSatisfacción) {
        super(fechaRealización);
        this.nivelSatisfacción = nivelSatisfacción;
    }

    @Override
    public boolean aprobo() {
        boolean aprobado=true;
        if(nivelSatisfacción==NivelSatisfacción.INSUFICIENTE){
            aprobado=false;
        }
        return aprobado;
    }
}