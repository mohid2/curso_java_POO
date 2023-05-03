package ejerccioAccenture.cuentaBamcaria;

public class Principal {
    public static void main(String[] args) {
        Cuenta cuenta=new Cuenta();
        cuenta.setTitularCta("Federico Garcia");
        cuenta.setNumeroCta("01012020030340400505");
        cuenta.setSaldoCta(2890.0);
        boolean c=cuenta.ingreso(100);
        if(c){
            System.out.println(cuenta);
        }else {
            System.out.println("“No se ha podido realizar la operación”");
        }
        Cuenta cuenta1=new Cuenta(cuenta);

        boolean c1=cuenta.transferencia(cuenta1,1000);
        if(c1){
            System.out.println(cuenta);
            System.out.println(cuenta1);
        }else {
            System.out.println("“No se ha podido realizar la operación”");
        }


    }
}
