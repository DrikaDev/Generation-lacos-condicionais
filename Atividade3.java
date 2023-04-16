/*
Para doar sangue é necessário ter entre 18 e 69 anos de idade. 
Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. 
Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), 
a idade (inteiro) do doador e se é a primeira doação (boolean). 
De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.
Na construção do Algoritmo, utilize os seguintes conteúdos:
Entrada e Saída de dados
Operadores
Laço Condicional IF
*/

package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean  primeiraDoacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá, digite seu nome por favor: ");
		nome = leia.next();
		
		System.out.println("Olá " + nome + " qual é sua idade?");
		idade = leia.nextInt();
		
		System.out.println(nome + " é a sua primeira doação? Digite True ou False ");
		primeiraDoacao = leia.nextBoolean();
		
		
		if (idade >= 60 && idade <= 69 && !primeiraDoacao) {
			System.out.println(nome + ", está apto para doar sangue!");
		}
		
		else if (idade >= 60 && idade <= 69 && primeiraDoacao) {
			System.out.println(nome + ", não está apto para doar sangue!");
		}
		
		else if (idade > 18 && idade < 60) {
			System.out.println(nome + ", está apto para doar sangue!");
		}
		
		else {
			System.out.println(nome + ", você é menor de idade!");
		}
	}
}
