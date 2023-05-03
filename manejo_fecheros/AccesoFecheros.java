package manejo_fecheros;
import java.io.*;
public class AccesoFecheros {
    public static void main(String[] args) {
        File ruta=new File("C:\\Users\\MOHAMMED\\Desktop\\ejerccios_java");
        System.out.println(ruta.getAbsolutePath());
        String[] rutas=ruta.list();
        String[] directorios=null;
        for (String r:rutas){
            System.out.println(r);
            File f=new File(ruta.getAbsolutePath(),r);
            if(f.isDirectory()){
                 directorios=f.list();
                System.out.println("directorios");
                System.out.println();
                for (String d:directorios){
                    System.out.println(d);
                }
            }
        }



    }
}
