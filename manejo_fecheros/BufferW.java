package manejo_fecheros;

import java.io.*;

public class BufferW {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\MOHAMMED\\Desktop\\mohammed1.txt");
            BufferedReader bfr=new BufferedReader(fr);
            String buffer=bfr.readLine();
            while (buffer!=null){
                System.out.println(buffer);
                buffer=bfr.readLine();
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("jjgjg");

        }

    }
}
