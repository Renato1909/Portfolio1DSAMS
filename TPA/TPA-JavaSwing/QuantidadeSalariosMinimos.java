/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quantidadesalariosminimos;
import javax.swing.JOptionPane;

/**
 *
 * @author RENATO SILVA
 */
public class QuantidadeSalariosMinimos {

    public static void main(String[] args) {
     // Define o valor do salário mínimo
double salarioMin = 1320.00;

// Lê o salário do usuário
double salarioUsuario = Double.parseDouble(JOptionPane.showInputDialog("Salário do usuário:"));

// Calcula quantos salários mínimos o usuário ganha
double qtd = salarioUsuario / salarioMin;

// Exibe a quantidade de salários mínimos
JOptionPane.showMessageDialog(null, "Salários mínimos: " + qtd);

    }
}
