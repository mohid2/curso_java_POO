package ejerccioAccenture.EjerciciosClasesAbstractas.claseabstracta.ej2;

public class Restaurante {
    public static void main(String[] args) {
        Camarero camarero1=new Camarero();
        Camarero camarero2=new Camarero();
        camarero1.setNombre("Erik Rodriguez");
        camarero1.setPuesto("Camarero");
        camarero1.setSalario(1200);
        camarero1.setNumMesasAsignadas(5);
        camarero1.setHorasExtras(10);
        camarero2.setNombre("Luz Delgado");
        camarero2.setPuesto("Camarero");
        camarero2.setSalario(1200);
        camarero2.setNumMesasAsignadas(10);
        camarero2.setHorasExtras(10);
        Cocinero cocinero=new Cocinero();
        cocinero.setNombre("Alex Municio");
        cocinero.setPuesto("Cocinero");
        cocinero.setSalario(1500);
        cocinero.setHorasExtras(10);
        camarero1.indicarPuesto();
        System.out.println("Su salario es "+camarero1.calcularSalario());
        System.out.println();
        camarero2.indicarPuesto();
        System.out.println("Su salario es "+camarero2.calcularSalario());
        System.out.println();
        cocinero.indicarPuesto();
        System.out.println("Su salario es "+cocinero.calcularSalario());

    }
}
