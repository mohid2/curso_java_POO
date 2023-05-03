package manejo_fecheros;

import java.io.FileReader;
import java.io.IOException;

public class LeerArrchivos {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\MOHAMMED\\Desktop\\mohammed.txt");
            int v = fr.read();
            while (v != -1) {
                System.out.print((char) v);
                v = fr.read();
            }

        } catch (IOException e) {
            System.out.println("no esta el archivo");


        }

    }
}
