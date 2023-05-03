package ejerccioAccenture.cuentaBamcaria;

public class Cuenta {
    private String titularCta;
    private  String numeroCta;
    private double saldoCta;

    public Cuenta(){

    }
    public Cuenta(Cuenta c){
        this.titularCta=c.titularCta;
        this.numeroCta=c.numeroCta;
        this.saldoCta=c.saldoCta;
    }

    public Cuenta(String titularCta, String numeroCta, double saldoCta) {
        this.titularCta = titularCta;
        this.numeroCta = numeroCta;
        this.saldoCta = saldoCta;
    }

    public String getTitularCta() {
        return titularCta;
    }

    public String getNumeroCta() {
        return numeroCta;
    }

    public double getSaldoCta() {
        return saldoCta;
    }

    public void setTitularCta(String titularCta) {
        this.titularCta = titularCta;
    }

    public void setNumeroCta(String numeroCta) {
        this.numeroCta = numeroCta;
    }

    public void setSaldoCta(double saldoCta) {
        this.saldoCta = saldoCta;
    }
    public boolean ingreso(double cant){
        boolean monto=true;
        if(cant>0){
            saldoCta+=cant;
        }
        else{
            monto=false;
        }
        return monto;
    }
    public boolean reintegro(double cantidad){
        boolean retiro=false;
        if(comprobarSaldo(cantidad)){
            saldoCta-=cantidad;
            retiro=true;
        }
        return retiro;
    }
    private boolean comprobarSaldo(double cant){
        boolean saldoSuficiente=false;
        if(cant>0 && cant<=saldoCta){
            saldoSuficiente=true;
        }
        return saldoSuficiente;
    }
    public boolean transferencia(Cuenta ctaDestino, double cantidad){
        boolean trans=false;
        if (comprobarSaldo(cantidad)){
            this.saldoCta-=cantidad;
            if(ctaDestino.ingreso(cantidad))
            trans=true;
        }
        return trans;
    }

    @Override
    public String toString() {
        return  "Datos de la cuenta"+
                "\nNombre del titular: " + titularCta +
                "\nNúmero de cuenta: " + numeroCta +
                "\nSaldo: " + saldoCta ;
    }
}
