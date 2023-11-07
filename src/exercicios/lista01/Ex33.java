package exercicios.lista01;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int l, a;

		System.out.println("Digite o tamanho de um lado do quadrado: ");
		l = scan.nextInt();
		a = l * l;

		System.out.println("A área do quadrado é: " + a);

		scan.close();

	}

}
