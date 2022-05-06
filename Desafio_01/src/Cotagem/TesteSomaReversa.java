/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cotagem;

/**
 *
 * @author joaot
 */
public class TesteSomaReversa {
     static int reverso(int i, int t){
         
         for (int c=10;c<=1000; c++){
            int n[] = new int[1001];
            int p = n[c]+=c;
           //System.out.println(n[c]=c);
                i = 0;
             while (p > 0) { 
                  
                i *= 10; 
                i += (p % 10); 
                p/= 10; 
                
                //System.out.println("A soma é :"+w+"+"+i+(w+=i));
                     }       
        }
         
        return i;
        }
    public static void main(String[] args,  int w ) {
        int r,y;
        for (int c=10;c<=1000; c++){
            int n[] = new int[1001];
            int p = n[c]+=c;
           //System.out.println(n[c]=c);
            int i=0;
             while (p > 0) { 
                  
                i *= 10; 
                i += (p % 10); 
                p/= 10; 
                     } 
             r = ((n[c]+=c) + i);
            System.out.println("A soma entre "+(n[c]=c)+" "+i+" é igual "+r);
       
            
    }
    
    } 
}
