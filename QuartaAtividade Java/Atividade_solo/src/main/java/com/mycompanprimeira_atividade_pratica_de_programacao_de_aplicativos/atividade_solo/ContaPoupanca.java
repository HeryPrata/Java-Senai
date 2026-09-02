/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanprimeira_atividade_pratica_de_programacao_de_aplicativos.atividade_solo;

/**
 *
 * @author Hery
 */
public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, String nome_titular, double saldo) {
        super(numero, nome_titular, saldo);
    }

    public void imprimirTipoConta() {
        System.out.println("Conta Poupança");
    }

    public void reajustar(double percentual) {
        double reajuste = getSaldo() * (percentual / 100);
        depositar(reajuste);
    }
}
