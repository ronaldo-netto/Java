package exercicios.lista01;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double j, m;

		System.out.println("Digite um comprimento em metros: ");
		m = Double.parseDouble(scan.nextLine());
		j = m / 0.91;

		System.out.println("O comprimento convertido em jardas é: " + j);

		scan.close();

	}

}
