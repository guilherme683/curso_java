package com.guilherme.cursojava.exerciciosaulas11_12_13;

import java.util.Scanner;

//Fazer um programa que converta metros para centimetros

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("------------------------------------------------------");
		System.out.println("Programa que converte \"metros\" para \"centimetros\" ");
		System.out.println("------------------------------------------------------ \n");

		System.out.println("Digite o numero a ser convertido para centimetros:");
		double numero = scan.nextDouble();
		
		double centimetros = numero * 100;
		
		System.out.println("O valor do número: " + numero + " convertido para metros é: \n " + centimetros + " centimetros");
		
	}

}
