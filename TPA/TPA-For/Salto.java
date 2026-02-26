/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tpa.gilmar1.salto;
import java.util.Scanner;
        
/**
 *
 * @author Renato Silva
 */
public class Salto {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número para ser o salto: ");
            int salto = scanner.nextInt();

            System.out.println("Contando de 1 a 100, pulando de " + salto + " em " + salto + ":");
            for (int i = 1; i <= 100; i += salto) {
                System.out.print(i + " ");
            }
            System.out.println();

        } catch (Exception e) {
            System.out.println("Ocorreu um erro, digite um valor inválido e tente novamente!");
        } finally {
            scanner.close();
            System.out.println("Programa finalizado com sucesso, obrigado por utilizar nosso código!");
        }
    }
}
