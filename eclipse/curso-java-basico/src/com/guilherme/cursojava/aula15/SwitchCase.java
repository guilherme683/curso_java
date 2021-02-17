package com.guilherme.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o número correspondente ao dia da semana: ");
		System.out.println("1 - Domingo");
		System.out.println("2 - Segunda-feira");
		System.out.println("3 - Terça-Feira");
		System.out.println("4 - Quarta-Feira");
		System.out.println("5 - Quinta-Feira");
		System.out.println("6 - Sexta-Feira");
		System.out.println("7 - Sábado");
		System.out.println("8 - Sair");
		
		int diaSemana = scan.nextInt();
		
		
			switch (diaSemana) {
			case 1:
				System.out.println("Hoje é Domingo");
				break;
			case 2:
				System.out.println("Hoje é Segunda-Feira");
				break;
			case 3:
				System.out.println("Hoje é Terça-Feira");
				break;
			case 4:
				System.out.println("Hoje é Quarta-Feira");
				break;
			case 5:
				System.out.println("Hoje é Quinta-Feira");
				break;
			case 6:
				System.out.println("Hoje é Sexta-Feira");
				break;
			case 7:
				System.out.println("Hoje é Sábado");
				break;

			default:
				System.out.println("Você digitou um dia da semana inválido. Deve digitar de 1 a 7. \n"
						+ "Você digitou. " + diaSemana);
				break;
			}

		}
		
			}



