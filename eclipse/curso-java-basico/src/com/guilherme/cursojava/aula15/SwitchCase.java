package com.guilherme.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o n�mero correspondente ao dia da semana: ");
		System.out.println("1 - Domingo");
		System.out.println("2 - Segunda-feira");
		System.out.println("3 - Ter�a-Feira");
		System.out.println("4 - Quarta-Feira");
		System.out.println("5 - Quinta-Feira");
		System.out.println("6 - Sexta-Feira");
		System.out.println("7 - S�bado");
		System.out.println("8 - Sair");
		
		int diaSemana = scan.nextInt();
		
		
			switch (diaSemana) {
			case 1:
				System.out.println("Hoje � Domingo");
				break;
			case 2:
				System.out.println("Hoje � Segunda-Feira");
				break;
			case 3:
				System.out.println("Hoje � Ter�a-Feira");
				break;
			case 4:
				System.out.println("Hoje � Quarta-Feira");
				break;
			case 5:
				System.out.println("Hoje � Quinta-Feira");
				break;
			case 6:
				System.out.println("Hoje � Sexta-Feira");
				break;
			case 7:
				System.out.println("Hoje � S�bado");
				break;

			default:
				System.out.println("Voc� digitou um dia da semana inv�lido. Deve digitar de 1 a 7. \n"
						+ "Voc� digitou. " + diaSemana);
				break;
			}

		}
		
			}



