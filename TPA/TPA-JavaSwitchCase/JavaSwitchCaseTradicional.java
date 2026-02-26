/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaswitchcasetradicional;
import java.util.Scanner;

/**
 *
 * @author Renato Aparecido da Silva - 1° MTec DS/AMS
 */
public class JavaSwitchCaseTradicional {

    public static void main(String[] args) {
        Scanner inUser = new Scanner (System.in);

        // Abaixo, a entrada de dados:
        
        System.out.println("Número de questões corretas");
        int resposta = inUser.nextInt();
       
        switch(resposta){
            case 1:
            case 2:
            case 3:    
            case 4:    
            System.out.println("Sua nota é um I - Insatisfatório");
                break;
                
            case 5:
            case 6:
            System.out.println("Sua nota é um R - Regular");    
                break; 
                
            case 7:    
            case 8:    
            System.out.println("Sua nota é um B - Bom");    
                 break;
                 
            case 9:     
            case 10:    
            System.out.println("Sua nota é um MB - Muito Bom");    
                 break;
                 
            default:     
            System.out.println("Valor de entrada inválido");   
        }
     }
}
