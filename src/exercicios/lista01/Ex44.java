package exercicios.lista01;

import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int alturaD, alturaA, qtd;

		System.out.println("Digite a altura do degrau de uma escada:");
		alturaD = scan.nextInt();

		System.out.println("Digite a altura que você deseja alcançar:");
		alturaA = scan.nextInt();

		qtd = alturaA / alturaD;

		System.out.println("Você precisa subir " + qtd + " degraus.");

		scan.close();

	}

}
