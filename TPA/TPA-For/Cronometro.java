/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tpa.gilmar1.cronometro;
import java.util.Scanner;

/**
 *
 * @author Renato Silva
 */
public class Cronometro {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite até qual número o cronômetro deve ir: ");
            int limite = scanner.nextInt();

            System.out.println("Cronômetro:");
            for (int i = 0; i <= limite; i++) {
                System.out.println(i + " segundos");
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro, digite um valor inválido e tente novamente!");
        } finally {
            scanner.close();
            System.out.println("Programa finalizado com sucesso, obrigado por utilziar nosso código!");
        }
    }
}
