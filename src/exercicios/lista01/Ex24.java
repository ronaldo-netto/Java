package exercicios.lista01;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		double m, a;

		System.out.println("Digite a área em metros quadrados: ");
		m = Double.parseDouble(scan.nextLine());

		a = m * 0.000247;

		System.out.println("A area convertida em acres é " + a);

		scan.close();

	}

}
