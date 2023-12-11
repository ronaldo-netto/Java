package exercicios.lista02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		double numero = 0, raizQuadrada;

		Scanner scan = new Scanner(System.in);

		do {

			System.out.println("Digite um número: ");
			numero = Double.parseDouble(scan.nextLine());

			if (numero > 0.0) {
				raizQuadrada = Math.sqrt(numero);
				System.out.printf("A raiz quadrada de %.2f é aproximadamente %.4f%n", numero, raizQuadrada);
			} else {
				System.out.println("Número inválido!");
			}

		} while (numero <= 0.0);

		scan.close();
	}

}
