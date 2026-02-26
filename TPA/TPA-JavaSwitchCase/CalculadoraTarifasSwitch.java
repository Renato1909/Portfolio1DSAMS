/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.expressivo.calculadoratarifasswitch;
import java.util.Scanner;

/**
 *
 * @author Renato Aparecido da Silva - 1° MTec DS/AMS
 */
public class CalculadoraTarifasSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try  {
            System.out.println("Escolha o tipo de transporte:");
            System.out.println("1 - Ônibus urbano");
            System.out.println("2 - Metrô");
            System.out.println("3 - Trem intermunicipal");
            System.out.println("4 - Ônibus rodoviário");
            int opcao = sc.nextInt();

            System.out.print("Digite a quantidade de bilhetes: ");
            int quantidade = sc.nextInt();

            double total = switch (opcao) {
                case 1 -> quantidade * 4.40;
                case 2 -> quantidade * 5.00;
                case 3 -> quantidade * 6.50;
                case 4 -> quantidade * 12.00;
                default -> -1;
            };

            if (total == -1) {
                System.out.println("Opção inválida!");
            } else {
                System.out.println("Valor total da compra: R$ " + total);
            }

        } catch (Exception e) {
            System.out.println("Erro de entrada: Valor inválido! Obrigado por usar nosso código! ");
         } finally {
     sc.close();
            System.out.println("Código finalizado!");
        } 
    }
}