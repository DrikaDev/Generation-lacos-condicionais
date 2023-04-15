package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int codProduto, qtdeItem;
		float valorTotal;
		
		System.out.println("- Lanchonete da Drika -");
		System.out.println("--------- Menu --------");
		System.out.println("1 - Cachorro Quente - R$ 10,00");
		System.out.println("2 - X-Salada - R$ 15,00");
		System.out.println("3 - X-Bacon - R$ 18,00");
		System.out.println("4 - Bauru - R$ 12,00");
		System.out.println("5 - Refrigerante - R$ 8,00");
		System.out.println("6 - Suco de laranja - R$ 13,00");
		
		System.out.println("Digite a opção escolhida:");
		codProduto = leia.nextInt();
		System.out.println("Digite a quantidade escolhida:");
		qtdeItem = leia.nextInt();
		
		switch(codProduto) {
		case 1:
			valorTotal = qtdeItem * 10;
			System.out.println(qtdeItem + " Cachorro Quente - Valor Total R$ " + valorTotal);
			break;
		case 2:
			valorTotal = qtdeItem * 15;
			System.out.println(qtdeItem + " X-Salada - Valor Total R$ " + valorTotal);
			break;
		case 3:
			valorTotal = qtdeItem * 18;
			System.out.println(qtdeItem + " X-Bacon - Valor Total R$ " + valorTotal);
			break;
		case 4:
			valorTotal = qtdeItem * 12;
			System.out.println(qtdeItem + " Bauru - Valor Total R$ " + valorTotal);
			break;
		case 5:
			valorTotal = qtdeItem * 8;
			System.out.println(qtdeItem + " Refrigerante - Valor Total R$ " + valorTotal);
			break;
		case 6:
			valorTotal = qtdeItem * 13;
			System.out.println(qtdeItem + " Suco de laranja - Valor Total R$ " +valorTotal);
			break;
		default:
			System.out.println("Código inválido");
		}
		
	}

}
