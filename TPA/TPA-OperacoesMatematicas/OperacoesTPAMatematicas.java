/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.operacoestpa.renato;

/**
 *
 * @author RENATO
 */
public class OperacoesTPAMatematicas {

    public static void main(String[] args) {
        // Definição de dois números
        double num1 = 15;
        double num2 = 10;
        double L = 6;
        double B = 7;
       double H = 8;
       double D = 20;
       double d = 12;
       double Pi = 3.14;
       double r = 2;
       
        // Realizando operações matemáticas
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? num1 / num2 : Double.NaN; // Evita divisão por zero
        double resto = num1 % num2; // Resto
        double quadrado = L * L; // Cálculo da área do quadrado
        double retângulo = B * H; // Cálculo da área do retângulo
        double losango = D * d / 2; // Cálculo da área do losango
        double triângulo = B * H / 2; // Cálculo da área do triângulo
        double circunferência = Pi * (r * r); // Cálculo da área circunferência
        double média = num1 + num2 / 2; // Cálculo da média entre 2 números

        // Exibindo os resultados
        System.out.println("Resultados das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (num2 != 0 ? divisao : "Indefinida (divisão por zero)"));
        System.out.println("Resto da divisão: " + resto);
         System.out.println("Área do quadrado: " + quadrado);
        System.out.println("Área do retângulo: " + retângulo);
        System.out.println("Área do losango: " + losango);
         System.out.println("Área da circunferência: " + circunferência);
         System.out.println("Área do triângulo: " + triângulo);
         System.out.println("Média: " + média);
         
    }
}
