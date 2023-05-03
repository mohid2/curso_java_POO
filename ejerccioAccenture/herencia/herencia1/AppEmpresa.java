package ejerccioAccenture.herencia.herencia1;

public class AppEmpresa {
    public static void main(String[] args) {
        Comercial jefeZona = new Comercial("Lucas", "Guerrero", "Arjona","12345678A", 42, 12, 2400.00, "Jefe de zona", 100.00);
        Comercial comercial = new Comercial("Francisco", "Perez", "Antón","11111111H", 24, 2, 1200.00, "Comercial",50.00);
        jefeZona.actualizarSalario(200);
        comercial.actualizarSalario(200);
        System.out.println(jefeZona);
        System.out.println(comercial);
    }
}
