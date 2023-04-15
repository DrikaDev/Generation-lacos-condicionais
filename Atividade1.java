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
