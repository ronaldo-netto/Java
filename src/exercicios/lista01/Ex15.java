package exercicios.lista01;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		// Convertendo um ângulo em radianos para graus;

		Scanner scan = new Scanner(System.in);

		
		double r, g , pi = 3.14;

		System.out.println("Digite o ângulo em radianos: ");
		r = scan.nextDouble();
		g = r * (180 / pi );

		System.out.printf("O ângulo em graus é: %.3f", g);

		scan.close();

	}

}
