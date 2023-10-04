package exercicios.lista01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	// Convertendo uma temperatura de graus Fahrenheit para graus Celsius.

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a temperatura em graus celsius: ");
		int f = scan.nextInt();

		double c = 5.0 *( f - 32.0) / 9.0;

		System.out.print("A temperatura em graus Celsius é: ");
		System.out.printf("%.5f", c);

		scan.close();

	}

}