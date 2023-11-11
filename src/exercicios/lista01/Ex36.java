package exercicios.lista01;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double altura, raio, v, pi = 3.141592;

		System.out.println("Digite a altura do cilindro: ");
		altura = Double.parseDouble(scan.nextLine());

		System.out.println("Digite o raio do cilindro: ");
		raio = Double.parseDouble(scan.nextLine());

		v = pi * (raio * raio) * altura;

		System.out.printf("O volume do cilindro é: %.2f ", v);

		scan.close();

	}

}
