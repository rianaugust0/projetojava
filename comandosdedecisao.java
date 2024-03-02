public class comandosdedecisao {
    public static void main(String[] args) {


        /*
         == igual
         > maior
         < menor
         >= maior ou igual
         <= menor ou igual
         != diferente
         ! not (negação ou inversão)
         */

         /*

         E = exigente
         para ser verdaeiro todos tem que dar v, SE UM DER F, JÁ ERA


         Tabela verdade AND &&
          V V = V
          V F = F
          F V = F
          F F = F
          */

           /*

           CARA DE bOUa



         Tabela verdade OR &&
          V V = V
          V F = V
          F V = V
          F F = F
          */
         
         int nota = 7;
         int media = 6;


         String res;
         res=(nota >= media ? "Ok" : "Errado");
         System.out.println("Resultado: " + res);






         int motorizacao = 150;
         switch (motorizacao) {
            case 240:
            System.out.println("GOLF GTI");
               
               break;

            case 230:
            System.out.println("Jetta GLI");
                
                break;

            case 150:
            System.out.println("Polo GTS"); 
                  
                break;   
         
            default:
                   System.out.println("ESSE VALOR É ESTRANHO!");
               break;
         }
/* 
         if ((nota >= media) && (faltas <= maxfaltas)) {
            System.out.println("Passou, parabéns!");
         } else if (nota <= media) {
            System.out.println("Infelizmente não passou! tente novamente");
         } else if (faltas >= maxfaltas) {
            System.out.println("Você continua não passando!");
         } else {
            System.out.println("Você passou!");
            
         }
         */
    }
         
}

