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
