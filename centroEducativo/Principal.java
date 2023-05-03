package centroEducativo;

public class Principal {
    public static void main(String[] args) {
        CentroEducativo c=new CentroEducativo();
        Alumno pepe=new Alumno("123","Fulano","Pepe");
        Alumno Maria=new Alumno("124","Maria","Mengano");
        Alumno luis=new Alumno("125","Luis","Sultano");

        pepe.agregarExamen(new ExamenEscrito("00/00/00",40,7));
        pepe.agregarExamen(new ExamenOral("00/00/00",NivelSatisfacción.SUFICIENTE));

        Maria.agregarExamen(new ExamenEscrito("00/00/00",60,6));
        Maria.agregarExamen(new ExamenEscrito("00/00/00",65,8));
        Maria.agregarExamen(new ExamenOral("00/00/00",NivelSatisfacción.EXCELENTE));

        luis.agregarExamen(new ExamenEscrito("00/00/00",100,9));
        luis.agregarExamen(new ExamenOral("00/00/00",NivelSatisfacción.INSUFICIENTE));
        luis.agregarExamen(new ExamenOral("00/00/00",NivelSatisfacción.EXCELENTE));

        c.agregarAlumnos(pepe);
        c.agregarAlumnos(Maria);
        c.agregarAlumnos(luis);



        System.out.println("Cantidad de aprobados "+c.cantAprobados());



    }
}
