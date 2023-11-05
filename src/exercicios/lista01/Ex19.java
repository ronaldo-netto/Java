package exercicios.lista01;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// Convertendo volume em litros, para metros cúbicos.

		Scanner scan = new Scanner(System.in);

		double m, l;

		System.out.println("Digite um volume em litros: ");
		l = Double.parseDouble(scan.nextLine());

		m = l / 1000;

		System.out.println("O resultado convertido em metros cúbicos é: " + m);
		// System.out.printf("O resultado convertido em metros cúbicos é: %.5f", m);

		scan.close();

	}

}
