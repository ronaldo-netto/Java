package exercicios.lista02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		int n1, n2, d;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número inteiro: ");
		n1 = scan.nextInt();

		System.out.println("Digite o segundo número inteiro: ");
		n2 = scan.nextInt();

		if (n1 > n2) {
			System.out.println("O maior número digitado foi " + n1);
			d = n1 - n2;
		} else if (n2 > n1) {
			System.out.println("O maior número digitado foi " + n2);
			d = n2 - n1;
		} else {
			System.out.println("Os números são iguais.");
			d = 0;
		}

		System.out.println("A diferença entre eles é " + d);

		scan.close();
	}

}
