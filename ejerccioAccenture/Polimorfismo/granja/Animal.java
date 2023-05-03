package ejerccioAccenture.Polimorfismo.granja;

public class Animal {
    private String tipo;
    private int nPatas;
    private String sonido;

    public Animal() {
    }

    public String getTipo() {
        return tipo;
    }

    public int getnPatas() {
        return nPatas;
    }

    public String getSonido() {
        return sonido;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setnPatas(int nPatas) {
        this.nPatas = nPatas;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
    public void emitirSonido(){
        System.out.println("Sonido del animal");
    }
}
