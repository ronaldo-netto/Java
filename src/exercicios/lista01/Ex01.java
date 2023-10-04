package exercicios.lista01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	// O programa lê um número inteiro e, em seguida, imprime.

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = entrada.nextInt();

		System.out.println("O número digitado foi " + numero);

		entrada.close();

	}
}
