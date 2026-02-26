/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifelsetpa;

import javax.swing.*;


/**
 *
 * @author FATEC ZONA LESTE
 */
public class IfElseTPA {

    public static void main(String[] args) {
  
        // Pede os dois números ao usuário
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");

        // Converte os textos digitados para números inteiros
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        // Comparações individuais, cada uma com sua janela (popup/janela)

        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Os números são IGUAIS.");
        }

        if (num1 != num2) {
            JOptionPane.showMessageDialog(null, "Os números são DIFERENTES.");
        }

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "Número 1 é MAIOR que Número 2.");
        }

        if (num1 < num2) {
            JOptionPane.showMessageDialog(null, "Número 1 é MENOR que Número 2.");
        }

        if (num1 >= num2) {
            JOptionPane.showMessageDialog(null, "Número 1 é MAIOR ou IGUAL a Número 2.");
        }

        if (num1 <= num2) {
            JOptionPane.showMessageDialog(null, "Número 1 é MENOR ou IGUAL a Número 2.");
         }
        
    }
    
}
        
