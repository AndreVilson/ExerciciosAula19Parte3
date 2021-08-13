package ExerciciosAula19;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor.*/

public class Ex14 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int totalImpar = 0;
		double media = 0;
		int impar = 0;

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Digite a posição " + i + ":");
			vetorA[i] = scan.nextInt();
		}
		System.out.println("Números ímpares:");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				totalImpar = totalImpar + vetorA[i];
				impar ++;
				System.out.print(" " + vetorA[i]);
			}
		}
		media = totalImpar / impar;
		System.out.println("  ");
		System.out.println("total dos ímpares :" + totalImpar);
		System.out.println("média dos ímpares :" + media);

	}

}
