/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tpa.gilmar1.meias;

/**
 *
 * @author Renato Silva
 */
public class Meias {

    public static void main(String[] args) {
         int[] meias = {2, 4, 1, 3, 5};
        int total = 0;

        System.out.println("Quantidade de meias por gaveta:");

        for (int i = 0; i < meias.length; i++) {
            System.out.printf("Gaveta %d: %d meias\n", (i + 1), meias[i]);
            total += meias[i];
        }

        System.out.printf("\nTotal de meias: %d\n", total);
    }
}
