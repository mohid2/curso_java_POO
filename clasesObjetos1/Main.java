package clasesObjetos1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        Operacion op=new Operacion();
        op.suma(n1,n2);
        op.resta(n1,n2);
        op.multiplicacion(n1,n2);
        op.division(n1,n2);
        op.mostrarResultados();

    }
}
