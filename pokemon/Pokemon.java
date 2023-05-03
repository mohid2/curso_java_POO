package pokemon;

public abstract class Pokemon {
    protected int numeroPokedex;
    protected String nombrePokemon;
    protected double peso;
    protected String sexo;
    protected int temporada;



    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();

}
