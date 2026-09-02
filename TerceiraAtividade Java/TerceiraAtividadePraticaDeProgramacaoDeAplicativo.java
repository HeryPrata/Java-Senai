/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompanprimeira_atividade_pratica_de_programacao_de_aplicativos.terceiraatividadepraticadeprogramacaodeaplicativo;

/**
 *
 * @author Hery
 */
public class TerceiraAtividadePraticaDeProgramacaoDeAplicativo {
    public static void main(String[] args) {
        Conta c1 = new Conta(123, "Maria Silva", 500.0);
      
        Conta c2 = new Conta();
        c2.setNumero(456);
        c2.setTitular("João Santos");
        c2.setSaldo(1500.0);
        
        System.out.println("--- DADOS DA CONTA 1 ---");
        System.out.println("Número: " + c1.getNumero());
        System.out.println("Titular: " + c1.getTitular());
        System.out.println("Saldo: R$ " + c1.getSaldo());

        System.out.println("\n--- DADOS DA CONTA 2 ---");
        System.out.println("Número: " + c2.getNumero());
        System.out.println("Titular: " + c2.getTitular());
        System.out.println("Saldo: R$ " + c2.getSaldo());
    }
}
    

