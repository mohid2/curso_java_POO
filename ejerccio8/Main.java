package ejerccio8;

import java.util.Scanner;

public class Main {
    public static int buscarNSucursal(Sucursal sucursales[],int num,int indiceS){
       int  indice=0;
       boolean encontado=false;
       for (int i=0;i<indiceS;i++){
           if(num==sucursales[i].getNumeroSucursal()){
               encontado=true;
               indice=i;
           }
       }
       if(encontado==false){
           indice=-1;
       }
       return indice;
    }
    public static int buscarNSucursal(Paquete paquete[],int num,int indiceS) {
        int indice = 0;
        boolean encontado = false;
        for (int i = 0; i < indiceS; i++) {
            if (num == paquete[i].getNumeroPaquete()) {
                encontado = true;
                indice = i;
            }
        }
        if (encontado == false) {
            indice = -1;
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numeroSucursal,numeroPaquete,prioridad,opcion, indiceS=0,indiceP=0,indice;
        String direccion,cuidad,dni;
        double peso,precioPaquete;
        Sucursal sucursales[]=new Sucursal[50];
        Paquete paquetes[]=new Paquete[100];
        do {
            System.out.println("\t\n***Menu***");
            System.out.println("1. Crear una nueva sucursal");
            System.out.println("2. Enviar paquete ");
            System.out.println("3. Cunsultar sucursal");
            System.out.println("4. Cunsultar paquete");
            System.out.println("5. Mostrar todas las sucursales");
            System.out.println("6. Mostrar todas las paquetes");
            System.out.println("7. Salir");
            opcion=entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("diga los datos de la sucursal");
                    System.out.print("Numero sucursal: ");
                    numeroSucursal=entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Direccion:" );
                    direccion=entrada.nextLine();
                    System.out.print("Cuidad: ");
                    cuidad=entrada.nextLine();
                    sucursales[indiceS]=new Sucursal(numeroSucursal,direccion,cuidad);
                    indiceS++;
                    break;
                case 2:
                    System.out.println("Diga el numero de sucursal ");
                    numeroSucursal=entrada.nextInt();
                    indice=buscarNSucursal(sucursales,numeroSucursal,indiceS);
                    if(indice==-1){
                        System.out.println("La sucursal no existe");
                    }
                    else {
                    System.out.println("Diga los datos del paquete ");
                    System.out.print("Numero del paquete: ");
                    numeroPaquete=entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("DNI: ");
                    dni=entrada.nextLine();
                    System.out.print("Peso paquete: ");
                    peso=entrada.nextDouble();
                    System.out.println("Elige la  prioridad 0. normal, 1. alta, 2. expres ");
                    prioridad=entrada.nextInt();
                    paquetes[indiceP]=new Paquete(numeroPaquete,dni,peso,prioridad);
                    precioPaquete=sucursales[indice].calcularPrecioPaquete(paquetes[indiceP]);
                    System.out.println("El precio del envio del paquete es: "+precioPaquete);
                    indiceP++;
                    }
                    break;
                case 3:
                    System.out.println("Diga el numero de sucursal");
                    numeroSucursal=entrada.nextInt();
                    indice=buscarNSucursal(sucursales,numeroSucursal,indiceS);
                    if(indice==-1){
                        System.out.println("La sucursal no existe");
                    }
                    else {
                        String mostarar = sucursales[indice].moatrarDatos();
                        System.out.println(mostarar);
                    }
                    break;
                case 4:
                    System.out.println("Diga el numero de paquete");
                    numeroPaquete=entrada.nextInt();
                    indice=buscarNSucursal(paquetes,numeroPaquete,indiceP);
                    if(indice==-1){
                        System.out.println("El paquete no existe");
                    }
                    else {
                        String mostarar = paquetes[indice].mostrarDatos();
                        System.out.println(mostarar);
                    }
                    break;
                case 5:

                    for (int i=0;i<indiceS;i++){
                        System.out.println("\nLos datos de la sucursal "+(i+1));
                        System.out.println(sucursales[i].moatrarDatos());
                    }
                    break;
                case 6:
                    for (int i=0;i<indiceP;i++){
                        System.out.println("\nLos datos del paquete "+(i+1));
                        System.out.println(paquetes[i].mostrarDatos());
                    }
                    break;
                case 7:
                    break;
            }
        }while (opcion!=7);




    }
}
