package ejerccio;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Converter s=new Converter();
        System.out.println(Converter.toBinary(x));
        System.out.print(s);

    }
}
