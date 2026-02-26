/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

/**
 *
 * @author Renato Aparecido da Silva - 1° MTec DS/AMS
 */
public class Arrays {

    public static void main(String[] args) {
        String [] nomes = {"Professor", "Gilmar"};
        System.out.printf("Os dois valores são %s, %s\n", nomes [0],nomes[1]);
        // Este método faz a contagem de caracteres
        System.out.printf("O nome %s tem %s letras\n", nomes [0],nomes[0].length());
        //Este método transforma tudo em maiúsculo
        System.out.printf("O nome %s em maiúsculo é %s.\n", nomes [0],nomes[0].toUpperCase());
        // Este método transforma em minúsculas
        System.out.printf("O nome %s em minúsculas é: %s.\n", nomes [0],nomes[0].toLowerCase());
        // Este método traz a letra em uma posição específica
        System.out.printf("A primeira letra de %s é %s.\n", nomes [0],nomes[0].charAt(0));
        //Este método traz uma parte da String
        System.out.printf("As 3 primeiras letras de %s é %s.\n", nomes [0],nomes[0].substring(0,3));
        // Ete método também traz a String a partir do índice selecionado.
        System.out.printf("As 3 primeiras letras de %s é %s.\n", nomes [0],nomes[0].substring(3));
        // Este método faz comparações
        System.out.printf("O nome %s é igual a 'Prof? %s.\n", nomes [0],nomes[0].equals("Prof"));
        // Este método faz comparações sem levar em conta Case
        System.out.printf("O nome %s é igual a 'Prof' %s.\n", nomes [0],nomes[0].equalsIgnoreCase("professor"));
        // Este método verifica se contém alguma parte do texto
        System.out.printf("O nome %s contém 'Pro' %s.\n", nomes [0],nomes[0].contains("Pro"));
        // Este método verifica se começa com determinada sílaba
        System.out.printf("O nome %s começa com 'Prof'? %s.\n", nomes [0],nomes[0].startsWith("Prof"));
        // Este método verifica se termina com determinada sílaba
        System.out.printf("O nome %s termina com 'ssor'? %s.\n", nomes [0],nomes[0].endsWith("ssor"));
        // Este método faz a substituição de uma parte ou toda da String
        System.out.printf("Troque %s por 'Instrutor'. Agora eu sou %s.\n", nomes [0],nomes[0].replace("Professor","Instrutor"));
    }
}
