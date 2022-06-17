/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc;


import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author joaot
 */
public class Imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getInstance(); 
        nf.setMaximumFractionDigits(3);
        System.out.print("Dgite o nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite a altura: ");
        double altura = entrada.nextDouble();
        System.out.print("Digite o peso: ");
        double peso = entrada.nextDouble();
        
        System.out.println("O nome é: "+ nome);
        double imc = peso / (altura*altura);
        System.out.printf("O IMC é %.2f \n ",imc);
        System.out.print("O IMC é  "+ nf.format(imc));
        
        if(imc < 18.25){
            System.out.println("Muito magro");
        }else if((imc >= 18.25) && (imc <= 24.9)){
            System.out.println("Nomal");
        }else if((imc >= 24.9)&&(imc<29.9)){
            System.out.println("Acima do peso");
        }
        
    } 
    
}
