package baraja_cartas;

import baraja_inglesa.Carta;
import baraja_inglesa.CartaFiguras;
import baraja_inglesa.CartaJoker;
import baraja_inglesa.CartaNumerales;

import java.util.ArrayList;
public class BarajaInglesa{
    private ArrayList<Carta>cartas;

    public BarajaInglesa(){
        this.cartas=new ArrayList<>();
        generarCartas();
    }
    private void generarCartas(){
        generarCartarNumerales();
        generarCartasFiguras();
        genararCartasJoker();

    }
    private void generarCartarNumerales(){
        final int MIN_VALOR=2;
        final int MAX_VALOR=10;
        Palo[] palo=Palo.values();
        for (int p=0;p<palo.length;p++){
            Palo paloActual=palo[p];
            for (int j=2;j<=10;j++){
                this.cartas.add(new CartaNumerales(paloActual,j));
            }
        }
    }
    private void generarCartasFiguras(){

        char[] letras={'A','J','Q','K'};
        Palo[] palo=Palo.values();
        for (int l=0;l<letras.length;l++){
            char letraActual=letras[l];
            for (int p=0;p<palo.length;p++){
                Palo paloActual=palo[p];
                this.cartas.add(new CartaFiguras(paloActual,letraActual));
            }
        }
    }
    private void genararCartasJoker(){
        this.cartas.add(new CartaJoker(true));
        this.cartas.add(new CartaJoker(false));

    }
    public void mostrarBaraja(){
        for (Carta carta:cartas){
            carta.darVuelta();
            carta.mostrar();
        }
    }

}
