package ejerccioAccenture.EjerciciosSobrecargaSobrescritura;

public class Granja {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Perro perro=new Perro();
        Gato gato=new Gato();
        Vaca vaca=new Vaca();
        animal.emitirSonido();
        perro.emitirSonido();
        gato.emitirSonido();
        vaca.emitirSonido();
    }
}
