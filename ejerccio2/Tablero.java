package ejerccio2;

public class Tablero {
    private int x;
    private int y;

    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void movirArriba(int incremento){
        y+=incremento;
    }
    public void movirAbajo(int incremento){
        y-=incremento;
    }
    public void movirIzquierda(int incremento){
        x-=incremento;

    }public void movirderecha(int incremento){
        x+=incremento;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
