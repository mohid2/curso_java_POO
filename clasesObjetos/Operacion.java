package clasesObjetos;
import javax.swing.JOptionPane;
public class Operacion {
    //atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int dividion;
    //metodos
    public void leerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
    }
    public void suma(){
        suma=numero1+numero2;
    }
    public void resta(){
        resta=numero1-numero2;
    }
    public void multiplicacion(){
        multiplicacion=numero1*numero2;
    }
    public void Dividion(){
        dividion=numero1/numero2;
    }
    public void mostrarResultados(){
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+multiplicacion);
        System.out.println("la dividion es: "+dividion);
    }
}
