/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contacorrente201;




public class Corrente {
    public String nome = "Joao";
    public double saldo = 1000.89;
    
   // public Corrente() {};
    
    public void MostrarSaldo(){
        System.out.printf("Saldo atual de %s é de %.2f \n",nome,saldo);
    }
    
    public void Deposito(double valor){
        if(valor > 0 ){
            saldo = saldo + valor;
            System.out.printf("Um valor de %.2f para o destinatario %s \n",valor,nome);
        }else{
            System.out.println("Valor incorreto!");
        } 
 
    }
public void SacarValor(double valor){
    
    double saldoantes = saldo;
    
    if (valor > 0){
    if(valor < saldo){
        if ((saldoantes - valor)>0){
                saldo = saldo - valor; 
            }else{
            System.out.println("Saldo insuficiente ");
            }
            }
    }else{
        System.out.println("Valor incorreto!!");
    }
}   
 
}
