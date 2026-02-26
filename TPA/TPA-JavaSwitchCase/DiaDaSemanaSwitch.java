/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diadasemanaswitch;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class DiaDaSemanaSwitch {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número de 1 a 7 e descubra em que dia da semana estamos: ");
            int resposta = scanner.nextInt();
            
            switch (resposta) {
                case 1 -> System.out.println("Estamos em um domingo");
                case 2 -> System.out.println("Estamos em uma segunda-feira");
                case 3 -> System.out.println("Estamos em uma terça-feira");
                case 4 -> System.out.println("Estamos em uma quarta-feira");
                case 5 -> System.out.println("Estamos em uma quinta-feira");
                case 6 -> System.out.println("Estamos em um sexta-feira");
                case 7 -> System.out.println("Estamos em um sábado");
                default -> System.out.println("Valor inválido, o dia não foi encontrado! Digite de 1 a 7.");
                //Fim do Exercício 3 - Dia da Semana (Java Switch Case Expressivo)
    }
}
    }
}
