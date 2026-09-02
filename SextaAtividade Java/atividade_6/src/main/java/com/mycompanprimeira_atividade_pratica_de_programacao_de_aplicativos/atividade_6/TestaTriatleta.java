/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanprimeira_atividade_pratica_de_programacao_de_aplicativos.atividade_6;

/**
 *
 * @author Hery
 */
public class TestaTriatleta {
    public static void main(String[] args) {
        // Instancia um triatleta
        Triatleta atleta = new Triatleta("Hery");

        System.out.println("--- Começando o Treino de Triatlo ---");
        
        // Utiliza seus métodos
        atleta.nadar();
        atleta.pedalar();
        atleta.correr();
        
        System.out.println("--- Treino Concluído! ---");
    }
}
