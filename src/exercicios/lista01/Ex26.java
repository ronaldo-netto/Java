package exercicios.lista01;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double m, h;

		System.out.println("Digite um valor de área em metros quadrados: ");
		m = Double.parseDouble(scan.nextLine());
		h = m * 0.0001;

		System.out.println("A área convertida em hectares é " + h);

		scan.close();

	}

}
