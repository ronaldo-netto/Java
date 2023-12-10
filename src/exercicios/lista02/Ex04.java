package exercicios.lista02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		double numero, quadrado;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número real: ");
		numero = Double.parseDouble(scan.nextLine());

		quadrado = numero * numero;

		System.out.printf("O quadrado do número digitado é %.2f " , quadrado);

		scan.close();

	}

}
