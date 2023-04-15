package Lacos_Condicionais;

import java.util.Scanner;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		float num1, num2;
		int cod;
		
		System.out.println("** Calculadora Generation **");
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		cod = leia.nextInt();
		
		switch (cod) {
		case 1:
			System.out.println("Digite o 1º número: ");
			num1 = leia.nextFloat();
			System.out.println("Digite o 2º número: ");
			num2 = leia.nextFloat();
			System.out.println(num1 + (" + ") + num2 + (" = ") + (num1 + num2));
			break;
		case 2:
			System.out.println("Digite o 1º número: ");
			num1 = leia.nextFloat();
			System.out.println("Digite o 2º número: ");
			num2 = leia.nextFloat();
			System.out.println(num1 + (" - ") + num2 + (" = ") + (num1 - num2));
			break;
		case 3:
			System.out.println("Digite o 1º número: ");
			num1 = leia.nextFloat();
			System.out.println("Digite o 2º número: ");
			num2 = leia.nextFloat();
			System.out.println(num1 + (" x ") + num2 + (" = ") + (num1 * num2));
			break;
		case 4:
			System.out.println("Digite o 1º número: ");
			num1 = leia.nextFloat();
			System.out.println("Digite o 2º número: ");
			num2 = leia.nextFloat();
			System.out.println(num1 + (" / ") + num2 + (" = ") + (num1 / num2));
			break;
			default:
				System.out.println("Essa opção não existe!");
		}
	}
}
