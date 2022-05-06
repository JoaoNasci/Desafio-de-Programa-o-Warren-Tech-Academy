/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cotagem;

/**
 *
 * @author joaot
 */
public class SomaReversa {
    public static void main(String[] args) {
        //int n[] = new int[5];
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
           // 
           if (r % 2 == 0 ){
                
                
            }else{
                System.out.println("A soma entre "+(n[c]=c)+" "+i+" é igual "+r); 
            } 
            
        }
        
        
        
        
    }
    
    
}
