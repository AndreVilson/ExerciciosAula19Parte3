package ExerciciosAula19;

import java.util.Scanner;

/*Ler um vetor A com 10 elementos inteiros correspondentes as idades
de um grupo de pessoas. Escreva um programa que determine e
escreva a quantidade de pessoas que possuem idade superior a 35
anos.*/

public class Ex17 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] idade = new int[10];
		int cont = 0;

		for (int i = 0; i < idade.length; i++) {
			System.out.print("Digite a posição " + i + " : ");
			idade[i] = scan.nextInt();
		}
		System.out.print("Idades acima de 35 : ");
		for (int i = 0; i < idade.length; i++) {
			if (idade[i] > 35) {
				cont++;
				System.out.print(" " + idade[i]);
			}
		}
		System.out.println("");
		System.out.print("Quantidade de pessoas acima de 35 anos : " + cont++);

	}

}
