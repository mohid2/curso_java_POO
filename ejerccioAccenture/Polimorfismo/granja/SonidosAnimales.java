package ejerccioAccenture.Polimorfismo.granja;

public class SonidosAnimales {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.emitirSonido();
        animal = new Perro();
        animal.emitirSonido();
        animal = new Gato();
        animal.emitirSonido();
        animal = new Vaca();
        animal.emitirSonido();

    }
}
