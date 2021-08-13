package ExerciciosAula19;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que determine a soma dos elementos armazenados neste vetor que
são múltiplos de 5.*/

public class Ex13 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int i = 0;
		int total = 0;

		for (i = 0; i < vetorA.length; i++) {
			System.out.print("Digite a posição " + i + " : ");
			vetorA[i] = scan.nextInt();
		}
		System.out.print("Números multiplos de 5 :");
		for(i = 0; i< vetorA.length; i++) {
			if (vetorA[i] % 5 == 0) {
				total +=  vetorA[i];
				System.out.print(" " + vetorA[i]);
			}
		}
		System.out.println(" ");
		System.out.println("total dos números : " + total);

	}

}
