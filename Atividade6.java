/*
Escreva um algoritmo em Java que leia o Nome do Colaborador (String), 
o Código do Cargo do Colaborador (número inteiro de 1 a 6) e o Salário (número float). 
A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.
Na construção do Algoritmo, utilize os seguintes conteúdos:
Entrada e Saída de dados
Operadores
Laço Condicional Switch
*/

package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String nome;
		int codCargo;
		float salario, novoSalario = 0;
		
		System.out.println("Bem vindo ao RH da Generation!");
		System.out.println("Digite o nome do colaborador:");
		nome = leia.next();
		
		System.out.println("Digite o valor do salário R$ ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o código do cargo:");
		System.out.println("1 - Gerente");
		System.out.println("2 - Vendedor");
		System.out.println("3 - Supervisor");
		System.out.println("4 - Motorista");
		System.out.println("5 - Estoquista");
		System.out.println("6 - Técnico de TI");
		codCargo = leia.nextInt();
		
		switch(codCargo) {
		case 1:
			novoSalario = salario + salario * 0.10f;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.println("Salário reajustado R$ " + novoSalario);
			break;
		case 2:
			novoSalario = salario + salario * 0.07f;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.println("Salário reajustado R$ " + novoSalario);
			break;
		case 3:
			novoSalario = salario + salario * 0.09f;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			System.out.println("Salário reajustado R$ " + novoSalario);
			break;
		case 4:
			novoSalario = salario + salario * 0.06f;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.println("Salário reajustado R$ " + novoSalario);
			break;
		case 5:
			novoSalario = salario + salario * 0.05f;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			System.out.println("Salário reajustado R$ " + novoSalario);
			break;
		case 6:
			novoSalario = salario + salario * 0.08f;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI");
			System.out.println("Salário reajustado R$ " + novoSalario);
			break;
			default:
				System.out.println("Opção inválida!");
		}
	}
}