/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.expressivo.faixaetariaswitch;
import java.util.Scanner;
/**
 *
 * @author Renato Silva
 */
public class FaixaEtariaSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();

            int faixa;
            if (idade >= 0 && idade <= 12) {
                faixa = 1;
            } else if (idade >= 13 && idade <= 17) {
                faixa = 2;
            } else if (idade >= 18 && idade <= 59) {
                faixa = 3;
            } else if (idade >= 60) {
                faixa = 4;
            } else {
                faixa = -1;
            }

            switch (faixa) {
                case 1 -> System.out.println("Você é uma criança.");
                case 2 -> System.out.println("Você é um adolescente.");
                case 3 -> System.out.println("Você é um adulto.");
                case 4 -> System.out.println("Você é um idoso.");
                default -> System.out.println("Idade inválida!");
            }

        } catch (Exception e) {
            System.out.println("Erro, entrada inválida! Obrigado por usar nosso código!");
            } finally {
     sc.close();
            System.out.println("Código finalizado!");
        }
    }
}
