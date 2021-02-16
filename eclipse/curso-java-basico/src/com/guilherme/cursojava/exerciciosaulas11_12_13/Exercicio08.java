package com.guilherme.cursojava.exerciciosaulas11_12_13;

import java.util.Scanner;

/* Fazer um programa que calcule o valor do salario
 * conforme o numero de aulas trabalhadas
 */

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora?");
		double ganhoPorHora = scan.nextDouble();
		System.out.println("Qual o número de horas trabalhadas por semana?");
		double qtdHorasTrabalhadas = scan.nextDouble();
		
		double salarioSemanal = ganhoPorHora * qtdHorasTrabalhadas;
		double salarioMensal = salarioSemanal * 4;
		
		System.out.println("O valor do salário bruto semanal é: " + salarioSemanal + "\n");
		System.out.println("O valor do salário bruto mensal é: " + salarioMensal);

		
		
		

	}

}
