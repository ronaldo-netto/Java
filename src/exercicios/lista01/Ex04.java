package exercicios.lista01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
    // O programa lê um número real e, em seguida, imprime o quadrado do resultado desse número.

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número real: ");
		double real, quadrado;
		real = Double.parseDouble(scan.nextLine());
		quadrado = real * real;
		

		System.out.println(quadrado);

		scan.close();
	}

}
