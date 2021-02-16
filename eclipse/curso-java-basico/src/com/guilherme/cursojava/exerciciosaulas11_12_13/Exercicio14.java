package com.guilherme.cursojava.exerciciosaulas11_12_13;
//Ler o tamanho de um arquivo e calcular o tempo do download
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho do arquivo para download em MB: ");
		double tamanhoArquivo = scan.nextDouble();
		System.out.println("Digite a velocidade do link de Internet em Mbps: ");
		double velocidadeLink = scan.nextDouble();
		
		double tempoDownload = (tamanhoArquivo / velocidadeLink) / 60;
		System.out.println("O tempo estimado em minutos é: " + tempoDownload);

		
	}

}
