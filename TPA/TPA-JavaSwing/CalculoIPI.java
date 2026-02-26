/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculoipi;
import javax.swing.JOptionPane;

/**
 *
 * @author RENATO SILVA
 */
public class CalculoIPI {

    public static void main(String[] args) {
        // Lê a porcentagem do IPI
double ipi = Double.parseDouble(JOptionPane.showInputDialog("IPI (%):"));

// Lê o valor e quantidade da peça 1
double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Valor peça 1:"));
int qtd1 = Integer.parseInt(JOptionPane.showInputDialog("Qtd peça 1:"));

// Lê o valor e quantidade da peça 2
double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor peça 2:"));
int qtd2 = Integer.parseInt(JOptionPane.showInputDialog("Qtd peça 2:"));

// Aplica a fórmula total com IPI
double total = (valor1 * qtd1 + valor2 * qtd2) * (1 + ipi / 100);

// Mostra o valor total
JOptionPane.showMessageDialog(null, "Total com IPI: " + total);
    }
}
