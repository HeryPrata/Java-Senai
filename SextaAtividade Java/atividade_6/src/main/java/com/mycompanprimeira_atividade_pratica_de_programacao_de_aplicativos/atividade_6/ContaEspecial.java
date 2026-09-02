/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanprimeira_atividade_pratica_de_programacao_de_aplicativos.atividade_6;

/**
 *
 * @author Hery
 */
public class ContaEspecial extends Conta{
    private double limite;

    public ContaEspecial(int numero, Cliente cliente, double saldo, double limite) {
        super(numero, cliente, saldo); // Repassa o Cliente correto para a superclasse
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= 0) {
            return false;
        }

        if (valor <= getSaldo() + limite) {
            saldo -= valor;
            return true;
        }

        return false;
    }

    public void imprimirTipoConta() {
        System.out.println("Conta Especial");
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
