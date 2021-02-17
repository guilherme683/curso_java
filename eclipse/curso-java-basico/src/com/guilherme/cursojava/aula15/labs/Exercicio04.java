package com.guilherme.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra: ");
		String letra = scan.next();

		switch (letra) {
		case "a":
		case "A":
		case "e":
		case "E":
		case "i":
		case "I":
		case "o":
		case "O":
		case "u":
		case "U": System.out.println("A letra digitada é uma vogal.");
			break;
	
		default:
			System.out.println("A letra digitada é uma consoante.");
			break;
		}

	}

}
