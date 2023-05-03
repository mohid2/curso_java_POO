package manejo_fecheros;

import java.io.*;
public class CrearArchivosBinario {
    public static void main(String[] args) {
        int con=0;
        int []array=new int[144819];
        try {
            FileInputStream fis=new FileInputStream("C:\\Users\\MOHAMMED\\Desktop\\foto.jpeg");
            int v=fis.read();
            while (v!=-1){
                v=fis.read();
                if(v!=-1){
                    array[con]=v;
                }
                con++;
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("no se ha encontrado");
        }
        crear_Archivo(array);
    }
    static void crear_Archivo(int fechero[]){
        try {
            FileOutputStream crear=new FileOutputStream("C:\\Users\\MOHAMMED\\Desktop\\foto1.jpeg");
            for (int i=0;i<fechero.length;i++){
                crear.write(fechero[i]);
                System.out.println(fechero[i]);
            }
            crear.close();
        }catch (IOException e){
            System.out.println("no se ha podido crear el archivo");

        }

    }
}
