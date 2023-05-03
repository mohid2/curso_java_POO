package repaso;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empledado {
    public static void main(String[] args) {
        Jefatura jefe_RRHH=new Jefatura("Juan",55000,25,9,2006);
        jefe_RRHH.setIncentivo(2570);
        Empleado misEmpleado[]=new Empleado[6];
        misEmpleado[0]=new Empleado("Ana",30000,07,07,2000);
        misEmpleado[1]=new Empleado("Carlos",50000,15,06,1995);
        misEmpleado[2]=new Empleado("Paco",25000,25,9,2005);
        misEmpleado[3]=new Empleado("Antonio",47500,9,11,2009);
        misEmpleado[4]=jefe_RRHH;
        misEmpleado[5]=new Jefatura("Maria",95000,25,9,2006);
        Jefatura jefa_Finanzas=(Jefatura) misEmpleado[5];
        jefa_Finanzas.setIncentivo(55000);


       /* for(int i=0;i<misEmpleado.length;i++){
            misEmpleado[i].subirSueldo(5);
        }*/
        /*for (Empleado empleados:misEmpleado){
            empleados.subirSueldo(5);
        }*/
        Empleado aux;
        for (int i=0;i<misEmpleado.length-1;i++){
            for (int j=0;j<misEmpleado.length-1;j++){
            if(misEmpleado[j].dameSueldo()>misEmpleado[j+1].dameSueldo()){
                aux=misEmpleado[j];
                misEmpleado[j]=misEmpleado[j+1];
                misEmpleado[j+1]=aux;
            }}
        }

        for (Empleado empleados:misEmpleado) {
            System.out.println("nombre: "+empleados.getNombre()+" Sueldo: "+empleados.dameSueldo()+
                    " Id: "+empleados.getId()+" Fecha alta: " +empleados.getFechaAlta());
        }
    }}

    class Empleado implements Comparable {
        private String nombre;
        private double sueldo;
        private Date fechaAlta;
        private  int Id;
        private static int contador=1;

        public Empleado(String nombre, double sueldo, int dia, int mes, int anio) {
            this.Id=contador;
            contador++;
            this.nombre = nombre;
            this.sueldo = sueldo;
            GregorianCalendar calendar=new GregorianCalendar(anio,mes-1,dia);
            this.fechaAlta=calendar.getTime();
        }

        public Empleado(String nombre) {
            this(nombre,30000,01,1,2000);
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Date getFechaAlta() {
            return fechaAlta;
        }

        public int getId() {
            return Id;
        }

        public double dameSueldo() {
            return sueldo;
        }

        public void setSueldo(double sueldo) {
            this.sueldo = sueldo;
        }
        public void subirSueldo(int a){
            double subida;
            subida=(double) a/100;
            subida=subida*sueldo;
            sueldo+=subida;
        }

        @Override
        public String toString() {
            return
                    "nombre: " + nombre  +
                            "\nsueldo: " + sueldo +
                            "\nfechaAlta: " + fechaAlta+
                            "\nId: "+Id;
        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }
    class Jefatura extends Empleado {
        private double incentivo;


        public Jefatura(String nombre, double sueldo, int dia, int mes, int anio) {
            super(nombre, sueldo, dia, mes, anio);
        }

        public void setIncentivo(double incentivo) {
            this.incentivo = incentivo;
        }

        public double dameSueldo(){
            double sueldoJefe=super.dameSueldo();
            return incentivo+sueldoJefe;
        }


    }



