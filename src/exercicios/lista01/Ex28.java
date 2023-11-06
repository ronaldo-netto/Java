package exercicios.lista01;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n1, n2, n3, q1, q2, q3, soma;

		System.out.println("Digite três números inteiros: ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();

		q1 = n1 * n1;
		q2 = n2 * n2;
		q3 = n3 * n3;

		soma = q1 + q2 + q3;

		System.out.println("A soma dos quadrados dos três valores lidos é: " + soma);

		scan.close();

	}

}
