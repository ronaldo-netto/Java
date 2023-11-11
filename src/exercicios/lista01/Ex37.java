package exercicios.lista01;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double valor, desc;

		System.out.println("Digite o valor do produto: ");
		valor = Double.parseDouble(scan.nextLine());

		desc = valor - (valor * 0.12);

		System.out.println("O valor do produto com desconto de 12% é " + desc);

		scan.close();

	}

}
