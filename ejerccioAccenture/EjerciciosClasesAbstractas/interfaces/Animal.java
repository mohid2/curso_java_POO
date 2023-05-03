package ejerccioAccenture.EjerciciosClasesAbstractas.interfaces;

public class Animal implements Comportamientos {
    private String especie;
    private String tipoAlimentacion;

    public String getEspecie() {
        return especie;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    @Override
    public void respirar() {
        System.out.println(especie+"está respirando");
    }

    @Override
    public void dormir() {
        System.out.println(especie+"está durmiendo");

    }

    @Override
    public void comer() {
        if(tipoAlimentacion.equalsIgnoreCase("carnívoro")){
            System.out.println("Los animales carnívoros son aquellos que se alimentan fundamentalmente de materia animal");
        }
        else if (tipoAlimentacion.equalsIgnoreCase("herbívoro")){
            System.out.println("Los animales herbívoros se alimentan fundamentalmente de materia vegetal");
        }
        else if (tipoAlimentacion.equalsIgnoreCase("omnívoro")){
            System.out.println("Los animales omnívoros son aquellos que se alimentan tanto de materia animal como de materia vegetal");
        }

    }
}
