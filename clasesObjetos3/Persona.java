package clasesObjetos3;

public class Persona {
    //atributos
    String nombre;
    int edad;
    //metodos
    //metodo cunstructor
    public  Persona(String nombre,int edad){
          this.nombre=nombre;
          this.edad=edad;

    }

    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
