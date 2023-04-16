/*
Escreva um algoritmo em Java, que leia um número inteiro via teclado e 
mostre na tela uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo.
Na construção do Algoritmo, utilize os seguintes conteúdos:
Entrada e Saída de dados
Operadores
Laço Condicional IF
*/

package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá! Digite um número por favor: ");
		num = leia.nextInt();
		
		if ((num % 2 == 0) && (num >= 0)) {
			System.out.println("O número digitado " + num + " é par e positivo!");
		}
		
		else if ((num % 2 == 0) && (num <= 0)) {
			System.out.println("O número digitado " + num + " é par e negativo!");
		}
		
		else if (num >= 0) {
			System.out.println("O número digitado " + num + " é ímpar e positivo!");
		}
		
		else if (num <= 0) {
			System.out.println("O número digitado " + num + " é ímpar e negativo!");
		}
	}

}
