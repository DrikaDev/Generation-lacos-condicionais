/*
Desenvolva um algoritmo em Java para uma conta bancária. 
O programa deverá ler o tipo de operação a ser realizada com base na tabela abaixo 
(número inteiro entre 1 e 3) e o valor a ser depositado ou sacado (somente nas opções 2 e 3). 
Considere que um saque só pode ser realizado caso haja saldo suficiente. 
Ao final de cada operação, exiba o novo Saldo na tela. 
A variável saldo (float), será inicializada com o valor de R$ 1000.00. 
Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!
Na construção do Algoritmo, utilize os seguintes conteúdos:
Entrada e Saída de dados
Operadores
Laço Condicional Switch
*/

package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int cod;
		float saldo = 1000, saque, deposito;
		
		System.out.println("Bem vindo ao Banco Generation");
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		cod = leia.nextInt();
		
		switch (cod) {
		
		case 1:
			System.out.println("O valor do saldo atual é de R$ " + saldo);
			break;
		case 2:
			if(saldo > 0) {
				System.out.println("Digite o valor do saque R$ ");
				saque = leia.nextFloat();
				System.out.println("Novo Saldo R$ " + (saldo - saque));
			}else {
				System.out.println("Saldo Insuficiente!");
			}
		case 3:
			System.out.println("Informe o valor do depósito R$ ");
			deposito = leia.nextFloat();
			System.out.println("Novo Saldo R$ " + (saldo + deposito));
		default:
			System.out.println("Operação Inválida!");
		}
	}
}
