package exercicios.lista02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int soma = 0;

		for (int i = 0; i < 3; i++) {

			System.out.println("Digite o " + (i + 1) + " valor : ");
			int numero = scan.nextInt();

			soma += numero;

		}

		System.out.println("A soma de todos os valores digitados é: " + soma);

		scan.close();
	}

}
