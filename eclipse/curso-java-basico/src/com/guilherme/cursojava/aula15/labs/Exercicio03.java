package com.guilherme.cursojava.aula15.labs;

import java.util.Scanner;

import com.guilherme.cursojava.aula15.SwitchCase;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o sexo (F - Feminino, M - Masculino):");
		String valor = scan.next();
		
		switch (valor) {
		case "F":
		case "f":
			System.out.println("Sexo Feminino");
			break;
		
		case "M":
		case "m":
			System.out.println("Sexo Masculino");
			break;

		default:
			System.out.println("Sexo Inválido");
			break;
		}

	}

}
