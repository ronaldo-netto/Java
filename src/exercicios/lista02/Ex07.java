package exercicios.lista02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		double n1, n2;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		n1 = Double.parseDouble(scan.nextLine());

		System.out.println("Digite o segundo número: ");
		n2 = Double.parseDouble(scan.nextLine());

		if (n1 > n2) {
			System.out.println("O maior número digitado foi " + n1);
		} else if (n2 > n1) {
			System.out.println("O maior número digitado foi " + n2);
		} else {
			System.out.println("Números iguais");
		}

		scan.close();
	}

}
