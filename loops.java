import java.util.Scanner;
public class loops {
    public static void main(String[] args) {

        //Utilizamos o loop for para quando soubermos quantas vezes pracisamos executa aquele comando
        
        /* 
        for(int cont = 0 ; cont < 5  ; cont++) {
            System.out.println("Rianzeira");
        }
        */


        /*While
         Enquanto a condição for satisfeita, o loop sera executado
         Utilizamos quando eu não tenho certeza da quantidade de vezes que eu vou precisar inteirar para utilizar os comandos
         */

         /* 
         Scanner scan = new Scanner(System.in);
         int cont = 0 ;
         int numeros = scan.nextInt();
         while(cont < numeros ) {
            System.out.println(cont + "Eu estou na Fatesg");
            cont++;
         }

         System.out.println("Finalzei por aqui");
         */


         /*O do while, primeiro ele faz e depois ele testa. */
         int cont = 0;
         do{
            System.out.println(cont + "- CFB Cursos");
            cont++;

         }while(cont <= 0);

    }
}
