package ejerccio7;

public class Cuenta {
    private int numeroCuenta;
    private double saldo;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }


    public void ingresarDinero(double diposito){
        if (diposito>0){
         this.saldo+=diposito;
        }
    }

    public void retirarDinero(double retirada){
        if (retirada<this.saldo){
            this.saldo-=retirada;
        }
    }

}
