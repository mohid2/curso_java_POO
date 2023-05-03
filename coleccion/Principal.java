package coleccion;

public class Principal {
    public static void main(String[] args) {
        Concesionario c = new Concesionario("Fakecar");
        c.agregarAutos(new Auto("DEF457","Blanco",4000));
        c.agregarAutos(new Auto("ABC123","Rojo",1000));
        c.agregarAutos(new Auto("DEF45","Gris",4000));
        c.agregarAutos(new Auto("BCD234","Verde",2000));
        c.agregarAutos(new Auto("CDE345","Azul",3000));
        c.agregarAutos(new Auto("DEF456","Negro",4000));
        System.out.println(c.maximo());
        System.out.println(c.minimo());



    }
}
