package exercicios.lista01;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		double k, l;

		System.out.println("Digite a massa em libras: ");
		l = Double.parseDouble(scan.nextLine());

		k = l * 0.45;

		System.out.println("O valor convertido para quilogramas é: " + k);

		scan.close();

	}

}
