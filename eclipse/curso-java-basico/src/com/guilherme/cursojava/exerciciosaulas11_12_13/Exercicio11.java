package com.guilherme.cursojava.exerciciosaulas11_12_13;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int numeroInteiro1 = scan.nextInt();
		System.out.print("Digite outro numero inteiro: ");
		int numeroInteiro2 = scan.nextInt();
		
		System.out.print("Digite um numero real: ");
		double numeroReal = scan.nextDouble();

		double produto = (2 * numeroInteiro1) * (numeroInteiro2 / 2);
		double soma = (3 * numeroInteiro1) + numeroReal;
		double potencia = Math.pow(numeroReal, 3);
		System.out.print("----------------------------" + "\n");
		System.out.print("O valor do produto é: " + produto + "\n");
		System.out.print("O valor da soma é: " + soma + "\n");
		System.out.print("O valor da potencia é: " + potencia);
	
	
	}

}
