package ejercciopreba;

public class Cuenta {
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    public Cuenta(Cuenta C) {
        this.nombreCliente =C.nombreCliente;
        this.numeroCuenta = C.numeroCuenta;
        this.tipoInteres =C.tipoInteres;
        this.saldo = C.saldo;
    }

    public Cuenta() {
    }

    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }


    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private boolean comprobarSaldo(double cantidad) {
        boolean sepuede;
        if (cantidad > saldo) {
            sepuede = false;
        } else {
            sepuede = true;
        }
        return sepuede;

    }

    public boolean ingresarDinero(double cantidad) {
        boolean sepuede;
        if (cantidad > 0) {
            saldo += cantidad;
            sepuede = true;
        } else {
            saldo = saldo;
            sepuede = false;
        }
        return sepuede;
    }

    public boolean retirarDinero(double cantidad) {
        boolean sepuede;
        if (comprobarSaldo(cantidad) == false || cantidad < 0) {
            sepuede = false;
        } else {
            saldo -= cantidad;
            sepuede = true;
        }
        return sepuede;
    }

   /* public void transferencia(Cuenta1 C, double cantidad) {
        Cuenta1 m=new Cuenta1();
        C.setSaldo(C.getSaldo()-cantidad)=m.setSaldo(cantidad);
    }*/

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", tipoInteres=" + tipoInteres +
                ", saldo=" + saldo +
                '}';
    }

}
