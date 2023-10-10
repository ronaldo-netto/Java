package exercicios.lista01;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		// Convertendo um ângulo em graus para radianos;

		Scanner scan = new Scanner(System.in);

		int g;
		double r, pi = 3.14;

		System.out.println("Digite o ângulo em graus: ");
		g = scan.nextInt();
		r = g * (pi / 180);

		System.out.println("O ângulo em radianos é: " + r);

		scan.close();

	}

}
