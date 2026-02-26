/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listacompras;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Renato Aparecido da Silva - 1 DS/AMS
 */
public class ListaCompras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        
        System.out.println("=== LISTA DE COMPRAS ===");
        
        // WHILE - mantém o programa rodando
        while (true) {
            System.out.println("\nO que você quer fazer?");
            System.out.println("1 - Ver lista");
            System.out.println("2 - Adicionar item");
            System.out.println("3 - Remover item");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            // SWITCH CASE - menu de opções
            switch (opcao) {
                case 1: // Ver lista
                    System.out.println("\n--- SUA LISTA ---");
                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia");
                    } else {
                        // FOR - mostra cada item
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println((i + 1) + ". " + lista.get(i));
                        }
                    }
                    break;
                    
                case 2: // Adicionar item
                    // DO WHILE - permite adicionar vários itens
                    boolean continuar = true;
                    do {
                        System.out.print("\nDigite o item: ");
                        String item = scanner.nextLine();
                        lista.add(item);
                        System.out.println("'" + item + "' adicionado!");
                        
                        System.out.print("Adicionar outro? (s/n): ");
                        String resposta = scanner.nextLine();
                        
                        // IF ELSE - decide se continua
                        if (resposta.equalsIgnoreCase("n")) {
                            continuar = false;
                        }
                    } while (continuar);
                    break;
                    
                case 3: // Remover item
                    if (lista.isEmpty()) {
                        System.out.println("\nA lista está vazia!");
                    } else {
                        System.out.println("\nItens na lista:");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println((i + 1) + ". " + lista.get(i));
                        }
                        
                        System.out.print("Qual número remover? ");
                        int numero = scanner.nextInt();
                        scanner.nextLine();
                        
                        if (numero >= 1 && numero <= lista.size()) {
                            String removido = lista.remove(numero - 1);
                            System.out.println("'" + removido + "' removido!");
                        } else {
                            System.out.println("Número inválido!");
                        }
                    }
                    break;
                    
                case 4: // Sair
                    System.out.println("\n--- LISTA FINAL ---");
                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println((i + 1) + ". " + lista.get(i));
                        }
                    }
                    System.out.println("\nAté logo!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
