package Lacos_Condicionais;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		String p1, p2, p3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a primeira palavra:");
		p1 = leia.nextLine();
		
		System.out.println("Entre com a segunda palavra:");
		p2 = leia.nextLine();
		
		System.out.println("Entre com a terceira palavra:");
		p3 = leia.nextLine();
		
		if (p1.equalsIgnoreCase("vertebrado")) {
			if (p2.equalsIgnoreCase("ave")) {
				if (p3.equalsIgnoreCase("carnívoro")) {
					System.out.println("É uma águia");
				}else {
					System.out.println("É uma pomba");
				}
			}else {
				if (p3.equalsIgnoreCase("onivoro")) {
					System.out.println("É um humano");
				}else {
					System.out.println("É uma vaca");
				}
			}
		}else {
			if (p2.equalsIgnoreCase("inseto")) {
				if (p3.equalsIgnoreCase("hematofago")) {
					System.out.println("É uma pulga");
				}else {
					System.out.println("É uma lagarta");
				}
			}else {
				if (p3.equalsIgnoreCase("hematofago")) {
					System.out.println("É uma sanguessuga");
				}else {
					System.out.println("É uma minhoca");
				}
			}
		}
	}
}