package exercicios.lista01;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double r, a, pi = 3.141592;

		System.out.println("Digite o raio do círculo: ");
		r = Double.parseDouble(scan.nextLine());
		a = pi * (r * r);

		System.out.printf("A área do circulo é: %.4f ", a);

		scan.close();

	}

}
