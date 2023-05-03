package coleccion1;

public class Auto1 {
    private String matricula;
    private String color;
    private double Km;

    public Auto1(String matricula, String color, double km) {
        this.matricula = matricula;
        this.color = color;
        Km = km;
    }


    public double getKm() {
        return Km;
    }

    public String getMatricula() {
        return matricula;
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
