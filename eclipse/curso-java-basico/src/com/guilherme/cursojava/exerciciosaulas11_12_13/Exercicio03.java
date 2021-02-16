package com.guilherme.cursojava.exerciciosaulas11_12_13;

import java.util.Scanner;

//Fazer um programa que leia dois numeros e imprima a soma

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int numero1 = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		int numero2 = scan.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("A valor da soma é: " + soma);


	}

}
