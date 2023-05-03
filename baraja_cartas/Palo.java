package baraja_cartas;

public enum Palo {
    PICA(Color.NEGRO),CORAZON(Color.ROJO),DIAMANTE(Color.ROJO),TREBOL(Color.NEGRO);
    private Color color;

    Palo(Color color) {
        this.color=color;

    }

    public Color getColor() {
        return color;
    }

}
