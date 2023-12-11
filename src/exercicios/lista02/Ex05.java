package exercicios.lista02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int numero;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		numero = scan.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é par.");
		} else {
			System.out.println("O número " + numero + " é ímpar.");
		}

		scan.close();
	}

}
