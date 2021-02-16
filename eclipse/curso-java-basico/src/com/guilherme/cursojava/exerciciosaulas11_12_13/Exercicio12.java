package com.guilherme.cursojava.exerciciosaulas11_12_13;
//Calcular o peso ideal de acordo com a altura

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7*altura)-58;
		
		System.out.println("Seu peso ideal é: " + pesoIdeal);
	}

}
