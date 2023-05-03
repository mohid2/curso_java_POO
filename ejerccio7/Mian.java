package ejerccio7;

import java.util.Scanner;

public class Mian {
    public static int buscarNumeroCenta(Cuenta cuentas[],int num){
        int indice=0;
        for (int i=0;i<cuentas.length;i++){
            if(num==cuentas[i].getNumeroCuenta()){
                indice=i;
                break;
            }
            else {
                indice=-1;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String nombre,apellido,DNI;
        int numeroCuenta,nCuentas,opcion,indice;
        double saldo;
        Cuenta cuentas[];
        Cliente cliente;
        System.out.println("Diga los datos del ciente");
        System.out.print("Nombre: ");
        nombre=entrada.nextLine();
        System.out.print("Apellido: ");
        apellido=entrada.nextLine();
        System.out.print("DNI: ");
        DNI=entrada.nextLine();
        System.out.print("Cuantas cuentas tienes: ");
        nCuentas=entrada.nextInt();

        cuentas=new Cuenta[nCuentas];
        for (int i=0;i<cuentas.length;i++){
            System.out.println("Diga los datos para la cuenta "+(i+1));
            System.out.print("Numero cuenta: ");
            numeroCuenta = entrada.nextInt();
            System.out.print("Saldo cuenta: ");
            saldo=entrada.nextDouble();

            cuentas[i]=new Cuenta(numeroCuenta,saldo);
        }
        cliente=new Cliente(nombre,apellido,DNI,cuentas);
        do {
            System.out.println("\t\n***Menu de operaciones***");
            System.out.println("1. Cunsultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            opcion=entrada.nextInt();
            switch (opcion){
                case 1:
                    for (int i=0;i<cuentas.length;i++){
                        System.out.println("Numero cuenta: "+cuentas[i].getNumeroCuenta());
                    }
                    System.out.println("Eligue un numero de cuenta ");
                    numeroCuenta=entrada.nextInt();
                    indice=buscarNumeroCenta(cuentas,numeroCuenta);
                    if(indice==-1) {
                        System.out.println("El numero de cuenta no existe");
                    }
                    else {
                        System.out.println("\nsaldo: " + cuentas[indice].getSaldo());
                    }

                    break;
                case 2:
                    for (int i=0;i<cuentas.length;i++){
                        System.out.println("Numero cuenta: "+cuentas[i].getNumeroCuenta());
                    }
                    System.out.println("Elige un numero de cuenta al que desea ingresar");
                    numeroCuenta=entrada.nextInt();
                    indice=buscarNumeroCenta(cuentas,numeroCuenta);
                    if(indice==-1) {
                        System.out.println("El numero de cuenta no existe");
                    }
                    else {
                        System.out.println("cantidad a ingresar");
                        saldo = entrada.nextDouble();
                        if(saldo<0){
                            System.out.println("operacion no puede ser realizada");
                        }
                        else {
                        cliente.ingresar_dinero(indice, saldo);
                        System.out.println("\nsaldo: " + cuentas[indice].getSaldo());
                        }

                    }
                    break;
                case 3:
                    for (int i=0;i<cuentas.length;i++){
                        System.out.println("Numero cuenta: "+cuentas[i].getNumeroCuenta());
                    }
                    System.out.println("Eligue un numero de cuenta ");
                    numeroCuenta=entrada.nextInt();
                    indice=buscarNumeroCenta(cuentas,numeroCuenta);
                    if(indice==-1) {
                        System.out.println("El numero de cuenta no existe");
                    }
                    else {
                        System.out.println("cantidad a retirar");
                        saldo = entrada.nextDouble();
                        if(saldo>cuentas[indice].getSaldo()){
                            System.out.println("El saldo  sufeciente");
                        }
                        else {
                        cliente.retirar_dinero(indice,saldo);
                        System.out.println("\nsaldo: " + cuentas[indice].getSaldo());
                        }

                    }
                    break;
            }
        }while (opcion!=4);

    }
}
