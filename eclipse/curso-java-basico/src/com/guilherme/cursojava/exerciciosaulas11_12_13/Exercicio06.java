package com.guilherme.cursojava.exerciciosaulas11_12_13;
//Fazer um programa que peca o raio de um circulo, calcule e mostre a sua area

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do círculo: ");
		double raio = scan.nextDouble();
		
		
		//double π = 3.14159265358979323846; 
		double areaCirculo = Math.PI  * Math.pow(raio, 2);
		
		System.out.println("A area do circulo é: " + areaCirculo);
	}

}
