package coleccion1;

import coleccion.Auto;
import coleccion.Concesionario;

public class Principal {
    public static void main(String[] args) {
        Concesuinario1 c1=new Concesuinario1("casacoche");

        c1.agregarAutos(new Auto1("ABC123","Rojo",1003));
        c1.agregarAutos(new Auto1("DEF456","Negro",4000));
        c1.agregarAutos(new Auto1("BCD234","Verde",2000));
        c1.agregarAutos(new Auto1("DEF458","Blanco",4000));
        c1.agregarAutos(new Auto1("CDE345","Azul",3000));
        c1.agregarAutos(new Auto1("DEF457","Gris",4000));
        System.out.println(c1.buscarAuto("BCD234"));
    }
}