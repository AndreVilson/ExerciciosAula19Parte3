package ExerciciosAula19;

import java.util.Scanner;

/*Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a menor e a maior idades e suas respectivas posições.*/

public class Ex18 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int posicaoMaior = 0;
		int posicaoMenor = 0;

		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Digite a posição " + i + " : ");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < menor) {
				menor = vetorA[i];
				posicaoMenor = i;

			}
			if (vetorA[i] > maior) {
				maior = vetorA[i];
				posicaoMaior = i;

			}
		}
		System.out.println("Menor idade " + menor + " posição " + posicaoMenor);
		System.out.println("Maior idade " + maior + " posição " + posicaoMaior);

	}

}
