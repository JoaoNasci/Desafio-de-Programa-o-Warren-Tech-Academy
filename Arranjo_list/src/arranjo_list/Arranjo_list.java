/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arranjo_list;

import java.util.ArrayList;

/**
 *
 * @author joaot
 */
public class Arranjo_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Amarelo");
        lista.add("Azul");
        lista.add("Branco");
        lista.add("Preto");
        lista.add("Marron");
        lista.add("Vermelho");
        System.out.println();
        
        System.out.println(lista.toString());
        System.out.println("Tamanho do Array: "+ lista.size());
        System.out.println("Índice[2]"+ lista.get(2));
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
    }
        lista.add("Verde");
            System.out.println("============================");
            System.out.println("Tamanho do Array: "+ lista.size());
                for(int i = 0; i < lista.size(); i++){
                        System.out.println(lista.get(i));
                }
                lista.remove(4);
                System.out.println("===========================");
                for(int i = 0; i< lista.size(); i++){
                    System.out.println(lista.get(i));
                }
        
    }
    
}
