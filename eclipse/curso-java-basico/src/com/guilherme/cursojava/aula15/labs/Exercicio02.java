package com.guilherme.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um valor: ");
		double valor = scan.nextDouble();
		
		if (valor < 0) {
			System.out.println("Esse n�mero � negativo.");
		}
		else if (valor >= 1){
			System.out.println("Esse n�mero � positivo.");
		}
		else {
			System.out.println("Voc� digitou o n�mero 0.");

		}
	}

}
