import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        final int tam= 5;
        char[] gabaritoQuimica = {'a','c','d','b','b'};
        char[] respostas = new char[tam];
        int nota = 0;
        
        Scanner scan = new Scanner(System.in);

        respostas[0]='a';
        respostas[1]='b';
        respostas[2]='b';
        respostas[3]='b';
        respostas[4]='a';

        for(int i =0; i < tam; i++){
            System.out.printf("Informe a resposta: %d ", i);
            respostas[i]=scan.nextLine().charAt(0);

        }

        for(int i = 0; i<tam;i++){
            if (respostas[i]==gabaritoQuimica[i]) {
                nota++;
            }
        }

        System.out.printf("%n Nota do aluno : %d", nota);

     
       
        
    }
    
}
