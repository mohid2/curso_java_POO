package ejerccio7;

public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    Cuenta  cuenta[];

    public Cliente(String nombre, String apellido, String DNI, Cuenta[] cuenta){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDNI() {
        return DNI;
    }
    public double cunsultarSaldo(int n){
        return cuenta[n].getSaldo();
    }
    public void ingresar_dinero(int n,double cantidad){
        cuenta[n].ingresarDinero(cantidad);
    }
    public void retirar_dinero(int n, double cantidad){
        cuenta[n].retirarDinero(cantidad);
    }
}
