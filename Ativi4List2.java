package VetoresMatrizes;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ativi4List2 {

	public static void main(String[] args) {
		//4)Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. As 4 notas de cada
		//participante serão armazenadas em uma linha de uma matriz de números reais, logo cada linha da matriz serão as notas de um 
		//participante. Em um vetor de números reais, armazene as médias de cada participante e exiba as médias de cada um na tela.

		//vetor do tipo double para armazenar as médias
		double[] medias = new double[10];
				
		//matriz do tipo double para armazenar as notas
		double[][] notas = new double[10][4];
		
		System.out.println("---------Encontrando as médias dos participantes---------");

		//try Scanner para facilitar na hora de fechar o scanner 
		try (Scanner scanner = new Scanner(System.in)) {

			//usando a classe DecimalFormat com o nome de df para deixar com uma casa depois da virgula, o # representa o numero
			DecimalFormat df = new DecimalFormat("#.#");

			//Lendo com o scanner as notas dos participantes
			for (int i = 0; i < 10; i++) {
				System.out.println("Digite as 4 notas do participante " + (i + 1) + ": ");
				for (int j = 0; j < 4; j++) {
					System.out.print("Nota " + (j + 1) + ": ");
					notas[i][j] = scanner.nextDouble();
				}
				//Calculando média do participante i com o calcularMedia
				medias[i] = calcularMedia(notas[i]);
			}

			//print das médias com o df
			for (int i = 0; i < 10; i++) {
				System.out.println("A média do participante " + (i + 1) + " é: " + df.format(medias[i]));
			}
		}
	}

	//Foi criado um método para calcular a média de um participante
	public static double calcularMedia(double[] notas) {
		double somaMedia = 0;
		for (double nota : notas) {
			somaMedia += nota;
		}
		return somaMedia / notas.length;

	}

}
