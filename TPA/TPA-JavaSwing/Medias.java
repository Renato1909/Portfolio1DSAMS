/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.medias;

import javax.swing.JOptionPane;

/**
 *
 * @author RENATO APARECIDO DA SILVA
 */
public class Medias {

    public static void main(String[] args) {
        // Calcula a média dos números 8, 9 e 7
        double media1 = (8 + 9 + 7) / 3.0;

        // Calcula a média dos números 4, 5 e 6
        double media2 = (4 + 5 + 6) / 3.0;

        // Soma das duas médias
        double somaMedias = media1 + media2;

        // Média das médias
        double mediaDasMedias = somaMedias / 2.0;

        // Mostra todos os resultados
        String mensagem = "Média 1 (8, 9, 7): " + media1 +
                          "\nMédia 2 (4, 5, 6): " + media2 +
                          "\nSoma das médias: " + somaMedias +
                          "\nMédia das médias: " + mediaDasMedias;

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
