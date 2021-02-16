package com.guilherme.cursojava.exerciciosaulas11_12_13;
/* Fazer um exercicio que calcule a area de um quadrado
em seguida mostre o dobra dessa area para o usuario */

import java.util.Scanner;

public class Exercicio07 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		double areaQuadrado = lado * lado;
		double dobroAreaQuadrado = areaQuadrado * 2;
		System.out.println("A area do quadrado é: " + areaQuadrado + "\n");
		System.out.println("O dobro da area desse quadrado é: " + dobroAreaQuadrado + "\n");		
	}

}
