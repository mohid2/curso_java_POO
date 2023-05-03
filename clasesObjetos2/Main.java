package clasesObjetos2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Operacion op=new Operacion();
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int suma= op.suma(n1,n2);
        int resta=op.resta(n1,n2);
        int multi= op.multiplicacion(n1,n2);
        int divi=op.division(n1,n2);
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+multi);
        System.out.println("la division es: "+divi);


    }
}
