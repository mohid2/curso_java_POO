package ejerccioAccenture.EjerciciosClasesAbstractas.interfaces;

public class SeresVivos {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.setNombre("sara");
        persona.setGenero("femenino");
        persona.respirar();
        persona.dormir();
        persona.comer();
        Animal animal1=new Animal();
        Animal animal2=new Animal();
        Animal animal3=new Animal();
        System.out.println("--------------------------------");
        animal1.setEspecie("Mamífero");
        animal1.setTipoAlimentacion("carnívoro");
        animal1.setEspecie("Mamífero");
        animal2.setTipoAlimentacion("herbívoro");
        animal3.setEspecie("Mamífero");
        animal3.setTipoAlimentacion("omnívoro");
        animal1.respirar();
        animal1.dormir();
        animal1.comer();
        System.out.println("--------------------------------");
        animal2.respirar();
        animal2.dormir();
        animal2.comer();
        System.out.println("--------------------------------");
        animal3.respirar();
        animal3.dormir();
        animal3.comer();

    }

}
