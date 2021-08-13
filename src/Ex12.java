package ExerciciosAula19;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.*/

public class Ex12 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int total = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite a posição " + i + " : ");
			vetorA[i] = scan.nextInt();
			total = total + vetorA[i];

		}

		System.out.println("total do vetorA: " + total);

	}

}
