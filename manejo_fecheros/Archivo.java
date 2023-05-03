package manejo_fecheros;

import java.io.File;

public class Archivo {
    public static void main(String[] args) {
        File archivo = new File("out");
        String ruta= archivo.getAbsolutePath();
        System.out.println(ruta);
        System.out.println(archivo.exists());
    }
}
