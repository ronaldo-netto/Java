package exercicios.lista02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		double n1, n2;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		n1 = Double.parseDouble(scan.nextLine());

		System.out.println("Digite o segundo número: ");
		n2 = Double.parseDouble(scan.nextLine());

		if (n1 > n2) {
			System.out.println("O número " + n1 + " é o maior");
		} else {
			System.out.println("O número " + n2 + " é o maior");
		}

		scan.close();
	}

}
