/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hery.silva
 */import java.util.Scanner;
public class Terceira_att {
    public static void main (String[] args){
      Scanner scan = new Scanner (System.in);
      int quantidade = 0;
      double valor = 0, soma = 0, media = 0;
      
        do{
        System.out.print("Digite um valor maior ou igual a zero para");
        valor = scan.nextDouble();
        soma += valor;
        quantidade++;
        media = soma/quantidade;
    
        } while (valor >= 0);
        
        System.out.print("A quantidade total de valores digitados e: " + quantidade);
        System.out.println("A media dos valores e: " + media);
 
        
        
    }
    
}
   
        
            
            
        
        
   
    
    
  