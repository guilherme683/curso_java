package com.guilherme.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		double numero1 = scan.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		double numero2 = scan.nextDouble();
		System.out.println("Digite o terceiro n�mero: ");
		double numero3 = scan.nextDouble();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("N�mero 1 � o maior: " + numero1 + ", " + numero2 + "," + numero3);
		}
		else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("N�mero 2 � o maior: " + numero2 + ", " + numero1 + "," + numero3);
		}
		else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("N�mero 3 � o maior: " + numero3 + ", " + numero1 + "," + numero2);
		}
		else {
			System.out.println("Os n�meros s�o iguais: " + numero3 + ", " + numero1 + "," + numero2);

		}

	}

}
