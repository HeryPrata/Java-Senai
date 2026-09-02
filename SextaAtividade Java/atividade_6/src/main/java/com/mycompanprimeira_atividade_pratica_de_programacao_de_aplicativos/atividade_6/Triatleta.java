/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompanprimeira_atividade_pratica_de_programacao_de_aplicativos.atividade_6;

/**
 *
 * @author Hery
 */
public class Triatleta extends Pessoa implements Nadador, Corredor, Ciclista{
    public Triatleta(String nome) {
        super(nome);
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo.");
    }

    @Override
    public void pedalar() {
        System.out.println(getNome() + " está pedalando.");
    }
}
