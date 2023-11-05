package exercicios.lista01;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		// Convertendo centimetros para polegadas.

		Scanner scan = new Scanner(System.in);

		double p, c;

		System.out.println("Digite o comprimento em cm: ");
		c = Double.parseDouble(scan.nextLine());

		p = c / 2.54;

		System.out.printf("O comprimento em polegadas é: %.5f " , p);

		scan.close();

	}

}
