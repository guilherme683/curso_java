package com.guilherme.cursojava.exerciciosaulas11_12_13;

import java.util.Scanner;

//Fazer um programa que peca as 4 notas bimestrais e mostre a m�dia 

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double nota3 = scan.nextDouble();
		System.out.println("Digite a quarta nota: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4; 
		
		System.out.println("A valor da m�dia � : " + media);


	}

}
