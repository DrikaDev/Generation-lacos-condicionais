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
		}

	}

}
