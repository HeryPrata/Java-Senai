/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Hery
 */
public class Exercicio_dois {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] notas = new double[10];
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scan.nextDouble();
            soma += notas[i];
        }

        double media = soma / 10;

        int acima = 0;
        int abaixo = 0;

        for (int i = 0; i < 10; i++) {
            if (notas[i] > media) {
                acima++;
            } else if (notas[i] < media) {
                abaixo++;
            }
        }

        System.out.println("Media: " + media);
        System.out.println("Notas acima da media: " + acima);
        System.out.println("Notas abaixo da media: " + abaixo);

    }
}

