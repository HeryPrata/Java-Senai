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
    public ContaPoupanca(int numero, Cliente cliente, double saldo) {
        super(numero, cliente, saldo); // Repassa o Cliente correto para a superclasse
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            return false;
        }
        
        if (valor <= getSaldo()) {
            saldo -= valor;
            return true;
        }
        
        return false;
    }

    public void imprimirTipoConta() {
        System.out.println("Conta Poupanca");
    }

    public void reajustar(double percentual) {
        double reajuste = getSaldo() * (percentual / 100);
        depositar(reajuste);
    }
}
