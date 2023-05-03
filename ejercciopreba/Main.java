package ejercciopreba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String nombreCliente,numeroCuenta;
        double tipoInteres,saldo;
        Cuenta cuenta1=new Cuenta();

        System.out.print("Nombre: ");
        nombreCliente=entrada.nextLine();
        System.out.print("Numero cuenta: ");
        numeroCuenta=entrada.nextLine();
        System.out.print("Tipo de interes: ");
        tipoInteres=entrada.nextDouble();
        System.out.print("Saldo: ");
        saldo=entrada.nextDouble();
        cuenta1.setNombreCliente(nombreCliente);
        cuenta1.setNumeroCuenta(numeroCuenta);
        cuenta1.setTipoInteres(tipoInteres);
        cuenta1.setSaldo(saldo);

        Cuenta cuenta2=new Cuenta("sofia","1245673",0.5,300);

        Cuenta cuenta3=new Cuenta(cuenta2);
        
    }
}
