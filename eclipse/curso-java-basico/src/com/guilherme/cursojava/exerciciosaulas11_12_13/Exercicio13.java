package com.guilherme.cursojava.exerciciosaulas11_12_13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto voc� ganha por hora? ");
		double ganhoHora = scan.nextDouble();
		System.out.println("Qual o n�mero de horas trabalhadas? ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = ganhoHora * horasTrabalhadas;
		double descontoImpostoDeRenda = salarioBruto * 0.11;
		double descontoInss = salarioBruto * 0.08;
		double descontoSindicato = salarioBruto * 0.05;
		
		
		double salarioLiquido = salarioBruto - (descontoImpostoDeRenda + descontoInss + descontoSindicato);
		double totalDescontos = salarioBruto - salarioLiquido;
		
		System.out.println("----------------------------------------------");
		System.out.println("O valor do sal�rio bruto �: " + salarioBruto );
		
		System.out.println("----------------------------------------------");
		System.out.println("O valor descontado do IR �: " + descontoImpostoDeRenda);
		System.out.println("----------------------------------------------");
		System.out.println("O valor pago ao INSS �: " + descontoInss);
		System.out.println("----------------------------------------------");
		System.out.println("O valor pago ao sindicato �: " + descontoSindicato);
		System.out.println("----------------------------------------------");
		System.out.println("O valor total de descontos �: " + totalDescontos);
		
		System.out.println("**********************************************");
		System.out.println("O valor do sal�rio l�quido �: " + salarioLiquido);
	}

}
