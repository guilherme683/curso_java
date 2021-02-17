package com.guilherme.cursojava.aula15.labs;
//Fazer um programa que peça dois numeros e imprima o maior deles

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Entre com o primeiro número: ");
	double numero1 = scan.nextDouble();
	System.out.println("Entre com o segundo número: ");
	double numero2 = scan.nextDouble();
	
	if (numero1 > numero2) {
		System.out.println("Numero " + numero1 + " é maior que numero " + numero2);
	}
	else if (numero2 > numero1) {
		System.out.println("Numero " + numero2 + " é maior que numero " + numero1);
	}
	else {
		System.out.println("Numero " + numero1 + " e " + numero2 + " são iguais.");
	}

	}

}
