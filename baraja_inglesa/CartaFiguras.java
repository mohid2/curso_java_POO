package baraja_inglesa;

import baraja_cartas.Palo;

public class CartaFiguras extends CartaConPalo{
    private char letra;

    public CartaFiguras(Palo palo, char letra) {
        super(palo);
        this.letra = letra;
    }
    @Override
    public String getRepresentacion(){
        return letra+super.getRepresentacion();
    }
}
