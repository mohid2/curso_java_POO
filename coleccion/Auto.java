package coleccion;

public class Auto {
    private String matricula;
    private String color;
    private double Km;

    public Auto(String matricula, String color, double km) {
        this.matricula = matricula;
        this.color = color;
        Km = km;
    }


    public double getKm() {
        return Km;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "matricula='" + matricula + '\'' +
                ", color='" + color + '\'' +
                ", Km=" + Km +
                '}';
    }
}
