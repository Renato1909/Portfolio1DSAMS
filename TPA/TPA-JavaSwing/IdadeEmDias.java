/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idadeemdias;
import javax.swing.JOptionPane;
/**
 *
 * @author RENATO SILVA
 */
public class IdadeEmDias {

    public static void main(String[] args) {
        // Lê os dados de idade em anos, meses e dias
      int anos = Integer.parseInt(JOptionPane.showInputDialog("Anos:")); 
int meses = Integer.parseInt(JOptionPane.showInputDialog("Meses:"));
int dias = Integer.parseInt(JOptionPane.showInputDialog("Dias:"));
int total = (anos * 365) + (meses * 30) + dias; // Calcula o total de dias (ano = 365 dias, mês = 30 dias)

JOptionPane.showMessageDialog(null, "Total em dias: " + total); // Mostra o total de dias
    }
}
