package exercicios.lista02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double numero = 0, raizQuadrada;

		System.out.println("Digite um número real: ");
		numero = Double.parseDouble(scan.nextLine());

		if (numero > 0.0) {
			raizQuadrada = Math.sqrt(numero);
			System.out.printf("A raiz quadrada de %.2f é aproximadamente %.4f%n", numero, raizQuadrada);
		} else {
			System.out.println("O número " + numero + " ao quadrado é " + (numero * numero));
		}

		scan.close();
	}

}
