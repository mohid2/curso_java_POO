package ejerccioAccenture.Polimorfismo.EjercicioPolimorfismo;

public class GestionVehiculos {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Turismo("Peugeot","307","8917 CFW");
        System.out.println(vehiculo.mostrarAtributos());
        System.out.println();
        vehiculo = new Deportivo("Ford","Mustang","4070 DEP",150);
        System.out.println(vehiculo.mostrarAtributos());
        System.out.println();
        vehiculo = new Furgoneta("Fiat","Ducato","4080 FUR",1200);
        System.out.println(vehiculo.mostrarAtributos());
    }
}
