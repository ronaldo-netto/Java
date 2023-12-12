package exercicios.lista02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		double n1, n2, media;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a primeira nota:");
		n1 = Double.parseDouble(scan.nextLine());

		if (n1 > 0.0 && n1 <= 10.0) {
			System.out.println("Digite a segunda nota:");
			n2 = Double.parseDouble(scan.nextLine());

			if (n2 > 0.0 && n2 <= 10.0) {
				media = (n1 + n2) / 2;
				System.out.println("Média: " + media);
			} else {
				System.out.println("Nota inválida!");
			}
		} else {
			System.out.println("Nota inválida!");
		}

		System.out.println("Encerrando programa..");

		scan.close();

	}
}
