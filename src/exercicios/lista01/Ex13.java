package exercicios.lista01;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		//Convertendo uma km/h para milhas.

		Scanner scan = new Scanner(System.in);

		double m, k;

		System.out.println("Digite uma distância em km: ");
		k = Double.parseDouble(scan.nextLine());

		m = k / 1.61;

		System.out.println("A distância em milhas é: " + m);

		scan.close();

	}

}
