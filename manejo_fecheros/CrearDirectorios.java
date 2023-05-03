package manejo_fecheros;

import java.io.*;

public class CrearDirectorios {
    public static void main(String[] args) {
        File ruta=new File("C:\\Users\\MOHAMMED\\Desktop\\BASE DE DATOS\\nuevo\\nuevo2.txt");
        boolean c;
        try {
            c=ruta.createNewFile();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedWriter b=new BufferedWriter(new FileWriter("C:\\Users\\MOHAMMED\\Desktop\\BASE DE DATOS\\nuevo\\nuevo2.txt"));
            b.write("hola a todo el mundo soy mohammed ");
            b.write("el segundo arrchivo ");
            b.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
