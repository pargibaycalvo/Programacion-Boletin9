
package boletin9word;

import java.util.Scanner;

public class Boletin9word {
    public static void main(String[] args){
        
        Scanner neme = new Scanner (System.in);
        int numeros [] = new int [10];
        int neg=0;
        int pos=0;
        int cero=0;
        
        for (int i=0; i<10; i++){
            
            System.out.println("Introduce el numero");
            numeros [i] = neme.nextInt();
            
         if(numeros [i]<0){
             neg++;
         }
         if (numeros [i]>0){
             pos++;
         }
         if(numeros [i]==0){
             cero++;
         }
        
         }
        
        System.out.println("Numero negativos : " +neg);
        System.out.println("Numero positivos : " +pos);
        System.out.println("Los ceros son : " +cero);
        }
    }



    

