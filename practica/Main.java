package practica;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> miscarros=new Stack<>();

        miscarros.add(new Carro("Ford","Fiesta",4,"Compacto de cuatro " +
                                 "puestas ensamblado en México"));
        miscarros.add(new Carro("BMW","Serie 2",4,"Sedán compacto cupé " +
                                "ensamblado en Alemania"));
        miscarros.add(new Carro("Jaguar","XE",2,"Sedán compact competidor " +
                                "del BMW Serie 3"));
        miscarros.add(new Carro("Jaguar","XE",2,"Sedán compact competidor " +
                "del BMW Serie 3"));

        Iterator e=miscarros.iterator();
        while (e.hasNext()){
            Carro c=(Carro)e.next();
            System.out.println(c.toString());

        }

       /* for(int i=0;i<miscarros.size();i++){
            System.out.println(miscarros.get(i));
        }*/
    }
}
