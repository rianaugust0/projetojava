import java.util.Scanner;

public class cursoDev {
    public static void main(String[] args) {
        // scanner permite fazer a leitura do teclado e passar esse dado para dentro de uma varint
         Scanner scan= new Scanner(System.in);
         int ipvaPassat =0;
         int ipvaFusca =0;
         int ipvaAmarok =0;
         int ipvaAudi =0;
         int media = (ipvaPassat+ipvaFusca+ipvaAmarok+ipvaAudi)/3;
         int total = ipvaPassat+ipvaFusca+ipvaAmarok+ipvaAudi;


         


         System.out.println("Digite o ipva do passat");
         ipvaPassat=scan.nextInt();
         System.out.println("Digite o ipva do fusca");
         ipvaFusca=scan.nextInt();
         System.out.println("Digite o ivpa da amarok");
         ipvaAmarok=scan.nextInt();
         System.out.println("Digite o ipva do audi");
         ipvaAudi=scan.nextInt();
         if (ipvaPassat >= media) {
            System.out.println("Carro executivo é?");
         } else if (ipvaFusca <= media) {
            System.out.println("Esse ta no precinho");
            
         } else if (ipvaAmarok >= media) {
            System.out.println("Que roubo, irmão!");

         } else if (ipvaAudi >= media) {
            System.out.println("Salgado");
         }

         System.out.printf("Os carros com ipva %s %s %s %s, tem uma media de ipva de %d e ficaram com o ipva total de %d", ipvaPassat, ipvaFusca, ipvaAmarok, ipvaAudi, media, total);
         
    }
}
