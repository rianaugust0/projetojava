
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class media2 {

 
    public static void main(String[] args) throws IOException {
            Scanner scan = new Scanner(System.in);
            Locale.setDefault(Locale.US);
        
        
        double raio = scan.nextF();
        double pi = 3.14159;
        double area = pi * Math.pow(raio, 2);
        
        System.out.printf("A=%.4f%n", area);

 
 
    }
 
}


