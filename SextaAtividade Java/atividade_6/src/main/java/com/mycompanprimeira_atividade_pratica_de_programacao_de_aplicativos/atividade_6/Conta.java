/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanprimeira_atividade_pratica_de_programacao_de_aplicativos.atividade_6;

/**
 *
 * @author Hery
 */
public abstract class Conta {
    private int numero;
    protected double saldo;
    private Cliente cliente; // Associação com a classe Cliente

    public Conta(int numero, Cliente cliente, double saldo) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    // Método abstrato que será implementado obrigatoriamente pelas subclasses
    public abstract boolean sacar(double valor);

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
