/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contacorrente201;

/**
 *
 * @author joaot
 */
public class Poupanca {
  //  public String nome = "Jao";
    private double saldopoupanca;
    

public void DepositaPoupanca(double deposito){
   
    Corrente w = new Corrente();
    //String nome = w.nome;
   //double sal = w.saldo;
    
    if((deposito < w.saldo)||(deposito != 0)){
        w.saldo-= deposito;
        
        saldopoupanca += deposito;
        System.out.printf("Seu deposito foi de %s",deposito);
    }else{
        System.out.println("Valor incorreto!");
    }
        if(deposito > w.saldo ){
        System.out.println("Saldo insuficiente!!");
    }
    
   }

public void MostrarPoupanca(){
    System.out.println("Seu saldo na poupança e de "+saldopoupanca); 
    
}

    
    public double getSaldoPoupanca() {
        return saldopoupanca;
    }

 
    public void setSaldoPoupanca(double saldo) {
        this.saldopoupanca = saldo;
    }
    
    
    
}
