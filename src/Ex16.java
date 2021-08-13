package ExerciciosAula19;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: a) a soma de elementos armazenados neste
vetor que são inferiores a 15; b) a quantidade de elementos
armazenados no vetor que são iguais a 15; e c) a média dos
elementos armazenados no vetor que são superiores a 15.*/

public class Ex16 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int i = 0;
		int soma = 0;
		int cont15 = 0;
		double media = 0;
		int total = 0;
		int qtd = 0;
		for (i = 0; i < vetorA.length; i++) {
			System.out.print("Digite a posição " + i + ":");
			vetorA[i] = scan.nextInt();
		}
		System.out.print("números menores que 15 :");
		for (i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < 15) {
				soma +=vetorA[i];
				System.out.print(" " + vetorA[i]);
			}
		}
		for (i = 0; i < vetorA.length; i++) {
			if (vetorA[i] == 15) {
				cont15++;
			}
		}
		for (i = 0; i < vetorA.length; i++) {
			if (vetorA[i] > 15) {
				total = total + vetorA[i];
				qtd++;
			}
		}
		media = total / qtd;
		System.out.println(" ");
		System.out.println("Soma dos números menores que 15: " + soma);
		System.out.print("Quantidade de números 15 : ");
		System.out.print(cont15);
		System.out.println("");
		System.out.println("média dos números acima de 15 : " + media);

	}

}
