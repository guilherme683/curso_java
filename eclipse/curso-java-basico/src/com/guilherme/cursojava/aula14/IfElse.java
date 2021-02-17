package com.guilherme.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o preço: ");
		double preco = scan.nextDouble();
		
		if (preco <= 10) {
			System.out.println("Barato!");
		}
		else if (preco > 10 && preco < 15) {
			System.out.println("Pedir desconto");
		}  
		else if (preco >= 15 && preco < 17 ) {
			System.out.print("Pesquisar mais um pouco");
		}
		else {
			System.out.print("Muito caro!");
		}
	}

}
