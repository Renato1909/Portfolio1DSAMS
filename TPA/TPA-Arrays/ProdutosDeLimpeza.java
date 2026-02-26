/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tpa.gilmar1.produtosdelimpeza;
import java.util.Scanner;

/**
 *
 * @author Renato Silva
 */
public class ProdutosDeLimpeza {

    public static void main(String[] args) {
        double[] precos = {5.00, 3.50, 2.00, 7.80};
        double total = 0;

        System.out.println("Preços dos produtos de limpeza:");

        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Produto %d: R$ %.2f\n", (i + 1), precos[i]);
            total += precos[i];
        }

        System.out.printf("\nValor total da compra: R$ %.2f\n", total);
    }
}
