package com.guilherme.cursojava.exerciciosaulas11_12_13;
/* Faca um programa que peça a temperatura em Farenheit e transforme
 * em graus Celsius
 */

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da temperatura em graus Farenheit: ");
		double temperaturaFarenheit = scan.nextDouble();
		
		/* Formula conversão Farenheit em Ceusius
		C = (5*(F-32 / 9)
		*/
		double c = (5*(temperaturaFarenheit-32) / 9);
		
		System.out.println("O valor da temperatura em Celsius é : " + c);
	}

}
