package com.guilherme.cursojava.exerciciosaulas11_12_13;

import java.util.Scanner;

/* Fazer um programa que peça a temperatura em graus Celsius,
 * transforme e mostre em graus Farenheit
 */

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius: ");
		double C = scan.nextDouble();
		
		/* Formula conversão Farenheit em Ceusius
		C = (5*(F-32 / 9)
		*/
		
		double F = 1.8 * C + 32;
		
		
		System.out.println("O valor da temperatura em Farenheit é: " + F);
		
		
		
		
		
	}

}
