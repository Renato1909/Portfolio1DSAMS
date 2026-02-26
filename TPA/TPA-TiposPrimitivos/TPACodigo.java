/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpacodigo;

/**
 *
 * @author RENATO APARECIDO DA SILVA
 */
public class TPACodigo {

    public static void main(String[] args) {// Declaração do método main {
// Declaração de variáveis primitivas
byte idade = 20; // Contém números baixos (1 a 100)
short ano = 2025; // Contém números um pouco maiores (1000 até 10000)
int populacaoCidade = 500000; // Tipo mais comum para números inteiros
       long populacaoMundial = 8000000000L; // Valor longo
       
float altura = 1.75f; // Necessário 'f' no final para indicar float
double peso= 72.5; // Mais preciso que float

char inicial = 'R'; // Contém apenas 1 caractere
boolean ativo= true; // Contém algo que pode ser verdadeiro ou falso

// Exibição de valores
System.out.println("Idade: " + idade);
System.out.println("Ano: " + ano);
System.out.println("População da cidade " + populacaoCidade);
System.out.println("População mundial:" + populacaoMundial);
System.out.println("Altura:" + altura + "m");
System.out.println("Peso:" + peso + "kg");
System.out.println("Inicial do nome" + inicial);
System.out.println("Está ativo?" + ativo);
 }
}
