package com.guilherme.cursojava.aula12;

import java.util.Scanner;

public class LendoDadosDoTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu nome completo, sua idade, se tem animal de estima��o, se sim, qual o tipo: ");
		String nomeCompleto = scan.nextLine();
		int idade = scan.nextInt();
		boolean temPet = scan.nextBoolean();
		
		String tenhoPet;
		String meuPet = "";
	
		
		if(temPet == true) {
			tenhoPet = "Tenho um pet";
			System.out.println("Qual o tipo de pet?");
			String tipoDePet = scan.nextLine();
			meuPet = tipoDePet;

		} else {
			tenhoPet = "N�o tenho um pet";
		}
		
		System.out.println("Os dados que voc� digitou foram: \n" 
				+ nomeCompleto + "\n" + idade + "\n" + tenhoPet + meuPet 
				);
	}

}
