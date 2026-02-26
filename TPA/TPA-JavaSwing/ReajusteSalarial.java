/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reajustesalarial;
import javax.swing.JOptionPane;

/**
 *
 * @author RENATO SILVA
 */
public class ReajusteSalarial {

    public static void main(String[] args) {
    // Lê o saldo atual
double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo:"));

// Aplica um reajuste de 1%
double reajustado = saldo * 1.01;

// Exibe o saldo com reajuste
JOptionPane.showMessageDialog(null, "Saldo com 1%: " + reajustado);

    }
}
