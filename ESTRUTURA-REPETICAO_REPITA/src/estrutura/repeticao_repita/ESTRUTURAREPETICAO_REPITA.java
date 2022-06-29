
package estrutura.repeticao_repita;

import java.util.Scanner;

public class ESTRUTURAREPETICAO_REPITA {

   
    public static void main(String[] args) {
                int a, valor,soma;
        soma = 0;
        String resposta;
        
        
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.print("DIGITE UM NÚMERO: ");
            valor = teclado.nextInt();
            soma = soma + valor;
            
            System.out.print("QUER CONTINUAR? [s/n]");
            resposta = teclado.next();
            
        }while(resposta.equals("s"));{
        
        System.out.printf("A SOMA DE TODOS VALORES É %d ",soma );
            
    
    }
        
    }
    
}
