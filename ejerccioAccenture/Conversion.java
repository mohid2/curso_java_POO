package ejerccioAccenture;

public class Conversion {
    public static void main(String[] args) {
        double numDouble = 2145.56;
        char caracter = 'H';
        int a=convertirAEntero(numDouble);
        int b=calcularComision(caracter);
        System.out.println("El numero doble 2145.56 en entero es: "+a);
        System.out.println("El caracter H en entero es: "+b);
    }
    public static int convertirAEntero(double numero){
        return (int) numero;

    }
    public static int calcularComision(char numero){
        return (int)numero;
    }
}
