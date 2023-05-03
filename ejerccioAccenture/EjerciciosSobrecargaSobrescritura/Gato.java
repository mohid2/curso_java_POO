package ejerccioAccenture.EjerciciosSobrecargaSobrescritura;

public class Gato extends Animal{

    public Gato() {
    }
    @Override
    public void emitirSonido(){
        System.out.println("Miau, miau, miau!!");
    }
}
