package ExerciciosAula19;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor.*/

public class Ex15 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		double porcentualPar = 0;
		double porcentualImpar = 0;
		double contPar = 0;
		double contImpar = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite a posição " + i + ":");
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}

		}
		porcentualPar = contPar / vetorA.length * 100;
		porcentualImpar = contImpar / vetorA.length * 100;
		System.out.println("Par " + porcentualPar + "%");
		System.out.println("Ímpar " + porcentualImpar + "%");

	}

}
