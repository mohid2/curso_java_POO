package PLV;

public class TarjetaCredito {
    private String entidadBancaria;
    private String numero;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;

    public TarjetaCredito(String entidadBancaria, String numero, double saldo, EntidadFinanciera entidadFinanciera, Persona titular) {
        this.entidadBancaria = entidadBancaria;
        this.numero = numero;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }
    public boolean saldoDisponible(double monto){
        return this.saldo>=monto;
    }
    public void descontar(double monto){
        this.saldo-=monto;
    }
    public String datosdelTitular(){
       return titular.nomnreApellido();
    }



    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "entidadBancaria='" + entidadBancaria + '\'' +
                ", numero='" + numero + '\'' +
                ", saldo=" + saldo +
                ", entidadFinanciera=" + entidadFinanciera +
                ", titular=" + titular +
                '}';
    }
}