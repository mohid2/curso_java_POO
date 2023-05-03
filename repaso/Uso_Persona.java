package repaso;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
    public static void main(String[] args) {
        Persona[] lasPersonas=new Persona[2];
        lasPersonas[0]=new Empleado2("Luis Conde",50000,2009,02,25);
        lasPersonas[1]=new Alumno("Ana Lopez","Bilógicas");

        for (Persona p:lasPersonas){
            System.out.println(p.dameNombre()+", "+p.dameDescripcion());
        }
    }
}
    abstract class Persona{
        private String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }

        public String dameNombre() {
            return nombre;
        }
        public abstract String dameDescripcion();
    }

    class Empleado2 extends Persona {

        private double sueldo;
        private Date fechaAlta;
        private  int Id;
        private static int contador=1;

        public Empleado2(String nombre, double sueldo, int dia, int mes, int anio) {
            super(nombre);
            this.Id=contador;
            contador++;
            this.sueldo = sueldo;
            GregorianCalendar calendar=new GregorianCalendar(anio,mes-1,dia);
            this.fechaAlta=calendar.getTime();
        }

        public Date damiFechaAlta() {
            return fechaAlta;
        }
        public double dameSueldo() {
            return sueldo;
        }

        public void subirSueldo(int a){
            double subida;
            subida=(double) a/100;
            subida=subida*sueldo;
            sueldo+=subida;
        }

        @Override
        public String dameDescripcion() {
            return "Este empleado tiene un Id= "+Id+" Con un sueldo= "+sueldo;
        }
    }
    class Alumno extends Persona{
        private String carrera;

        public Alumno(String nombre,String carrera) {
            super(nombre);
            this.carrera=carrera;
        }
        @Override
        public String dameDescripcion() {
            return "Este alumno esta estudiando la carreara de "+carrera;
        }
    }

