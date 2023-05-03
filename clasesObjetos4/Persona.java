package clasesObjetos4;

public class Persona {
    //atributos
   private String nombre;
   private int edad;
   private String dni;
    //metodos

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Persona( String dni) {
        this.dni = dni;
    }

    public void correr(){
        System.out.println("soy "+nombre+", tengo "+edad+" años y estoy corriedo una maraton");
    }
    public void correr(int km){
        System.out.println("he corredo  "+km+ " kilomtros");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
