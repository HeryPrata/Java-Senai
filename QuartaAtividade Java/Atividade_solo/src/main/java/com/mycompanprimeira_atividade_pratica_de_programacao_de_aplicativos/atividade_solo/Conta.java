/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanprimeira_atividade_pratica_de_programacao_de_aplicativos.atividade_solo;

/**
 *
 * @author Hery
 */
public class Conta {
    private int numero;
    private String nome_titular;
    protected double saldo;

    public Conta(int numero, String nome_titular, double saldo){
        this.numero = numero;
        this.nome_titular = nome_titular;
        this.saldo = saldo;
    }

    public Conta(int numero, String nome_titular){
        this.numero = numero;
        this.nome_titular = nome_titular;
        this.saldo = 0;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public boolean sacar(double valor){
        if(valor <= 0){
            return false;
        }

        if(saldo >= valor){
            saldo -= valor;
            return true;
        }

        return false;
    }

    public int getNumero(){
        return numero;
    }

    public String getNome_titular(){
        return nome_titular;
    }

    public void setNome_titular(String nome_titular){
        this.nome_titular = nome_titular;
    }

    public double getSaldo(){
        return saldo;
    }
}
