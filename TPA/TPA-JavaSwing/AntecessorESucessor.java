/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.antecessoresucessor;
import javax.swing.JOptionPane;
/**
 *
 * @author RENATO SILVA
 */
public class AntecessorESucessor {

    public static void main(String[] args) {
        // Lê um número inteiro
int num = Integer.parseInt(JOptionPane.showInputDialog("Número inteiro:"));

// Exibe o antecessor e o sucessor
JOptionPane.showMessageDialog(null, "Antecessor: " + (num - 1) + ", Sucessor: " + (num + 1));

    }
}
