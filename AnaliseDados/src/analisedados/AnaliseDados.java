
package analisedados;
import javax.swing.JOptionPane;

public class AnaliseDados {

    public static void main(String[] args) {
        int valor, par = 0, impar = 0, acima = 0;
        float media,i = 0,total = 0; 
        do{
         valor = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>INFORME UM VALOR:<br>"
                 +"<em>(valor 0 interronpe)</em> </html>"));
        
         if (valor != 0){
             total = total + valor;
             i = i + 1;
             if (valor % 2 == 0){
                 par = par + 1;}
             else{
                 impar = impar + 1;}
         }
         if(valor >= 100){
             acima = acima + 1;}
         
         media = total / i;
         
        }while(valor != 0);
        
        JOptionPane.showMessageDialog(null,"<html>RESULTADO FINAL<br>"
                + "----------------------------------<br>"
                + "SOMATÓRIO VALE:" + total +"<br>" 
                + "TOTAL DE PARES: " + par + "<br>" 
                + "TOTAL DE IMPARES: " + impar + "<br>" 
                + "ACIMA DE 100: " + acima + "<br>"
                + "MÉDIA DOS VALORES: " + media 
                + "</thml>");
              
    }
    
    
    
}
