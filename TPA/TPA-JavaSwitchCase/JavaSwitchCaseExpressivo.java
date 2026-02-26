/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaswitchcaseexpressivo;
import java.util.Scanner;

/**
 *
 * @author Renato Aparecido da Silva - 1° MTec DS/AMS
 */
public class JavaSwitchCaseExpressivo {

    public static void main(String[] args) {
        Scanner inUser=new Scanner(System.in);
    System.out.println("Qual fruta você irá escolher? ");
    int resposta=inUser.nextInt();
    
            switch(resposta){
            case 1 -> System.out.println("Maçã");
            case 2 -> System.out.println("Banana");
            case 3 -> System.out.println("Laranja");
            case 13 -> System.out.println("Parabéns! Você achou a fruta secreta, é a Manga!");
            
            default -> {
                System.out.println("Valor de entrada invalido ");
}
            }
    }
}
