package Lacos_Condicionais;

import java.util.Scanner;

public class Laco_Decisao {

	public static void main(String[] args) {
		
		float n1, n2, n3, media;
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		n1 = ler.nextFloat();
		
		System.out.println("Entre com a segunda nota: ");
		n2 = ler.nextFloat();
		
		System.out.println("Entre com a terceira nota: ");
		n3 = ler.nextFloat();
		
		media = (n1 + n2 + n3) / 3;
		System.out.printf("A média é %.2f", media);
		
		if(media >= 7 && media <= 10) {
			System.out.println("\nAlune Aprovade!");
		}
		else if(media >= 5 && media < 7) {
			System.out.println("\nAlune de Exame!");
		}
		else if(media >= 0 && media < 5) {
			System.out.println("\nAlune Reprovade!");
		}
		else {
			System.out.println("\nMédia fora do intervalo!");
		}
		
		System.out.println("\nMenu de elogios!");
		System.out.println("\nEscolha uma das opções abaixo:");
		System.out.println("\n1 - Todos os alunes são muito divertidos;");
		System.out.println("\n2 - Todos os alunes são muito esforçados;");
		System.out.println("\n3 - Todos os alunes são muito unidos;");
		System.out.println("\n4 - Todos os alunes são ótimos atores/atrizes;");
		
		op = ler.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\nTodos os alunes são muito legais;");
			break;
		case 2:
			System.out.println("\nTodos os alunes são muito esforçados;");
			break;
		case 3:
			System.out.println("\nTodos os alunes são muito unidos;");
			break;
		case 4:
			System.out.println("\nTodos os alunes são ótimos atores/atrizes;");
			break;
			//o default é a exceção:
			default:
			System.out.println("\nOpção inválida!");
		}
	}
}
