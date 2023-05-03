package baraja_inglesa;

import baraja_cartas.Palo;

public abstract class CartaConPalo extends Carta {

    private Palo palo;

    public CartaConPalo(Palo palo) {

        this.palo = palo;
    }


    @Override
    public String getRepresentacion(){
        return " de "+palo+", "+palo.getColor();
    }
}
