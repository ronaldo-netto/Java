package exercicios.lista01;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double a, m;

		System.out.println("Digite um valor de área em acres: ");
		a = Double.parseDouble(scan.nextLine());

		m = a * 4048.58;

		System.out.println("A área em metros quadrados é " + m);

		scan.close();
	}

}
