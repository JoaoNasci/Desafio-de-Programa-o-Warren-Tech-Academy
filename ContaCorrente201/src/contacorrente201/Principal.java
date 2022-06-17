/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contacorrente201;

import java.util.Scanner;

public class Principal {

    
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        Corrente c = new Corrente();
        Poupanca p = new Poupanca();
       
         //boolean no = false;
         //boolean yes = true; 
        int op;
       try{ 
          
           c.MostrarSaldo();
           System.out.println("1 - Deposito: ");
           System.out.println("2 -    Sacar: ");
           System.out.println("3 - Poupança: ");
           System.out.println("4 -     Sair: ");
                   
           int o = t.nextInt();
           op =o;
           
           
               System.out.print("Digite o valor do deposito: ");
                double d = t.nextDouble();
                c.Deposito(d);
      
    
               System.out.print("Digite o valor a sacar: ");
                double s = t.nextDouble();
                c.SacarValor(s);
               
        
               System.out.print("Colocar um valor na Poupança? ");
                 double f = t.nextDouble();
                 p.DepositaPoupanca(f);
                System.out.println("");    
                 p.MostrarPoupanca();
                
           
        
        
        
                 c.MostrarSaldo();
       
       // c.Deposito(d);
       // c.SacarValor(s);
        
        
       
               }catch (Exception el){
                   System.out.println("Erro na "+el.toString());
               }
    }
    
}
