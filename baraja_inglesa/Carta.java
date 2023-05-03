package baraja_inglesa;

public abstract class Carta {
    private boolean tapada;

    public Carta() {
        this.tapada=true;
    }

    public boolean isTapada() {
        return tapada;
    }

    public  void darVuelta(){
        this.tapada=!tapada;
    }
    public  void mostrar(){
        if(tapada){
            System.out.println("*****************");
        }
        else {
            System.out.println(getRepresentacion());
        }
    }
    public abstract String getRepresentacion();

    @Override
    public String toString() {
        return "Carta{" +
                "tapada=" + tapada +
                '}';
    }
}
