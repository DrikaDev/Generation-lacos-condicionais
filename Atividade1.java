/*
Faça um algoritmo em Java que leia 3 valores inteiros A, B e C 
e imprima na tela se a soma de A + B é maior, menor ou igual a C.
Na construção do Algoritmo, utilize os seguintes conteúdos:
Entrada e Saída de dados
Operadores
Laço Condicional IF
Na construção do Algoritmo, utilize os seguintes conteúdos:
Entrada e Saída de dados
Operadores
Laço Condicional IF
*/

package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor A: ");
		a = leia.nextInt(); 
		
		System.out.println("Digite o valor B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor C: ");
		c = leia.nextInt();
		
		if((a + b) > c ){
			System.out.println("A soma do valor de A + B é maior que C.");
		}
		
		else if((a + b) < c){
			System.out.println("A soma do valor de A + B é menor que C.");
		}
		
		else if((a + b) == c){
			System.out.println("A soma do valor de A + B é igual a C.");
		}
	}
}
