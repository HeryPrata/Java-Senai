/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompanprimeira_atividade_pratica_de_programacao_de_aplicativos.atividade_solo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author Hery
 */
public class Atividade_solo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Conta> lista = new ArrayList<>();

        Conta c;

        int numeroConsulta, contadorNumeroConta = 0, opcao = 1;
        double valor;
        boolean resposta;

        while (opcao != 0) {

            System.out.println("\n*** SISTEMA BANCARIO ONLINE ***");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Saldo");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");

            opcao = scan.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("Tipo da conta:");
                    System.out.println("1 - Conta");
                    System.out.println("2 - Conta Especial");
                    System.out.println("3 - Conta Poupanca");

                    int tipo = scan.nextInt();

                    System.out.print("Nome do titular: ");
                    String nome = scan.next();

                    System.out.print("Saldo inicial: ");
                    double saldo = scan.nextDouble();

                    contadorNumeroConta++;

                    if (tipo == 1) {

                        c = new Conta(contadorNumeroConta, nome, saldo);

                    } else if (tipo == 2) {

                        System.out.print("Limite: ");
                        double limite = scan.nextDouble();

                        c = new ContaEspecial(contadorNumeroConta, nome, saldo, limite);

                    } else {

                        c = new ContaPoupanca(contadorNumeroConta, nome, saldo);

                    }

                    lista.add(c);

                    System.out.println("Conta criada com sucesso!");
                    System.out.println("Numero da conta: " + contadorNumeroConta);

                    break;

                case 2:

                    System.out.print("Numero da conta: ");
                    numeroConsulta = scan.nextInt();

                    boolean encontrou = false;

                    for (Conta conta : lista) {

                        if (conta.getNumero() == numeroConsulta) {

                            System.out.println("Titular: " + conta.getNome_titular());
                            System.out.println("Saldo: " + conta.getSaldo());
                            encontrou = true;
                            break;
                        }
                    }

                    if (!encontrou) {
                        System.out.println("Conta nao encontrada.");
                    }

                    break;

                case 3:

                    System.out.print("Numero da conta: ");
                    numeroConsulta = scan.nextInt();

                    encontrou = false;

                    for (Conta conta : lista) {

                        if (conta.getNumero() == numeroConsulta) {

                            System.out.print("Valor do saque: ");
                            valor = scan.nextDouble();

                            resposta = conta.sacar(valor);

                            if (resposta)
                                System.out.println("Saque realizado.");
                            else
                                System.out.println("Saldo insuficiente.");

                            encontrou = true;
                            break;
                        }
                    }

                    if (!encontrou) {
                        System.out.println("Conta nao encontrada.");
                    }

                    break;

                case 4:

                    System.out.print("Numero da conta: ");
                    numeroConsulta = scan.nextInt();

                    encontrou = false;

                    for (Conta conta : lista) {

                        if (conta.getNumero() == numeroConsulta) {

                            System.out.print("Valor do deposito: ");
                            valor = scan.nextDouble();

                            conta.depositar(valor);

                            System.out.println("Deposito realizado.");
                            System.out.println("Novo saldo: " + conta.getSaldo());

                            encontrou = true;
                            break;
                        }
                    }

                    if (!encontrou) {
                        System.out.println("Conta nao encontrada.");
                    }

                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }
        }

        scan.close();
    }
   
}

