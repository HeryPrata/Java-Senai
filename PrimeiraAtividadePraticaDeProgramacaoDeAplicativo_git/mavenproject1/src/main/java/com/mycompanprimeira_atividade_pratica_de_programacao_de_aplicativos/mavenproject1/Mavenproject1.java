/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompanprimeira_atividade_pratica_de_programacao_de_aplicativos.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author Hery
 */
public class Mavenproject1 {  
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        if (idade < 16) {
            System.out.println("Nao pode votar.");
        } else if ((idade >= 16 && idade <= 17) || idade > 65) {
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Voto obrigatorio.");
        }

    }
}

