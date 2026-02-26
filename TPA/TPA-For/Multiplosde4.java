/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tpa.gilmar1.multiplosde4;
import java.util.Scanner;

/**
 *
 * @author Renato Silva
 */
public class Multiplosde4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
   try {
            System.out.println("Números de 1 a 30 (pulando múltiplos de 4):");

            for (int i = 1; i <= 30; i++) {
                if (i % 4 == 0) {
                    continue;
                }
                System.out.println(i);
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro no código, tente novamente!");
        } finally {
            scanner.close();
            System.out.println("Programa finalizado com sucesso, obrigado por utilizar nosso código!");
        }
    }
}