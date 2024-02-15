package VetoresMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Ativ1List1 {

	public static void main(String[] args) {
		// 1)Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,construa um algoritmo que consiga
		// pesquisar dados no vetor, onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste
		// número no vetor. Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela.

		//try Scanner para facilitar na hora de fechar o scanner
		try (Scanner leia = new Scanner(System.in)) {
			int posicao, numero;
			int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

			//Ordena o Vetor para conseguir procurar a posição do numero solicitado
			Arrays.sort(vetorInteiros);

			System.out.println("\nVetor Ordenado");

			//Com esse loop vai printar na tela os valores que estão na posição que o indice se encontra
			for (int indice = 0; indice < vetorInteiros.length; indice++) {
				System.out.println(vetorInteiros[indice]);
			}

			System.out.println("\nDigite o número que você deseja encontrar: ");
			numero = leia.nextInt();

			//A posição recebe o resultado da procura da posição que o arrys.binarySerarch fez 
			posicao = Arrays.binarySearch(vetorInteiros, numero);

			//Se a posição for positiva vai retornar que foi encontrado
			if (posicao >= 0) {
				System.out.println("\nO número " + numero + " foi encontrado e está na posição: " + posicao);
			} else {
				System.out.println("\nO número " + numero + " não foi encontrado!");
			}
		}
	}

}
