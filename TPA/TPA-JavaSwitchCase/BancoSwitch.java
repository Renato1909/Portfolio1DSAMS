/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.expressivo.bancoswitch;
import java.util.Scanner;

/**
 *
 * @author Renato Aparecido da Silva - 1° MTec DS/AMS
 */
public class BancoSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.00;
          try {
       
            System.out.println("Menu de Atendimento:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar dinheiro");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Encerrar atendimento");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Seu saldo atual é: R$ " + saldo);

                case 2 -> {
                    System.out.print("Digite o valor do saque: ");
                    double saque = sc.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado. Novo saldo: R$ " + saldo);
                    }
                }

                case 3 -> {
                    System.out.print("Digite o valor do depósito: ");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado. Novo saldo: R$ " + saldo);
                }

                case 4 -> System.out.println("Atendimento encerrado.");

                default -> System.out.println("Opção inválida!");
            }

        } catch (Exception e) {
            System.out.println("O valor inserido é inválido! Obrigado por usar nosso código!");
      } finally {
     sc.close();
            System.out.println("Código finalizado.");
}
}
        }