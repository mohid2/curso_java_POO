package baraja_inglesa;

import baraja_cartas.Palo;

public class CartaNumerales extends CartaConPalo{
    private int numero;

    public CartaNumerales(Palo palo, int numero) {
        super(palo);
        this.numero = numero;
    }

    @Override
    public String getRepresentacion(){
        return  numero+super.getRepresentacion();
    }

}



