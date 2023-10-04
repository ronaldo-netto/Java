package exercicios.lista01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		// Convertendo uma temperatura em graus Celsius para graus Kelvin.

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a temperatura em Celsius: ");
		int c = scan.nextInt();

		double k = c + 273.15;

		System.out.print("A temperatura em graus Kelvin é: " + k);

		scan.close();
	}

}
