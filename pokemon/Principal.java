package pokemon;

public class Principal {
    public static void main(String[] args) {
        Squirtle squirtle=new Squirtle();
        Charmander charmander=new Charmander();
        Bulbasaur bulbasaur=new Bulbasaur();
        Pikachu pikachu=new Pikachu();

        squirtle.atacarAraniazo();
        squirtle.atacarHidroBomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrinaje();
        pikachu.atacarAraniazo();
        pikachu.atacarImpactrueno();

    }
}
