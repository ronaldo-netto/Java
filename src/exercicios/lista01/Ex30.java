package exercicios.lista01;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double r, d, v_dolar;

		System.out.println("Digite o valor em real: ");
		r = Double.parseDouble(scan.nextLine());

		System.out.println("Digite a cotação do dólar: ");
		d = Double.parseDouble(scan.nextLine());

		v_dolar = r * d;

		System.out.printf("O valor correspondente em dólares é: %.2f ", v_dolar);

		scan.close();

	}

}
