/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hery.silva
 */import java.util.Scanner;
public class Segunda_Att {
    public static void main (String[] args){
    
        Scanner scan = new Scanner(System.in);
        double soma = 0, media;
        int notasAcima = 0, notasAbaixo = 0;
        
        double notasAluno[] = new double[10];
        
        for (int i = 0; i < notasAluno.length; i++) {
        System.out.println("Insira nota "+ (i + 1) + ": ");
        notasAluno[i] = scan.nextInt();
        soma += notasAluno[i];
        
        }
        
        media = soma / (notasAluno.length);
        
        for (int i = 0; i < notasAluno.length; i++){
            
            if (notasAluno[i] > media){
                notasAcima++;
            
            }
            
            if (notasAluno[i] < media){
                notasAbaixo++;
            }
    }
    
        System.out.println("Media:" + media);
        System.out.println("Soma:" + soma);
        System.out.println("Acima Da Media:" + notasAcima);
        System.out.println("Abaixo Da Media:" + notasAbaixo);
        
        
        
    
    
    
    
    
    
    }
    
}
