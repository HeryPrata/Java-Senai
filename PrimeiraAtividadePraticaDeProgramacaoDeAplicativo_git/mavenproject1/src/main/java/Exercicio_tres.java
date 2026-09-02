/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hery
 */
public class Exercicio_tres {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int qtd = 0;
        int soma = 0;

        do {
            System.out.print("Digite um numero: ");
            numero = scan.nextInt();

            if (numero >= 0) {
                soma += numero;
                qtd++;
            }

        } while (numero >= 0);

        if (qtd > 0) {
            double media = (double) soma / qtd;

            System.out.println("Quantidade de numeros: " + qtd);
            System.out.println("Media: " + media);
        } else {
            System.out.println("Nenhum numero valido foi digitado.");
        }

    }
}
    

