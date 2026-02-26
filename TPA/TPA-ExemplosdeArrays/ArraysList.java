/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayslist;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Renato Aparecido da Silva - 1° MTec DS/AMS
 */
public class ArraysList {

    public static void main(String[] args) {
ArrayList<String> nomes = new ArrayList();

// 1- Este método adiciona um novo item ao final da lista.
nomes.add("Gilmar");
nomes.add("Freire");

System.out.println(nomes);
// 2- Retorna um item na posição indicada.
System.out.printf("O primeiro item é %s \n", nomes.get(0));

// 3- Este método substitui o valor da variável
nomes.set(1, "Santos");
System.out.printf("Meu nome na verdade é %s %s \n", nomes.get(0), nomes.get(1));

// 4- Este método remove o item da lista.
System.out.printf("Lista atualizada %s \n", nomes.remove(0));

// 5- Retorna quantos elementos tem na lista.
System.out.printf("O tamanho da lista é %s\n", nomes.size());

// 6- Este método limpa toda a lista.
nomes.clear();
System.out.printf("Lista atualizada %s\n", nomes);

// 7- Este método verifica se contém o item na lista.
nomes.add("Santos");
System.out.printf("Existe na minha lista 'Gilmar'? %s\n", nomes.contains("Santos"));

// 8- Este método verifica se a lista está vazia ou não.
System.out.printf("A lista está vazia? %s\n", nomes.isEmpty());

// 9- Organiza os elementos em ordem crescente (importe a classe)
// import java.util.Collections;
nomes.add("Carros");
nomes.add("Pãozin");
Collections.sort(nomes);
System.out.printf("Lista em ordem crescente %s\n", nomes);

// 10- Usa forEach para mostrar a lista.
nomes.forEach(nome -> System.out.printf("Olá %s\n", nome));

// 11- Organiza os elementos em ordem crescente (
int contador =1;
for(String item : nomes) {
System.out.printf("%d.%s\n", contador, item);
 contador++;
}
    }
}
