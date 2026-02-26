/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tpa.gilmar1.tabuada;
import java.util.Scanner;
/**
 *
 * @author Renato Silva
 */
public class Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número para ver sua tabuada: ");
            int numero = scanner.nextInt();

            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro, digite um valor válido!");
        } finally {
            scanner.close();
            System.out.println("Programa finalizado com sucesso, obrigado por utilizar nosso código!.");
        }
    }
}
