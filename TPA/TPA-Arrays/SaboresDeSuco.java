/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tpa.gilmar1.saboresdesuco;
import java.util.Scanner;

/**
 *
 * @author Renato Aparecido da Silva - 1° MTec DS/AMS
 */
public class SaboresDeSuco {

    public static void main(String[] args) {
         Scanner leia = new Scanner(System.in);
        String[] sabores = new String[3];

        System.out.println("Digite 3 sabores de suco que você gosta:");

        for (int i = 0; i < sabores.length; i++) {
            System.out.printf("Digite o sabor %d: ", (i + 1));
            sabores[i] = leia.nextLine();
        }

        System.out.println("\nSabores digitados:");
        for (int i = 0; i < sabores.length; i++) {
            System.out.printf("%d. %s\n", (i + 1), sabores[i]);
        }

        leia.close();
    }
}
