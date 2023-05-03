package manejo_fecheros;

import java.io.FileWriter;
import java.io.IOException;

public class EacribirArrchivos {
    public static void main(String[] args) {

        String frase="\ntengo 30 años ";
        try {
            FileWriter fr=new FileWriter("C:\\Users\\MOHAMMED\\Desktop\\mohammed1.txt");
            fr.write("hola soy mohammed el yousfi");
            for (int i=0;i<frase.length();i++){
                fr.write(frase.charAt(i));
            }
            fr.close();

        } catch (IOException e) {
            System.out.println("no se ha podido ejecutar");
        }
    }
}
