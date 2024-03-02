import java.util.Scanner;

public class exerciciocondicional {

    public static void main(String[] args) {
        	Scanner scan = new Scanner(System.in);


            System.out.println("Quero que você digite um nota abaixo, pode ser?");
            int nota1 = scan.nextInt();
            int media = 7;
            int media2 = 5;

            

            if (nota1 >= media) {
                System.out.println("Passou direto");
                
            } else if (nota1 > media2 && nota1 < media) {
                System.out.println("Tem direito de fazer uma prova de recuperação");
            } else {
                System.out.println("Reprovado direto");
            }
    }
    
}
