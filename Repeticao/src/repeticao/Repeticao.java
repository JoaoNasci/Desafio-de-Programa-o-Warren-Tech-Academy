/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joaot
 */
public class Repeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        Scanner tecla = new Scanner(System.in);
        System.out.print("Digite o numero desejado: ");
        int a = tecla.nextInt();
        
        
        for (int i=0; i<10; i++){
            lista.add(i+1+" x "+ a +" = "+(i+1)*a);
            
        }
        for (int i=0; i>10;i++){
            System.out.println(lista.get(i));
        }
           
        System.out.println("** Tabuada **");
        for (String numero : lista){
            System.out.println(numero);
        }
        }
    }
    

