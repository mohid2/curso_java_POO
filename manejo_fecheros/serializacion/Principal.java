package manejo_fecheros.serializacion;

import java.io.*;

public class Principal {
    public static void leer(){
        try {
            ObjectInputStream os=new ObjectInputStream(new FileInputStream("Objetos.txt"));
            try {
                Profesor p=(Profesor)os.readObject();
                System.out.println(p);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        Profesor p=new Profesor("Jose","Martin",25);
        try {
            ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("Objetos.txt"));
            os.writeObject(p);
            os.close();
        } catch (IOException e) {
            System.out.println("no se ha creado");
        }
        leer();
    }
}
