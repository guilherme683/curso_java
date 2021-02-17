package com.guilherme.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		double numero1 = scan.nextDouble();
		System.out.println("Digite o segundo número: ");
		double numero2 = scan.nextDouble();
		System.out.println("Digite o terceiro número: ");
		double numero3 = scan.nextDouble();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("Número 1 é o maior: " + numero1 + ", " + numero2 + "," + numero3);
		}
		else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("Número 2 é o maior: " + numero2 + ", " + numero1 + "," + numero3);
		}
		else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("Número 3 é o maior: " + numero3 + ", " + numero1 + "," + numero2);
		}
		else {
			System.out.println("Os números são iguais: " + numero3 + ", " + numero1 + "," + numero2);

		}

	}

}
