package exercicios.lista02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		double h, pesoIdeal;
		String sexo;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite sua altura: ");
		h = Double.parseDouble(scan.nextLine());

		System.out.println("Digite seu sexo: 'M' ou 'F' ");
		sexo = scan.nextLine();

		if (sexo.equalsIgnoreCase("M")) {
			pesoIdeal = (72.7 * h) - 58;
			System.out.printf("Seu peso ideal é  %.2f kg", pesoIdeal);
		} else {
			pesoIdeal = (62.1 * h) - 44.7;
			System.out.printf("Seu peso ideal é  %.2f kg", pesoIdeal);
		}

		scan.close();

	}

}
